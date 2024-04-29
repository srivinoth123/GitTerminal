package com.restAssured.BDDStyle;

import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateAnEmployee1Pojo {

	public static void main(String[] args) {

		try {
			
		CreateAnEmployeePojo pojo = new CreateAnEmployeePojo();
		
		pojo.setFirstName("Srivatsan");
		pojo.setLastName("Vinoth");
		pojo.setAge(9);
		pojo.setEmail("Srivatsan@gmail.com");
		pojo.setFrients(Arrays.asList("Navaneed","Vedhesh","Mithun"));
		
		
		  System.out.println(pojo.getFirstName());
		  System.out.println(pojo.getLastName()); 
		  System.out.println(pojo.getAge());
		  System.out.println(pojo.getEmail()); 
		  System.out.println(pojo.getFrients());
		 
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonFile = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		System.out.println(jsonFile);
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Getting exception:" + e);
			
		}

	}

}
