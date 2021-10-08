import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test4_Patch_Update {

    @Test

    void Test1() {
        JSONObject request = new JSONObject();
        request.put("name", "Rustem");
        request.put("job", "SDET");
        System.out.println(request);

        given().header("Content-type", "application/json").body(request.toString()).when()
                .patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
    }
}
