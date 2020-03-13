package net.lucamasini.testcase;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {

        HttpServletRequest request = mock(HttpServletRequest.class);

        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}