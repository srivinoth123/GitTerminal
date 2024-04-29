package com.restAssuredNonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	@Test
	public void deleteAnEmployee() {

		try {
			RestAssured.baseURI= "http://localhost:3000/";

			RequestSpecification specification = RestAssured.given();

			Response response = specification.request(Method.DELETE,"employees/e9d6");
			System.out.println(response);
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);

			if(!equals(response.getStatusCode())){
				System.out.println("Get the correct status code:" + statusCode);
				
			}else {
				System.out.println("Status code is wrong");
			}

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception:" + e);
		}
	}

}
