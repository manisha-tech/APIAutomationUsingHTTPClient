package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public Properties prop;
	
	public TestBase(){	
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\RestAPI_Testing\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		FileInputStream file;                     //using FileInputStream class to base class read data from any file
//		try {
//			file = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\RestAPI_Testing\\src\\main\\java\\com\\qa\\config\\config.properties");
//			prop.load(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException a) {
//			a.printStackTrace();
//		}
//		
//
//	}
}
	}
