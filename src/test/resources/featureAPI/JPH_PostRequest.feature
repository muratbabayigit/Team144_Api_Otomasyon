Feature: JPH Post Request
  @mrb
  Scenario: JPH sitesine bir req body ile post yapmak

    Given kullanici "JPHUrl" adresine gider
    Then  kullanici path parametreleri olarak "posts" kullanir
    Then  kullanici post request icin "Murat" , "Merhaba", 10 degerlerini kaydeder
    Then  kullanici girilen bilgilerle post request yapar ve response bilgilerini kaydeder
    Then  kullanici response status kodunun 201
    Then  kullanici content type degerinin "application/json; charset=utf-8"
    And   kullanici "Connection" isimli header degerinin "keep-alive"
    Then  kullanici response degerlerinin "Murat" , "Merhaba", 10 ,101 oldugunu test eder