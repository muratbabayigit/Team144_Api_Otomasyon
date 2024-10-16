package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;


public class JPHstepdefinitions {
    public String endpoint = "";
    Response response;
    JsonPath resJP;


    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String adres) {
        endpoint += ConfigReader.getProperty(adres);
        //https://jsonplaceholder.typicode.com/


    }

    @Then("kullanici path parametreleri olarak {string} kullanir")
    public void kullanici_path_parametreleri_olarak_kullanir(String pathparametreleri) {
        endpoint += pathparametreleri;
        // https://jsonplaceholder.typicode.com/posts/44

    }

    @Then("kullanici response degerlerini kaydeder")
    public void kullanici_response_degerlerini_kaydeder() {
        response = RestAssured
                               .given()
                               .when()
                               .get(endpoint);;


    }

    @Then("kullanici response status kodunun {int}")
    public void kullanici_response_status_kodunun(Integer int1) {
        response.then().assertThat().statusCode(200);

    }

    @Then("kullanici content type degerinin {string}")
    public void kullanici_content_type_degerinin(String type) {
        response.then().assertThat().contentType(type);

    }

    @Then("kullanici response degerlerini jSonPath olarak kaydeder")
    public void kullanici_response_degerlerini_j_son_path_olarak_kaydeder() {
        resJP = response.jsonPath();

    }

    @Then("kullanici response boyddeki id degerinin {int} oldugunu")
    public void kullanici_response_boyddeki_id_degerinin_oldugunu(Integer idDegeri) {
        Assert.assertEquals(idDegeri, resJP.getInt("id"));

    }

    @Then("kullanici {string} degerinin {string} oldugunu test eder")
    public void kullanici_degerinin_oldugunu_test_eder(String string1, String string2) {
        Assert.assertEquals(resJP.getString(string1),string2);


           }
}
