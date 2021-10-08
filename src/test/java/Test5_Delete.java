import io.restassured.RestAssured.*;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Test5_Delete {

    @Test
    void test1(){

        when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
    }


}
