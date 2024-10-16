package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;


public class JPHstepdefinitions {
    public String endpoint = "";
    Response response;
    JsonPath resJP;
    JSONObject postReqBody;


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
    public void kullanici_response_status_kodunun(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);

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

    @Then("kullanici response bodydeki {string} degerinin String {string}")
    public void kullanici_response_bodydeki_degerinin_string(String string1, String string2) {
        resJP = response.jsonPath();
        org.junit.Assert.assertEquals(string2,resJP.getString(string1));

    }

    @Then("kullanici post request icin {string} , {string}, {int} degerlerini kaydeder")
    public void kullanici_post_request_icin_degerlerini_kaydeder(String title, String body, Integer userId) {
        postReqBody=new JSONObject();
        postReqBody.put("title",title);
        postReqBody.put("body",body);
        postReqBody.put("userId",userId);

    }

    @Then("kullanici {string} isimli header degerinin {string}")
    public void kullanici_isimli_header_degerinin(String header, String headerValue) {

        response.then().assertThat().header(header,headerValue);


    }

    @Then("kullanici girilen bilgilerle post request yapar ve response bilgilerini kaydeder")
    public void kullanici_girilen_bilgilerle_post_request_yapar_ve_response_bilgilerini_kaydeder() {
        response=RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when().body(postReqBody.toString())
                .post(endpoint);


    }
    @Then("kullanici response degerlerinin {string} , {string}, {int} ,{int} oldugunu test eder")
    public void kullanici_response_degerlerinin_oldugunu_test_eder(String expTitle, String expBody, Integer expuserId, Integer expid) {

        resJP = response.jsonPath();
            Assert.assertEquals(resJP.getString("title"),expTitle);
            Assert.assertEquals(resJP.getString("body"),expBody);
            Assert.assertEquals((Integer) resJP.getInt("userId"),expuserId);
            Assert.assertEquals((Integer)resJP.getInt("id"),expid);


    }

}
