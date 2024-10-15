Feature: Collect Api Sorguları

  Scenario: Doviz Bilgisi Sorugulama

    Given kullanici colllectApi adresine gider
    Then  kullanici path parametreleri olarak "economy/currencyToAll"kullanir
    Then  kullanici query parametrei olarak "int" olarak 1 "base" olarak "TRY" girer
    Then  kulanici donen cevabi kaydeder
    Then  kullanici donen cevabi yazdirir