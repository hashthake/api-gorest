package in.co.gorest.products;

import in.co.gorest.model.UsersPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserWithPost extends TestBase {

    @Test
    public void updateUserWithPost() {

        UsersPojo usersPojo = new UsersPojo();
        usersPojo.setName("ron");
        usersPojo.setGender("Jira");
        usersPojo.setEmail("r1225@gmail.com");
        usersPojo.setStatus("active");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 5a08acd60a4f9f76dd28e583fa505a76eeaa98e3da1658ee53c924cac7b1d8d1")
                .body(usersPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}