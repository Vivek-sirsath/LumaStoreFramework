package com.lumastore.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	String path = "E:\\EDUCATIONAL\\Software Testing\\AUTOMATION TESTING\\LocalGitDirectory\\LumaStoreFramework\\LumaStoreFramework\\Configuration\\config.properties";
	
	public ReadConfig() {
		
		try {
		properties = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
		
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
		
		String valueUrl = properties.getProperty("baseUrl");
		
		if(valueUrl!=null) 
			return valueUrl;
		else 
			throw new RuntimeException("url not specified in config file");
	}
	
    public String getBrowser() {
		
		String valueBrowser = properties.getProperty("browser");
		
		if(valueBrowser!=null) 
			return valueBrowser;
		else 
			throw new RuntimeException("browser not specified in config file");
	}
    
    public String getEmail() {
		
		String emailValue = properties.getProperty("email");
		
		if(emailValue!=null) 
			return emailValue;
		else 
			throw new RuntimeException("email not specified in config file");
	}
    
 public String getPassword() {
		
		String passValue = properties.getProperty("password");
		
		if(passValue!=null) 
			return passValue;
		else 
			throw new RuntimeException("email not specified in config file");
	}
}
