package Reqresin;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.JSONObject;


public class RestAssuredHelper {
    public static Response RESPONSE;
    public static String BASE_URL = "https://reqres.in";
    public void RequestPostPathAndBody(String path, String body){
        RESPONSE = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(BASE_URL + path)
                .then().log().all()
                .extract().response();
    }
}
