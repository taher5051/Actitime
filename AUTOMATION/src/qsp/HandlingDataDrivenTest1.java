package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingDataDrivenTest1 {

	public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
    Properties p=new Properties();
    p.load(fis);
    String ur = p.getProperty("url");
    p.getProperty("email");
    String un = p.getProperty("username");
    String ps = p.getProperty("password");
    //System.out.println(ur);
    System.out.println(un);
    //System.out.println(ps);
	}

}
