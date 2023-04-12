package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HanglingDataDriventest {

	public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\MSP\\Desktop\\commondata.property.txt");
		Properties P = new Properties();
		P.load(fis);
	
		String un = P.getProperty("username");
		String pw = P.getProperty("password");
		
		
		System.out.println(un);
		System.out.println(pw);
		System.out.println(ur);
	}

}
