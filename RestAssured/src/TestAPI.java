import org.json.JSONArray;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String endpointURL= "https://reqres.in/api/register";
		String serviceName = findService(endpointURL);
		Response response;
		System.out.println("\n******************Starting Service #### "+ serviceName + "####****************************");

		response = given().baseUri(endpointURL).header("api-key", apiKey).queryParam("studentId", params).get();
		response = given().baseUri(endpointURL).header("api-key", apiKey).get(params);
		System.out.println("Response: "+ response.asString());

		int statusCode = response.getStatusCode();

		System.out.println("Status Code : " +statusCode + "; Service Name : "+serviceName);

		String infoNode = "result";

		if (statusCode == 200) {
			//	responseSize = response.jsonPath().get("result.size()");
			//System.out.println("response size : "+ responseSize);

			JSONObject jsonObject = new JSONObject(response.getBody().asString());
			//Object resultNode = jsonObject.get("result");
			Object resultNode = response.jsonPath().get("result"); 
			System.out.println("resultNode " + resultNode);

	}

}
}
