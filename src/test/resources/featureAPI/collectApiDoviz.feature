Feature: Collect Api Sorguları

  @Api
  Scenario: Doviz Bilgisi Sorugulama

    Given kullanici colllectApi adresine gider
    Then  kullanici site path parametreleri olarak "economy/currencyToAll" kullanir
    Then  kullanici query parametrei olarak "int" olarak 1 "base" olarak "TRY" girer
    Then  kulanici donen cevabi kaydeder
    Then  kullanici donen cevabi yazdirir


  @Api
  Scenario: Nöbetçi Eczane Sorugulama

    Given kullanici colllectApi adresine gider
    Then  kullanici site path parametreleri olarak "health/dutyPharmacy" kullanir
    Then  kullanici site query parametrei olarak "ilce" olarak "Üsküdar" "il" olarak "İstanbul" girer
    Then  kulanici donen cevabi kaydeder
    Then  kullanici donen cevabi yazdirir