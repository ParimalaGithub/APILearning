//import org.json.simple.JSONObject;

//import org.json.simple.JSONObject;

//import org.json.JSONObject;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPIDemo2 {

	public static void main(String[] args) {
		
		String url = "https://reqres.in/api/login";
		
		int myResponse;
		
		System.out.println("My Input URI is " +url);
		
		
		RestAssured.baseURI = url;
	
		RequestSpecification myHTTPSpec = RestAssured.given();
		
		Response res1 = myHTTPSpec.request(Method.GET);
		
		myResponse = res1.getStatusCode();
		
		System.out.println("The response from this URI is " +myResponse);
				
		JSONObject uData = new JSONObject();
		
		uData.put("email","eve.holt@reqres.in");
		//uData.put("password","cityslicka");
		myHTTPSpec.body(uData.toJSONString());	
		
		Response res2 = myHTTPSpec.request(Method.POST);
		int myResponse2 = res2.getStatusCode();
		
		System.out.println("The response from this URI is " +myResponse2);
	}

}
