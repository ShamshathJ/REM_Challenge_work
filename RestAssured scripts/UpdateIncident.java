package week3Day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident {
	@Test
	public void req()
	{
		RestAssured.baseURI ="https://dev167407.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin","D0p9pRZud-@T");
		RequestSpecification inputrequest =RestAssured.given().contentType("application/json")
				.when().body("{\r\n"
						+ "    \"description\": \"Laptop issue\",\r\n"
						+ "    \"short_description\": \"Laptop flip switch is on\"\r\n"
						+ "}");
		
		
		
		Response response = inputrequest.put("incident/95d7248247448610c4956958c26d43c1");
		response.prettyPrint();
		
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
	}
	

}
