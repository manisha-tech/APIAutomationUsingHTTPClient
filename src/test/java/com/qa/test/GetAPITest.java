package com.qa.test;


import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase{
String url;
String serviceUrl;
String apiUrl;
RestClient restClient;
TestBase testBase;
		
	@BeforeMethod
	public void setUp()throws ClientProtocolException, IOException{
		testBase = new TestBase();
	    serviceUrl= prop.getProperty("URL");
	    apiUrl= prop.getProperty("serviceURL");
		url=serviceUrl+apiUrl;		
	}
	
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException{
		RestClient restClient=new RestClient();
		restClient.get(url);
	}
	
	
	
	

}
