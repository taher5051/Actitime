package qsp;

import java.util.HashMap;

public class DatadrivenTestingHashMap {

	public static void main(String[] args) {
    HashMap<String,String> map=new HashMap<>();
    map.put("url", "https://demo.actitime.com/");
    map.put("username", "Admin");
    map.put("email","actitime@gmail.com");
    map.put("passaword", "manager");
    System.out.println(map.get("passaword"));
	}

}
