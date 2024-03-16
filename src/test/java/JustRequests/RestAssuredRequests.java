package JustRequests;

import Reqresin.dto.requestDto.RegisterUserDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static groovy.json.JsonOutput.toJson;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class RestAssuredRequests {
    public static String URL = "https://reqres.in/";
    @Test
    public void CreateUser(){
        RegisterUserDto user = new RegisterUserDto("eve.holt@reqres.in","pistol");
        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(URL + "api/register")
                .then().log().all()
                .extract().response();
        assertEquals(200, response.getStatusCode());
    }
}
