package com.restAssured.BDDStyle;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JsonFileSerialization {
	
	@Test
	public void convertJavaObjectstoJson() {
		
		try {
		
		Map<Object, Object> jsonFile = new LinkedHashMap<Object, Object>();
		
		jsonFile.put("FirstName", "Srivatsan");
		jsonFile.put("LastName", "Vinoth");
		jsonFile.put("Email", "Srivatsan@gmail.com");
		jsonFile.put("Age", 9);
		
		List<Object> list = new ArrayList<Object>();
		
		list.add("Vedhesh");
		list.add("Navaneed");
		list.add("Mithun");
		
		jsonFile.put("Frients", list);
		
		FileWriter importFile = new FileWriter("JsonFile.json");
		importFile.write(jsonFile.toString());
		importFile.close();
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type", "application/json")
		.body(jsonFile)
		.log()
		.all()
		.when()
		.post("employees")
		.then()
		.log()
		.all();
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception:" + e);
			
		}
		
	}

}
