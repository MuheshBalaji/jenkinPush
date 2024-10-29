package com.comcast.GenricUtilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class fileUtility {
	
	
	public String getdatafromfile(String key) throws Throwable {
		FileInputStream fis= new FileInputStream("./test data/jenkindata.properties");
		Properties po= new Properties();
		po.load(fis);
		String data = po.getProperty(key);
		return data;
		
	}

}
