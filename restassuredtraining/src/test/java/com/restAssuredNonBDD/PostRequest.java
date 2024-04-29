package com.restAssuredNonBDD;

import org.testng.annotations.Test;

import io.opentelemetry.api.trace.StatusCode;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest{

	@Test
	public void createAnResource() {

		try {

			RestAssured.baseURI = "http://localhost:3000/";

			RequestSpecification specification = RestAssured.given()
					.header("Content-Type","application/json").body("{\r\n"
							+ "\"firstname\": \"muruga\",\r\n"
							+ " \"lastName\": \"sivan\",\r\n"
							+ "  \"email\": \"muruga@gmail.com\"\r\n"
							+ "\r\n"
							+ "}");
			Response response = specification.request(Method.POST, "employees");

			System.out.println(response.asPrettyString());
			System.out.println(response.statusLine());


		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception:" + e);

		}


	}



}


