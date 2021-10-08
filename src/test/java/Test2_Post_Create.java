import io.restassured.RestAssured.*;
import org.json.JSONObject;
import org.testng.annotations.Test;

import javax.xml.crypto.dsig.XMLObject;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.*;

public class Test2_Post_Create {

    @Test
            void Test1(){
//
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("name", "Aydin");
//        map.put("job", "Tester");
//        System.out.println(map);

        JSONObject request= new JSONObject();
        request.put("name", "Aydin");
        request.put("job", "Tester");
        System.out.println(request);

        given().header("Content-type", "application/json").body(request.toString()).when()
                .post("https://reqres.in/api/users").then().statusCode(201).log().all();

    }


}
