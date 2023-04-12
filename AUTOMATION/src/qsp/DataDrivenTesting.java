package qsp;

import java.util.ArrayList;

public class DataDrivenTesting {

	public static void main(String[] args) {
    ArrayList<String> al=new ArrayList<>();
    al.add("https://demo.actitime.com/");
    al.add("actitime@gmail.com");
    al.add("Admin");
    al.add("Manager");
    String text = al.get(2);
    System.out.println(text);
	}

}
