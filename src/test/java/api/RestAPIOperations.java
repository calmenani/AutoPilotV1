package api;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPIOperations {

	
	void getWeatherDetails() {
		/*
		 * //RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		 * //RestAssured.baseURI=
		 * "http://api.weatherstack.com/current?access_key=a2956bdd04bf2ef4f227b4469545458d&query=New%20York";
		 * RestAssured.baseURI=
		 * "https://v1.nocodeapi.com/mirage/ow/qXNZdyZOfUFOWDJo/byCityName?q=london?q=hyderabad";
		 * RequestSpecification request=RestAssured.given(); Response
		 * response=request.request(Method.GET,
		 * "https://v1.nocodeapi.com/mirage/ow/qXNZdyZOfUFOWDJo/byCityName?q=hyderabad")
		 * ; //WorkingResponse response=request.request(Method.GET,
		 * "https://v1.nocodeapi.com/mirage/ow/qXNZdyZOfUFOWDJo/byCityName?q=hyderabad")
		 * ; //Response response=request.request(Method.GET,"New York");
		 * System.out.println(response.getBody().asString()); int
		 * status=response.getStatusCode(); System.out.println("status"+status); String
		 * statusCode=response.getStatusLine();
		 * System.out.println("statusCode"+statusCode); Response response =
		 * request.queryParam("q", "Hyderabad,Ind") .queryParam("appid",
		 * "2b1fd2d7f77ccf1b7de9b441571b39b8") .get("/weather");
		 */
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city/";
		RequestSpecification request = RestAssured.given();
		Response response = request.request(Method.GET, "Hyderabad");
		String responseBody = response.getBody().asString();
		System.out.println("responseBody" + responseBody);
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),200);
		String responseLine = response.getStatusLine();
		System.out.println("responseLine"+responseLine);
		Assert.assertEquals(responseLine,"HTTP/1.1 200 OK");
	}


	public void AddRecords() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		requestParams.put("userId", "TestFirstName");
		requestParams.put("id", "12345678");
		requestParams.put("title", "TestFirstName");
		requestParams.put("body", "TestFirstName TestFirstName");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(requestParams.toJSONString());//Attach above data to request
		Response response = httprequest.request(Method.POST, "posts");
		String responseBody = response.getBody().asString();
		System.out.println("responseBody" + responseBody);
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),201);
		String userId = response.jsonPath().get("userId");
		System.out.println("userId "+userId);
		Assert.assertEquals(userId,"TestFirstName");

	}
	@Test
	public void findAllNearByRestaurants() {
		RestAssured.baseURI = "https://maps.googleapis.com";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET, "/maps/api/search/Restaurants/@17.5181267,78.3523036,14z/data=!3m1!4b1?hl=en");
		String responseBody = response.getBody().asString();
		System.out.println("responseBody***"+responseBody);
		

	}
}
