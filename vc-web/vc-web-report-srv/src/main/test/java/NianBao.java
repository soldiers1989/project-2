import com.ccclubs.sdk.protocol.gb.entity.GBMessage;
import com.ccclubs.sdk.protocol.gb.util.Tools;

import java.util.Date;

public class NianBao {


    public static void main(String[] args) {


        byte[] bytes=Tools.HexString2Bytes("232303014c4a38453343314d3048443331343033370100061206030a170442232303014c4a38453343314d3048443331343033370100061206030a18125b232303014c4a38453343314d3048443331343033370100061206030a18125b");
        System.out.println("len="+bytes.length);

    }
}
