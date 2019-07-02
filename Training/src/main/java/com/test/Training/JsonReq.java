package com.test.Training;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
public class JsonReq {


		public static void main(String[] args) throws Exception {
			final String POST_PARAMS = "{\n" + "\"FirstName\":\" Vino11\",\r\n" +
			      "    \"LastName\": \"Kumar11\",\r\n" +
			        "    \"UserName\": \"UserVino11\",\r\n" +
			        "     \"Email\" : \"viinoth1evinothtno@xyz.com\", \r\n" +
			        "    \"Password\": \"tester\"" + "\n}";
			    System.out.println(POST_PARAMS);
			    URL obj = new URL("http://restapi.demoqa.com/customer/register");
			    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
			    postConnection.setRequestMethod("POST");
			    
			    postConnection.setRequestProperty("Content-Type", "application/json");
			    postConnection.setDoOutput(true);
			    OutputStream os = postConnection.getOutputStream();
			    os.write(POST_PARAMS.getBytes());
			    os.flush();
			    os.close();
			    int responseCode = postConnection.getResponseCode();
			    System.out.println("POST Response Code :  " + responseCode);
			    if (responseCode != HttpURLConnection.HTTP_INTERNAL_ERROR) { //success
				    System.out.println("POST Response Message : " + postConnection.getResponseMessage());

			        BufferedReader in = new BufferedReader(new InputStreamReader(
			            postConnection.getInputStream()));
			        String inputLine;
			        StringBuffer response = new StringBuffer();
			        while ((inputLine = in .readLine()) != null) {
			            response.append(inputLine + "\n");
			        } in .close();
			        // print result
			        System.out.println(response.toString());
			    } else {
			        System.out.println("POST NOT WORKED");
			    }
			}}