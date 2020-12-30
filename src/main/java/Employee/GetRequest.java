package Employee;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequest {

    
	    @Test
	    public void GetAllEmployees() {
	         RestAssured.baseURI = "http://localhost:3000/employees/";
	         
	         
	         RequestSpecification httpRequest = RestAssured.given();
	         RestAssured.given().contentType("application/json\r\n");
	        
	         Response response = httpRequest.get();
	         
	        
	        // System.out.println("Response Body is =>  " + response.asString());
	         Assert.assertEquals(200, response.statusCode());
	         Assert.assertTrue(response.body().asString().contains("Sebastian"));
	    }
	    
	    @Test
	    public void GetEmployee() {
	         RestAssured.baseURI = "http://localhost:3000/employees/1";
	         
	        
	         RequestSpecification httpRequest = RestAssured.given();
	         
	    
	         Response response = httpRequest.get();
	         
	        
	         //ystem.out.println("Response Body is =>  " + response.asString());
	         Assert.assertEquals(200, response.statusCode());
	         Assert.assertTrue(response.body().asString().contains("Sebastian"));
	    }

	 

	}


