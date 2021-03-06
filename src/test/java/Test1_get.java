import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class Test1_get {
    @Test

    void test1() {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody());
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    void test2(){
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
                .body("data.id[3]",equalTo(10)).log().all();
    }


}
