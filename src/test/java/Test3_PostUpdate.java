import io.restassured.RestAssured.*;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Test3_PostUpdate {

    @Test

    void Test1(){
        JSONObject request= new JSONObject();
        request.put("name", "Aydin");
        request.put("job", "QA");
        System.out.println(request);

        given().header("Content-type", "application/json").body(request.toString()).when()
                .put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
    }

}
