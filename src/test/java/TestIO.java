import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIO {

    @Test
    public void testIO(){
        File file = new File("/Users/mazexiang/Workspace/Github/InsideJavaWeb1103/pom.xml");

        FileReader f ;
        try {
            StringBuilder str = new StringBuilder("");
            char[] c = new char[20];
            f= new FileReader(file);

            while (f.read(c,0,20)>0){
                str.append(c);

            }
            System.out.println(str.toString());


        }catch (IOException e ){
            e.printStackTrace();
        }

    }

    @Test
    public void testInetAddress(){
        try {
            InetAddress address = InetAddress.getByName("localhost");
            System.out.println(address.toString());
            InetAddress address1 = InetAddress.getLocalHost();
            System.out.printf("===============>address1 值" + address1.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


}
