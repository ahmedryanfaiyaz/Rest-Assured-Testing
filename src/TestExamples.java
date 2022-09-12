import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class TestExamples {
    @Test
    void test_01() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        System.out.println(response.asString());
        System.out.println(response.asString());

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 500);
    }

    @Test
    void test_02() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=1");

        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        System.out.println(response.asString());
        System.out.println(response.asString());

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }

    @Test
    void test_03() {
        given().
                param("x","y").
        when().
                get("https://reqres.in/api/users?page=1").
        then().
                statusCode(200);

    }
}
