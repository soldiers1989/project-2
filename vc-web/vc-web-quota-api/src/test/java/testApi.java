import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testApi {



    @Test
    public  void test(){

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://118.31.113.31:7005/report/page/v1");

        httpPost.setHeader("Content-Type", "application/json");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Object> list = new ArrayList<Object>();
        map.put("account", "admin");
        map.put("password", "8856bf47e1de7307");

        list.add(map);
        String ss = JSON.toJSONString(list);
        String value = DigestUtils.md5Hex(JSON.toJSONString(list));
        String sign = HmacUtils.hmacSha1Hex("fa@sd_n38f2f_3qb", value);
        httpPost.addHeader("sign", sign);
        httpPost.addHeader("appId", "1000005");
        httpPost.setEntity(new StringEntity(ss, "UTF-8"));
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
            // System.out.println(response.getStatusLine());
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            if (statusCode == 200) {
                HttpEntity entity = response.getEntity();
                String s2 = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
                System.out.println(s2);
                EntityUtils.consume(entity);
            } else {
                System.out.println("系统错误，请联系管理员！！！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}



