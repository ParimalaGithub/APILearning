//import org.json.simple.JSONObject;

import org.json.simple.JSONObject;

//import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import sun.jvm.hotspot.utilities.Assert;

public class TestAPIDemo3 {

	public static void main(String[] args) {
		
		String url = "https://reqres.in/api/login";
		
		int myResponse;
		
		System.out.println("My Input URI is " +url);
		
		
		RestAssured.baseURI = url;
	
		RequestSpecification request = RestAssured.given();
		
		Response res1 = request.request(Method.GET);
		
		myResponse = res1.getStatusCode();
		
		System.out.println("The response from this URI is " +myResponse);
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("email","eve.holt@reqres.in");
		//requestParams.put("password","cityslicka");
		request.body(requestParams.toJSONString());	
		Response res2 = request.request(Method.POST);
		int myResponse2 = res2.getStatusCode();
		
		System.out.println("The response from this URI is " +myResponse2);
		
		 
		
		 //System.out.println(myResponse2.asString());
		// Assert.assertEquals(statusCode, 200); 
		 
		 }
		
	}

