package com.test.Training;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

public class apiTesting {

	
	
	
	@Test
	public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
	  throws ClientProtocolException, IOException {
	  
	   // Given
	   String name = RandomStringUtils.randomAlphabetic( 8 );
	   HttpUriRequest request = new HttpGet( "https://api.github.com/users/" + name );
	 
	   // When
	   HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	 
	/* 
	   assertThat(
	     httpResponse.getStatusLine().getStatusCode(),
	     equals(HttpStatus.SC_NOT_FOUND));*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
