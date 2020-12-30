package Employee;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

 

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	 @Test
	    public void PostEmployee() {
	        RestAssured.baseURI = "http://localhost:3000/employees/";
	        RequestSpecification request = RestAssured.given().contentType("application/json");
	    
	        JSONObject requestParams = new JSONObject();
	        requestParams.put("first_name", "PUTEMPLOYEE"); 
	        requestParams.put("last_name", "PUTEMPLOYEE");
	        requestParams.put( "email",  "PUTEMPLOYEE@gmail.com");
	        request.body(requestParams.toJSONString());
	        Response response = request.put("8");
	    
	        Assert.assertEquals(200, response.statusCode());
	    }
}
