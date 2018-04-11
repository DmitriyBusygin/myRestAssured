package REST;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateIssueTest {

    @Test
    public void makeSureThatGoogleIsUp() {
        System.out.print("СТАРТ ТЕСТА");
        given().when().get("http://www.google.com").then().statusCode(200);
        System.out.print("КОНЕЦ ТЕСТА");

    }
}
