package Employee;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	 @Test
	    public void DeleteEmployee() {
	        RestAssured.baseURI = "http://localhost:3000/employees/";
	        RequestSpecification request = RestAssured.given().contentType("application/json");
	    

	        Response response = request.delete("15");
	        
	        
	 }
}
