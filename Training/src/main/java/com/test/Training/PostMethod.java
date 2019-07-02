package com.test.Training;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class PostMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		PostMethod http = new PostMethod();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		http.sendPost();
		
	}
	
	private void sendGet() throws Exception {
String url = "https://jsonplaceholder.typicode.com/todos/1";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		//con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine+ "\n");
		}
		in.close();

		//print result
		System.out.println(response.toString());	

	}
	
	private void sendPost() throws Exception {

		String url = "https://jsonplaceholder.typicode.com/comments?";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		
	

		String urlParameters = "postId=6";
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) { 
			response.append(inputLine + "\n");
		}
		
		in.close();
		
		//print result
		System.out.println(response.toString());
		
		

	}

}
	
	
	
	
	

	
   

	

