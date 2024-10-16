Feature: JPH PUT Request
@son
  Scenario: JPH Put Request ile Update yapma

    Given kullanici "JPHUrl" adresine gider
    Then  kullanici path parametreleri olarak "posts/77" kullanir
    And   kullanici put request icin "CucumberElveda" , "ByeByeCucumber", 10 degerlerini kaydeder
    When  kullanici girilen bilgilerle put request yapar ve response bilgilerini kaydeder
    Then  kullanici beklenen body icin "CucumberElveda" , "ByeByeCucumber", 10 , 77
    And   kullanici response status kodunun 200
    Then  kullanici "Connection" isimli header degerinin "keep-alive"
    Then  kullanici beklenen ve donen datalarin ayni oldugunu test eder

