import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPIDemo {

	public static void main(String[] args) {
		
		String url = "https://reqres.in/api/users/2";
		
		int myResponse;
		
		System.out.println("My Input URI is" +url);
		
		RestAssured.baseURI = url;
	
		RequestSpecification myHTTPSpec = RestAssured.given();
		
		Response res1 = myHTTPSpec.request(Method.GET);
		
		myResponse = res1.getStatusCode();
		
		System.out.println("The response from this URI is" +myResponse);

	}

}
