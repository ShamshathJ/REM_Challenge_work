package week3Day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateChangeReq {
	@Test
	public void req()
	{
		RestAssured.baseURI ="https://dev167407.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin","D0p9pRZud-@T");
		RequestSpecification change =RestAssured.given().contentType("application/json")
				.when().body("{\r\n"
						+ "    \"description\": \"Laptop issue\",\r\n"
						+ "    \"short_description\": \"Laptop flip switch is off\"\r\n"
						+ "}");
		
		Response response = change.post("change_request");
		response.prettyPrint();
	}
	

}
