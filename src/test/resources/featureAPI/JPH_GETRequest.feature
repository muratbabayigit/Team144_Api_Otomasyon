Feature: US01 Kullanıcı Get Request yapar

  Scenario: TC Kullanıcı Get Request sonucundaki Response degerleri beklenen degerlerle karşılaştırır

    Given kullanici "JPHUrl" adresine gider
    Then  kullanici path parametreleri olarak "posts/11" kullanir
    And   kullanici response degerlerini kaydeder
    Then  kullanici response status kodunun 200
    And   kullanici content type degerinin "application/json; charset=utf-8"
    Then  kullanici response degerlerini jSonPath olarak kaydeder
    Then  kullanici response boyddeki id degerinin 11 oldugunu
    Then  kullanici response bodydeki "title" degerinin String "et ea vero quia laudantium autem"



