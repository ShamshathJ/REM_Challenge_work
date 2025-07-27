package week3Day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
@Test
public class GetIncident {
	
	public void getChange()
	{
		RestAssured.baseURI ="https://dev167407.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin", "D0p9pRZud-@T");
		Response response = RestAssured.get("Incident/7731a4ca47048610c4956958c26d438f");
		response.prettyPrint();
		
	}

}
