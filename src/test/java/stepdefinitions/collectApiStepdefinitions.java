package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class collectApiStepdefinitions {

//
//    String endpoint="";
//    Response reponse;
//
//
//
//
//    @Given("kullanici colllectApi adresine gider")
//    public void kullanici_colllect_api_adresine_gider() {
//        endpoint+="https://api.collectapi.com/";
//    }
//
//
//    @Then("kullanici site path parametreleri olarak {string} kullanir")
//    public void kullanici_site_path_parametreleri_olarak_kullanir(String pathparam) {
//        endpoint+=pathparam;
//    }
//    @Then("kullanici query parametrei olarak {string} olarak {int} {string} olarak {string} girer")
//    public void kullanici_query_parametrei_olarak_olarak_olarak_girer(String pp1, Integer pp1value, String pp2, String pp2value) {
//        endpoint+="?"+pp1+"="+pp1value+"&"+pp2+"="+pp2value;
//
//    @Then("kullanici query parametresi olarak {string} olarak {int} ve {string} olarak {string} girer")
//    public void kullanici_query_parametresi_olarak_olarak_ve_olarak_girer(String string, Integer int1, String string2, String string3) {
//
//
//    }
//    @Then("kulanici donen cevabi kaydeder")
//    public void kulanici_donen_cevabi_kaydeder() {
//        reponse= RestAssured.given().when().header("content-type", "application/json").header("authorization", "apikey 0txC96Rvi8RcARcrGNr5E1:7pFTec4Ofs5XuEEaKNi4WV").get(endpoint);
//
//    }
//    @Then("kullanici donen cevabi yazdirir")
//    public void kullanici_donen_cevabi_yazdirir() {
//        reponse.prettyPrint();
//        reponse.prettyPeek();
//    }
//
//    @Then("kullanici site query parametrei olarak {string} olarak {string} {string} olarak {string} girer")
//    public void kullanici_site_query_parametrei_olarak_olarak_olarak_girer(String pp1, String pp1value, String pp2, String pp2value) {
//        endpoint+="?"+pp1+"="+pp1value+"&"+pp2+"="+pp2value;
//    }
}
