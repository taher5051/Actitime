package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLibrary {

	public String getpropertydata1(String key) throws IOException {
    FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
    Properties p=new  Properties();
    p.load(fis);
    String data = p.getProperty(key);
    return data;
	}

}
