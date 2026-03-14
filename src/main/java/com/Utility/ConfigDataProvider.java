package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;
	public ConfigDataProvider() throws IOException {
    String path="C:\\Users\\rohit\\eclipse-workspace\\Automation_Project1_Feb_26\\Config\\Config.Properties";
	FileInputStream fis=new FileInputStream(path);
	
	prop=new Properties();
	prop.load(fis);
	
}
	public String getBaseUrl_stage() {
		 return prop.getProperty("BaseUrl_stage");
	}
}
	
