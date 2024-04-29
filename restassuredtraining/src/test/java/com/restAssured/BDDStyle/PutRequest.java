package com.restAssured.BDDStyle;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PutRequest {

	@Test
	public void updateAnEmployee() {
		try {
			given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "\"firstname\": \"parvathy\",\r\n"
					+ " \"lastName\": \"sivan\",\r\n"
					+ "  \"email\": \"parvathy@gmail.com\"\r\n"
					+ "\r\n"
					+ "}")
			.when()
			.put("employees/d8ee")
			.prettyPrint();

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception: " + e);
		}
	}

}
