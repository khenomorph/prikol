package videogamesDB;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestGetGame {

    @Test
    public void checkGamesPositive(){
        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept", "application/json")
        .when()
                .get("/app/videogames/3");

        GameModel gameModel = response.as(GameModel.class);
        Assert.assertTrue(gameModel.id == 3);
        Assert.assertFalse(gameModel.category.equals("Action"));
        Assert.assertTrue(gameModel.name.equals("Tetris"));
        Assert.assertTrue(gameModel.rating.equals("Universal"));
        Assert.assertTrue(gameModel.releaseDate.equals("1984-06-25"));
        Assert.assertFalse(gameModel.reviewScore < 45);
    }
}
