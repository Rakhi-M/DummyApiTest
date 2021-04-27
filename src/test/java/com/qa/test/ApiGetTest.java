package com.qa.test;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiGetTest {
	
	@Test
	public void verifyGetStatusCode() {
		
		
			
		RestAssured.given()
		.baseUri("http://dummy.restapiexample.com/api/v1/employee/1")
		.when().
		get()
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
		
		
		
 
	}
	
	@Test
	public void verifyEmployeeName() {
		
		
		
		RestAssured.given()
		.baseUri("http://dummy.restapiexample.com/api/v1/employee/1")
		.when().
		get()
		.then()
		.body("data.employee_name",Matchers.equalTo("Tiger Nixon"));
		
		
		
 
	}
	

}
