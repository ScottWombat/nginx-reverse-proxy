package org.myapps.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EndpointTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/demo")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}