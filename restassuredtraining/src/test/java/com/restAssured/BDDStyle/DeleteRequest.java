package com.restAssured.BDDStyle;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequest {
	
	@Test
	public void deleteAnEmployee() {
		
		try {
		given()
		.baseUri("http://localhost:3000/")
		.when()
		.delete("employees/d8ee")
		.prettyPrint();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception: " + e);
			
		}
		
	}

}
