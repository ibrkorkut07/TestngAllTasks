package tests.day09;

public class C {
}

/*
ClassWork: First CucumberTestCase
Yeni bir feature file olusturalim : amazonsearch.feature
Given kullanici amazon sayfasina gider
And iPhone icin arama yapar
Then sonuclarin Iphone icerdigini test eder
Given kullanici amazon sayfasina gider
And tea pot icin arama yapar
Then sonuclarin tea pot icerdigini test eder
Given kullanici amazon sayfasina gider
And flower icin arama yapar
Then sonuclarin flower icerdigini test eder

BackgroundClassWork
US1001 feature file’daki tekrar eden aramalar yerine parameter kullanarak arama yapabilecegimiz sekilde US1002 feature file veTC02 parameter ile arama Scenerio’su olusturalim

Feature File’i Parametre ile Kullanma
Class Work
US1001 de kullandigimiz feature dosyasi altinda yeni bir Scenario olusturalim TC03 ve orada yaptigimiz aramayi parametre kullanarak yapalim

Feature: US1011Concort Hotels LoginScenario: TC12kullanici gecerli bilgilerle giris yaparGiven kullanici Hotel My Camp ana sayfasindaThen Log in yazisina tiklarAnd gecerli username girerAnd gecerli password girerAnd Login butonuna basarThen sayfaya giris yaptigini kontrol ederAnd kulllanici sayfayi kapatir

Hotel My Camp Logintestinde kullandigimiz feaure file ve step definitions’i  kullanarak negative test case yazin

Yeni bir feature file olusturalim: US1004_Walmart_parameter_arama.feature
Yeni bir Scenario olusturalim: TC07_aranan_kelime_title’da_olmali
Nutella, pencil, milk, tomatoes ve popcorn ile arama yapip sonuclari test edin

Yeni bir feature file olusturalim: US1006_Dinamik_url_test.feature
Yeni bir Scenario olusturalim: TC08_yazilan_her_url’e_gitmeli
Configuration.properties dosyasinda tanimlanmis tum url’lerden key olarak yazdigimda  ilgili sayfaya gidecek sekilde bir stepdefinition olusturun.
Bu stepdefinition’i amazon_url, bestbuy_url ve ebay_url ile test edin

HotelMyCampLoginnegative test case’i  asagidaki 5 kullanici ismi ve sifresi icin calisacak sekilde duzenleyin
Kullanici adi   Password
Manager5Manager5!
Manager6Manager6!
Manager7Manager7!
Manager8Manager8!
Manager9Manager9!
Feature: US1009Hotel My Camp LoginScenario: TC11 kullanici gecerli bilgilerle giris yaparGiven kullanici Hotel My Camp ana sayfasindaThen Log in yazisina tiklarAnd gecersizusername girerAnd gecersizpassword girerAnd Login butonuna basarThen sayfaya giris yapilamadiginikontrol ederAnd kulllanici sayfayi kapatir

Yeni bir feature file olusturun: US1007_kullanici_data_ekleyebilmeli
DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun ve 5 farkli kayit ekleyin
Whenkullanici https://editor.datatables.net/adresine gider
Thennew butonuna basar
And tum bilgileri girer
And Create tusuna basar
When kullanici ilk isim ile arama yapar
Then isim bolumunde isminin oldugunu dogrular

Yeni bir test methodu olusturalim
https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
1)“Add Element” butona basin
2)“Delete” butonu gorunur oluncaya kadar bekleyin
3)“Delete” butonunun gorunur oldugunu test edin
4)Delete butonuna basarak butonu silin
5)Delete butonunun gorunmedigini test edin


1."http://webdriveruniversity.com/" adresine gidin
2."Login Portal" a  kadar asagi inin
3."Login Portal" a tiklayin
4.Diger window'a gecin
5."username" ve  "password" kutularina deger yazdirin
6."login" butonuna basin
7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
8.Ok diyerek Popup'i kapatin
9.Ilk sayfaya geri donun
10.Ilk sayfaya donuldugunu test edin


1.http://demo.guru99.com/test/web-table-element.phpsayfasina gidelim
2.Cucumber framework’de US1012_Guru_Web_Tables altinda
Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli olusturun ve asagidaki testi yapin
Given user web sayfasinda
And “Istenen Baslik”, sutunundaki tum degerleri yazdirir


1.http://demo.guru99.com/test/web-table-element.phpsayfasina gidelim
2.Cucumber framework’de US1012_Guru_Web_Tables altinda
Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli olusturun ve asagidaki testi yapin
Given user web sayfasinda
And “Istenen Baslik”, sutunundaki tum degerleri yazdirir

Genel Tekrar
Soru 1
1.https://www.hotelmycamp.comsayfasina gidelim
2.Cucumber parametre ,cucumber scenario outline ve TestNg framework @Dataprovider kullanarak asagidaki gorevi tamamlayin

-Login tusuna basin
-Asagidaki 5 kullanici adi ve sifreyi deneyin ve login olmadigini test edin
-Manager –Manager
-Manager1-Manager1
-Manager2 -Manager2
-Manager3 -Manager3
-Manager4 –Manager4

Soru 2
1.http://automationpractice.com/index.phpsayfasina gidelim
2.Cucumber ile asagidaki testi yapalim

Given user web sayfasinda
And user sign in linkine tiklar
And user Create and account bölümüne email adresi girer
And Create an Account butonuna basar
And user kisisel bilgilerini ve iletisim bilgilerini girer
And user Register butonuna basar
Then hesap olustugunu dogrulayin


1.http://automationpractice.com/index.phpsayfasina gidelim
2.Cucumber ile asagidaki testi yapalim
-Given user web sayfasinda
-And user sign in linkine tiklar
-And email kutusuna @isareti olmayanemail adresi yazar ve enter'a tiklar
-Then error mesajinin “Invalid email address”  oldugunu dogrulayin


1.http://demo.guru99.com/test/web-table-element.phpsayfasina gidelim
2.Cucumber framework’de US1012_Guru_Web_Tables olusturun
3.Scenario : TC_16_kullanici_liste_alabilmeli asagidaki testi yapin
Given user web sayfasinda
Then Company listesini consola yazdirir
And DCB Bank'in listede oldugunu test eder


1.http://demo.guru99.com/test/web-table-element.phpsayfasina gidelim
2.Cucumber framework’de US1012_Guru_Web_Tables altinda
Scenario : TC_17_kullanici_sirket_Prev_Close_alabilmeli olusturun ve asagidaki testi yapin
Given user web sayfasinda
And “Istenen Sirket” Prev.Close degerini yazdirir


1.http://demo.guru99.com/test/web-table-element.phpsayfasina gidelim
2.Cucumber framework’de US1012_Guru_Web_Tables altinda
Scenario : TC_18_kullanici_satir_sutun_degeri_ile_yazi_alabilmeli olusturun ve asagidaki testi yapin
Given user web sayfasinda
And “Istenen Satir”, “Istenen Sutun” daki yaziyi yazdirir


1.http://demo.guru99.com/test/web-table-element.phpsayfasina gidelim
2.Cucumber framework’de US1012_Guru_Web_Tables altinda
Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli olusturun ve asagidaki testi yapin
Given user web sayfasinda
And “Istenen Baslik”, sutunundaki tum degerleri yazdirir

1) Yeni bir class olusturalim D34_readExcel
2) Baskentler excelini framework’e ekleyelim ve excelle ilgili islemleri yaparak dosyayi kullanilabilir hale getirelim
-1.satirdaki 2.hucreye gidelim ve yazdiralim
-1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
-baskenti Jakarta olan ulke ismini yazdiralim
-Ulke sayisini bulalim
-Fiziki olarak kullanilan satir sayisini bulun
-Tum bilgileri map olarak kaydedelim
-baskenti Jakarta olan ulkenin tum bilgilerini yazdiralim
-Satir ve sutun bilgisi ile hucre yazdiralim

Yeni bir Class olusturalim D34_WriteExcel
1)Yeni bir sutun olusturalim
-baslik satirinda ilk bos hucreye yeni bir cell olusturalim
-Olusturdugumuz hucreye “ulke nufusu” yazdiralim
-2.satir ulke nufusu kolonuna “1,5 milyar” yazdiralim
-8.satir nufus kolonuna 250 milyon yazdiralim
-Dosyayi kaydedelim
-Dosyayi kapatalim

Yeni bir Class olusturalim Day36_ExplicitlyWait
1)https://demoqa.com/browser-windowsadresine gidin
2)Alerts’e tiklayin
3)On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
4)Allert’in gorunur olmasini bekleyin
5)Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
6)Ok diyerek alerti kapatin


Yeni bir test methodu olusturun
1)https://demoqa.com/dynamic-propertiesadresine gidin
2)“Will enable 5 seconds” butonunun enable olmasini bekleyin
3)“Will enable 5 seconds” butonunun enable oldugunu test edin


Yeni bir test methodu olusturun
1)https://demoqa.com/dynamic-propertiesadresine gidin
2)“Will enable 5 seconds” butonunun enable olmasini bekleyin
3)“Will enable 5 seconds” butonunun enable oldugunu test edin


Yeni bir test methodu olusturun
https://demoqa.com/dynamic-propertiesadresine gidin
1)“Visible After 5 seconds” butonunun gorunur olmasini bekleyin
2)“Visible After 5 seconds” butonunun gorunur oldugunu test edin


Yeni bir test methodu olusturalim
https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
1)“Add Element” butona basin
2)“Delete” butonu gorunur oluncaya kadar bekleyin
3)“Delete” butonunun gorunur oldugunu test edin
4)Delete butonuna basarak butonu silin
5)Delete butonunun gorunmedigini test edin




XMLFile Class Work
Istenen Package’lari Calistirma
Yeni bir xml dosyasi olusturalim :

belirliPackageCalistirma
Smoke Test package’indaki tum testleri calistiralim


XMLFile Class Work
Istenen Class’lari Calistirma
Yeni bir xml dosyasi olusturalim :

belirliClasslariCalistirma
<package> attribute yerine <classes> ve sonra <class> attribute kullanarak istediginiz class’lari calistirin


XMLFile Class Work
Istenen Method’lari Calistirma
Yeni bir xml dosyasi olusturalim : belirliMethodlariCalistirma
<classes>  attribute altinda <class> ve <methods> attribute’lerini ve icinde <include>, <exclude> attribute’lerini kullanalim


XMLFile Class Work
Istenen Gruplari Calistirma
Yeni bir xml dosyasi olusturalim : belirliGruplariCalistirma
Group calistirmak icin hem grup adini tanimlamak hem de nerede arayacagimizi belirtmek zorundayiz


XMLFile Class Work
Tum Testleri Calistirma
Yeni bir xml dosyasi olusturalim : tumTestleriCalistirma


Testimize rapor olusturma adimlari
1-Test class’ini extends ile TestBaseRapor Class’ina child yapalim
2-extentTest=extentReports.createTest(“Test ismi”,“Tanim”);rapor olusturalim
3-Gerekli/istedigimiz satirlara extentTest.info(“Aciklama”) ekleyelim
4-Assert olan satirda aciklamayi extentTest.pass ile yapabiliriz

 */
