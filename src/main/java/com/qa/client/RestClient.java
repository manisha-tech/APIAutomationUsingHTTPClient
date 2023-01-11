package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

		
		//1. GET Method
			public void get(String url) throws ClientProtocolException, IOException{
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(url); //http get request
			CloseableHttpResponse closebaleHttpResponse =  httpClient.execute(httpget); //hit the GET URL

	    //a. Status code:
			int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
			System.out.println("Status Code--->" + statusCode);
			
		//b. Json string:
			String responseString = EntityUtils.toString((HttpEntity) closebaleHttpResponse.getEntity(),"UTF-8");
			JSONObject responseJson=new JSONObject(responseString);
			System.out.println("Response JSON from API--->" + responseJson);
			
		//c. All headers
			Header [] headersArray= closebaleHttpResponse.getAllHeaders();
			HashMap<String,String>  allHeaders= new HashMap<String,String>();
			for(Header header:headersArray) {
				allHeaders.put(header.getName(),header.getValue());
			
			}
			System.out.println("Headers Array--->" + allHeaders);

			}

}
