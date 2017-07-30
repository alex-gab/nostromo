package com.alex.nostromo.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NostromoApplicationIT {
    @LocalServerPort
    int port;

    @Test
    public void givenGameEndpointWhenItIsCalledThenCorrectGameIsReturned() {
        given().port(port).
                when().get("/game").
                then().statusCode(200).body("name", is(equalTo("Uncharted: Golden Abyss")));
    }

}
