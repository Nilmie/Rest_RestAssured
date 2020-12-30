package Employee;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

 

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequest {
	@Test
    public void PostEmployee() {
        RestAssured.baseURI = "http://localhost:3000/employees/";
        RequestSpecification request = RestAssured.given().contentType("application/json");
    
        JSONObject requestParams = new JSONObject();
        requestParams.put("first_name", "Virender1"); 
        requestParams.put("last_name", "Singh1");
        requestParams.put("email",  "someuser@gmail.com1");
        request.body(requestParams.toJSONString());
        Response response = request.post();
    
        Assert.assertEquals(201, response.statusCode());
    }
}
