package com.restAssuredNonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	
	@Test
public void updateAnEmployee() {
	
	try{RestAssured.baseURI= "http://localhost:3000/";
	
	RequestSpecification specification = RestAssured.given()
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "\"firstname\": \"sathish\",\r\n"
					+ " \"lastName\": \"seetharaman\",\r\n"
					+ "  \"email\": \"sathish@gmail.com\"\r\n"
					+ "\r\n"
					+ "}");
	Response response = specification.request(Method.PUT,"employees/a68f");
	
	System.out.println(response.asPrettyString());
	int statusCode = response.statusCode();
	
	if(!response.equals(statusCode)) {
		System.out.println("Status code is correct:" + statusCode);
	}else {
		System.out.println("Status code is wrong");
	}
	
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Getting exception: " + e);
	}
	
	
}
	

}
