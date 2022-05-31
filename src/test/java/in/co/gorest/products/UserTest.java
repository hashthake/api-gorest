package in.co.gorest.products;

import in.co.gorest.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserTest extends TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2";

    }
    @Test
    public void deleteId(){

        Response response = given()
                .pathParams("id", 16)
                .when()
                .delete("/{users}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
    @Test
    public void getAllStudentsInfo() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void getSingleStudentInfo() {
        Response response = given()
                .pathParams("id", 3230)
                .when()
                .get("/{/users}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
