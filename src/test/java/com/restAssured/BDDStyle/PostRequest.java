package com.restAssured.BDDStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequest {
	
	@Test
	public void createAnEmployee() {
		try {
		RestAssured.
		given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"firstname\": \"ganapathy\",\r\n"
				+ " \"lastName\": \"sivan\",\r\n"
				+ "  \"email\": \"ganapathy@gmail.com\"\r\n"
				+ "\r\n"
				+ "}")
		.when()
		.post("employees")
		.prettyPrint();
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception:" + e);
			
		}
	}

}
