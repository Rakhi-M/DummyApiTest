package com.qa.test;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiDeleteTest {
	
	@Test
	public void verifyDeleteStatusCode() {
		
		
			
		RestAssured.given()
		.baseUri("http://dummy.restapiexample.com/api/v1")
		.when().delete("/delete/1")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
		
		
		
 
	}
	
	@Test
	public void verifyDeleteMessage() {
		
		
		
		RestAssured.given()
		.baseUri("http://dummy.restapiexample.com/api/v1/delete/1")
		.when().
		delete()
		.then()
		.body("message",Matchers.equalTo("Successfully! Record has been deleted"));
		
		
		
 
	}
	

}
