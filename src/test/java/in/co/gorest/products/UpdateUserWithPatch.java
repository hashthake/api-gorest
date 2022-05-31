package in.co.gorest.products;

import in.co.gorest.model.UsersPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserWithPatch extends TestBase {

    @Test
    public void updateStudentWithPatch() {

        UsersPojo usersPojo = new UsersPojo();
        usersPojo.setName("Jisu");
        usersPojo.setEmail("jisu123@gmail.com");
        usersPojo.setStatus("active");
        usersPojo.setGender("male");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 5a08acd60a4f9f76dd28e583fa505a76eeaa98e3da1658ee53c924cac7b1d8d1")
                .body(usersPojo)
                .pathParams("id", 3830)
                .when()
                .patch("/{/id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}