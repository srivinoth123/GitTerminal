package com.restAssured.BDDStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	@Test
	public void getAllEmployees() {
		
		
		  RestAssured
		  .given()
		  .baseUri("http://localhost:3000/")
		  .when()
		  .get("employees") 
		  .prettyPrint();
		 
		
		/*
		 * RestAssured.baseURI="http://localhost:3000/"; RequestSpecification request =
		 * RestAssured.given().header(null).body(""); Response response =
		 * request.request(Method.GET,"employees");
		 * System.out.println(response.asPrettyString());
		 * System.out.println(response.statusLine());
		 */
		
		
		
	}
	

}
