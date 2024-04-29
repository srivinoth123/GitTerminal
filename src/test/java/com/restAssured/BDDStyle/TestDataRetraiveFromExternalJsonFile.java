package com.restAssured.BDDStyle;

import java.io.FileInputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestDataRetraiveFromExternalJsonFile {

	@Test
	public void externaljson() {
		try {
			FileInputStream stream = new FileInputStream
					("C:/Users/svinu/Desktop/Vinoth Documents/RestAssured/records.json");
			RestAssured
			.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body(stream)
			.when()
			.post("employees")
			.prettyPrint();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception: " + e);

		}

	}

}
