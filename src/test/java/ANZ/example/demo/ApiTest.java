package ANZ.example.demo;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

class ApiTest {

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	public void StatusCheck() {
		RestAssured.baseURI="http://localhost:8080/api";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/cities");
		int statusCode = response.getStatusCode();
		//System.out.println(statusCode);
		
		System.out.println(response.getBody());
		}
	
	@Test
	public void cities_Status_Code_is_200() {
		given();
		RestAssured.get("cities").then().statusCode(200);
	}

	@Test
	public void cities_DTO_status_Code_is_200() {
		given();
		RestAssured.get("citiesDTO").then().statusCode(200);
	}
	
	@Test
	public void server_Not_Found_404() {
		given();
		RestAssured.get("Server_Not_Found").then().statusCode(404);
	}
	
	@Test
	public void cities_Application_Type_Is_Json() {
		given();
		RestAssured.get("cities").then().contentType("Application/json");
	}
	
	@Test
	public void citiesDTO_Application_Type_Is_Json() {
		given();
		RestAssured.get("citiesDTO").then().contentType("Application/json");
	}
	
//	@Test
//	public void that_ID_Returned_Is_Cities() {
//		given();
//		RestAssured.get("cities").then().body("id", equals("cities"));
//	}
	
	
	

}
