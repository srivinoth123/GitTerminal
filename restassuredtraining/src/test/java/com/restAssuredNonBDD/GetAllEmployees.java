package com.restAssuredNonBDD;

import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {
	
	
	@Test
	public void getAllEmployee() {
		
		try {
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification specification =  RestAssured.given();
		
		Response response = specification.request(Method.GET, "employees");
		
		System.out.println(response.asPrettyString());
		
		int statusCode = response.getStatusCode();
		
		if(statusCode==200) {
			
			System.out.println("Verify status code:" + statusCode );
		}else {
			System.out.println("Not getting 200 status code");
		}	
		
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Getting exception:" + e);
			
		}
	}

}


