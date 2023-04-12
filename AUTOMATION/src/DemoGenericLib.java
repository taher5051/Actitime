import java.io.IOException;

import com.actitime.generic.filelib;

public class DemoGenericLib {

	public static void main(String[] args) throws IOException {
		filelib f=new filelib(); 
		String url = f.getpropertyfile("url");
		String un = f.getpropertyfile("username");
		String pwd = f.getpropertyfile("password");
		System.out.println(url+" "+un+" "+pwd);
		String data1 = f.getexcelfile("sheet1", 1, 0);
		String data2=f.getexcelfile("Sheet2", 1, 1);
		String data3=f.getexcelfile("sheet1", 1, 2);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		f.setExcelFile("sheet", 1, 3,"passd");
	}

}
