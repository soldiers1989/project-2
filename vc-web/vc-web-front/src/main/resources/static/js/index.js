$(function () {
    $.getScript("/js/tpui-core.js", function (data, status, jqxhr) {
        var vote = {};
        $.extend(vote, {
            init: function () {

                var userid = cookieUtil.get("userId");
                var token = cookieUtil.get("token");
                var userName = cookieUtil.get("userName");
                if (typeof(token) === "undefined" || token === "" || typeof(userid) === "undefined" || userid === "") {
                    toLogin();
                }

                this.events();
                this.ajaxInfo();
                $(".account").html("您好 ," + userName);
                this.menuNav = {};
                this.menuNav.firstNav = [];//这个放所有一级菜单
                this.menuNav.secondNav = [];//这个放所有的二级菜单
                this.menuNav.thirdNav = [];//这个放所有的三级菜单
                this.menuNav.arr = [];//这个放所有的一级对应的二三级菜单
                this.index = 0;
            },
            events: function () {
                $('#wrapper').on('click', '.select-btn',
                    $.proxy(this.onemenulevel, this))
                    .on('click', '.one', $.proxy(this.twomenulevel, this))
                    .on('click', '.J_menuItem', $.proxy(this.middleView, this))
                    .on('mouseover', '.account', $.proxy(this.isShow, this))
                    .on('click', '.log-out', $.proxy(this.logOut, this))
                    .on('click', '.userInfo', $.proxy(this.popInfo, this))
                    .on('click', '.content-info-hide', $.proxy(this.hideInfo, this))
                    .on('click', '.reset-password', $.proxy(this.resetPassword, this))
            },
            ajaxInfo: function () {
                var that = this;
                $.ajax({
                    type: 'post',
                    url: getServUrl('/oauth/getUserLimit'),
                    async: true,
                    data: JSON.stringify({userid: cookieUtil.get("userId")}),
                    dataType: "json",
                    contentType: 'application/json',
                    beforeSend: function (xhr) {
                        var token = cookieUtil.get("token");
                        xhr.setRequestHeader("Authorization", token);
                    },
                    success: function (data) {
                        if (data.code == "20006") {
                            layer.msg('登录已失效', function () {
                                toLogin();
                            });
                        }
                        if (data && data.data && data.data.projects) {
                            $.each(data.data.projects, function (k, v) {
                                if (v.spParentId == 0) {
                                    that.menuNav.firstNav.push(v);
                                }
                                //筛选出二级菜单
                                $.each(that.menuNav.firstNav, function (k1, v1) {
                                    if (v.spParentId == v1.spId) {
                                        that.menuNav.secondNav.push(v);
                                        return false;//跳出内层循环
                                    }
                                })
                                //筛选出三级菜单
                                $.each(that.menuNav.secondNav, function (k2, v2) {
                                    if (v.spParentId == v2.spId) {
                                        that.menuNav.thirdNav.push(v);
                                        return false;//跳出内层循环
                                    }
                                })
                            });

                            $.each(that.menuNav.firstNav, function (k0, v0) {
                                v0.thirdarr = [];
                                $.each(that.menuNav.secondNav, function (k1, v1) {
                                    if (v1.spParentId === v0.spId) {
                                        v0.thirdarr.push(v1);
                                    }
                                });
                                that.menuNav.arr.push(v0);
                            });

                            var template = $('#leftNav').html();
                            Mustache.parse(template);
                            var skin_rendered = Mustache.render(template, that.menuNav);
                            $('.leftnav').append(skin_rendered);
                            $('#side-menu').metisMenu();
                        }
                    }
                });
            },
            onemenulevel: function () {
                var that = this;
                $('.select-wrap').show(function () {
                    $('body').click(function () {
                        $('.select-wrap').hide(function () {
                            $('body').unbind('click')
                        })
                    })
                })
                if (that.menuNav && that.menuNav.firstNav && that.menuNav.firstNav[0]) {
                    $('.select-wrap').empty();
                    var template = $('#firstNav').html();
                    Mustache.parse(template);
                    var skin_rendered = Mustache.render(template, that.menuNav);
                    $('.select-wrap').append(skin_rendered);
                }
            },
            twomenulevel: function (event) {
                var that = this;
                $('.two').remove()
                $('.select-wrap').hide();
                that.menuNav.arr = [];
                $('.onemenu-wrap').toggleClass('hide');
                $('.select span').html($(event.target)[0].innerHTML)
                var id = $(event.target)[0].attributes[1].nodeValue;

                //筛选出当前点击的一级菜单的二级菜单
                $.each(that.menuNav.secondNav, function (k, v) {
                    if (v.spParentId == id) {
                        v.thirdarr = [];
                        v.index = that.index;
                        that.index++;
                        that.menuNav.arr.push(v)
                    }
                })
                //筛选出二级菜单的三级菜单
                $.each(that.menuNav.thirdNav, function (k, v) {
                    $.each(that.menuNav.arr, function (k1, v1) {
                        if (v1.spId == v.spParentId) {
                            v.index = k;
                            v1.thirdarr.push(v);
                        }
                    })
                })
                $.each(that.menuNav.arr, function (k2, v2) {
                    if (v2.thirdarr && v2.thirdarr[0]) {
                        v2.arrows = true;
                    }
                })

                var template = $('#leftNav').html();
                Mustache.parse(template);
                var skin_rendered = Mustache.render(template, that.menuNav);
                $('.leftnav').append(skin_rendered);
                $('#side-menu').metisMenu();
            },
            middleView: function (event) {
                var that = this;
                $('#content-main .J_iframe').hide()
                var index = $(event.target)[0].attributes[1].nodeValue,
                    url = $(event.target)[0].attributes[3].nodeValue;
                var iframe = $('<iframe class="J_iframe" name="iframe' + index
                    + '" width="100%" height="100%" src="' + url
                    + '" frameborder="0" data-id="' + url
                    + '" seamless></iframe>').appendTo($('#content-main'));
            },
            isShow: function () {
                $('.username').mouseover(function () {
                    $('.account-msg').removeClass('hide')
                })
                $('.username').mouseout(function () {
                    $('.account-msg').addClass('hide')
                })
            },
            logOut: function () {
                $('.account-msg').addClass('hide')
                cookieUtil.unset("token", '');
                cookieUtil.unset("userId", '');
                toLogin();
            },
            hideInfo: function () {
                $('.content-info-hide').parent().removeClass('pop');
            },
            popInfo: function () {
                $('.userInfo').parent().addClass('hide').removeClass('show');//隐藏消息
                $('.content-info').addClass('pop');//弹出消息详细内容
            },
            resetPassword: function () {
                $('.mix-password-wrap').show(function () {
                    $('.sure').click(function () {
                        var oldpass = $('.oldpass').val()
                        var newpass = $('.newpass').val()
                        var Rnewpass = $('.Rnewpass').val()
                        if (newpass === Rnewpass) {
                            var Jsondata = {
                                userId: cookieUtil.get("userId"),
                                oldPass: oldpass,
                                newPass: newpass
                            }
                            $.ajax({
                                type: 'post',
                                url: getServUrl('/oauth/user/editPassword'),
                                async: true,
                                dataType: 'json',
                                contentType: 'application/json',
                                data: JSON.stringify(Jsondata),
                                beforeSend: function (xhr) {
                                    var token = cookieUtil.get("token");
                                    xhr.setRequestHeader("Authorization", token);
                                },
                                success: function (data) {
                                    alert(data.message)
                                    if (data.success == true) {
                                        window.location.href = authUrl;
                                    }
                                }
                            });
                        } else {
                            alert('两次输入的密码不一样')
                        }
                    })
                })
            }
        });
        vote.init();

        (function () {
            var url = window.location.href;
            if (url.indexOf("?") != -1) {

                var userId = getQueryString("userId");
                var token = getQueryString("access_token");
                var userName = getQueryString("userName");
                if (userId != "" && token != "" && userName != "") {
                    cookieUtil.set("token", token, cookieUtil.setTime("10000s"));
                    cookieUtil.set("userId", userId, cookieUtil.setTime("10000s"));
                    cookieUtil.set("userName", userName, cookieUtil.setTime("10000s"));
                    window.location.href = "index.html";
                }
            }

            var userId = cookieUtil.get("userId");
            if (userId == "") {
                toLogin();
            }
        })();
    });
});
