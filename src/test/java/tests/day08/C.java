package tests.day08;

public class C {
}

/*
●Bir class oluşturun : C02_WebTables
●login() metodun oluşturun ve oturum açın.
●https://www.hotelmycamp.comadmin/HotelRoomAdmin adresine gidin
○Username : manager
○Password : Manager1!
●table() metodu oluşturun
○Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
○Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
●printRows() metodu oluşturun //tr
○table body’sinde bulunan toplam satir(row) sayısını bulun.
○Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
○4.satirdaki(row) elementleri konsolda yazdırın.

●Bir class oluşturun : D18_WebTables
●login() metodun oluşturun ve oturum açın.
●https://qa-environment.concorthotel.com/admin/HotelRoomAdmin adresine gidin○Username : manager○Password : Manager2!
●table() metodu oluşturun
○Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
○Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.
●printRows() metodu oluşturun //tr
○table body’sinde bulunan toplam satir(row) sayısını bulun.
○Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
○4.satirdaki(row) elementleri konsolda yazdırın.
●printCells() metodu oluşturun //td
○table body’sinde bulunan toplam hücre(cell) sayısını bulun.
○Table body’sinde bulunan hücreleri(cells) konsolda yazdırın.
●printColumns() metodu oluşturun
○table body’sinde bulunan toplam sutun(column) sayısını bulun.
○Table body’sinde bulunan sutunlari(column) konsolda yazdırın.
○5.column daki elementleri konsolda yazdırın.

WebTables class’ini kullanin.
1. Bir metod oluşturun : printData(int row, int column);
a. Satır(row) ve sütun(column) numarasını girdiğinizde,printData metodu bu hücredeki(cell) veriyi yazdırmalıdır.
2. Baska bir Test metoduoluşturun: printDataTest();
a. Ve bu metodu printData() methodunu cagirmak icinkullanin.
b. Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyiyazdırmalıdır
c. yazdirilan datanin olmasi gereken dataya esit oldugunu test edin

Bir Class olusturun D19_WebtablesHomework
1.“https://demoqa.com/webtables” sayfasina gidin
2. Headers da bulunan department isimlerini yazdirin
3. sutunun basligini yazdirin
4. Tablodaki tum datalari yazdirin
5. Tabloda kac cell (data) oldugunu yazdirin
6. Tablodaki satir sayisini yazdirin
7. Tablodaki sutun sayisini yazdirin
8. Tablodaki 3.kolonu yazdirin
9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

Read Excel Class Work
1. apache poi dependency’i pom file’a ekleyelim
2. Java klasoru altinda resourcesklasoru olusturalim
3. Excel dosyamizi resources klasorune ekleyelim
4. excelAutomation isminde bir package olusturalim
5. ReadExcel isminde bir class olusturalim
6. readExcel() method olusturalim
7. Dosya yolunu bir String degiskene atayalim
8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
10. WorkbookFactory.create(fileInputStream)
11. Worksheet objesi olusturun workbook.getSheetAt(index)
12. Row objesi olusturun sheet.getRow(index)
13. Cell objesi olusturun row.getCell(index)

Yeni bir test method olusturalim readExcel2( )
-1.satirdaki 2.hucreye gidelim ve yazdiralim
-1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
-2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
-Satir sayisini bulalim
-Fiziki olarak kullanilan satir sayisini bulun
-Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim

1) Yeni bir Class olusturalim WriteExcel
2) Yeni bir test method olusturalim writeExcelTest()
3) Adimlari takip ederek 1.satira kadar gidelim
4) 4.hucreye yeni bir cell olusturalim
5) Olusturdugumuz hucreye “Nufus” yazdiralim
6) 2.satir nufus kolonuna 1500000 yazdiralim
7) 10.satir nufus kolonuna 250000 yazdiralim
8) 15.satir nufus kolonuna 54000 yazdiralim
9) Dosyayi kaydedelim
10)Dosyayi kapatalim

TestNGGenel Tekrar SoruCozumu
Soru 1 :
Amazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
Bu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 10 satir oldugunu test edin
Yeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7oldugunu test edin


Soru 2 :
AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda bana hucredeki yaziyi getirecek bir method olusturun
Tests paketi altinda yeni bir class olusturun: D26_AmazonHucreTesti
Bu class’in altinda bir test method olusturun : hucretesti() ve webtable’da 3. satir 2.sutundaki yazinin “Home Services” yazisi icerdigini test edin
Yeni bir method olusturun : AmazonYazisi() ve tabloda 9 Hucrede “Amazon” yazisi bulundugunu test edin


Soru 3 :
Amazon uzerine yapilan 4 testi otomatik olarak calistiracak xml kodunu yazin ve calistirin
D26_AmazonSatirSutunSayisi class’indan satirSayisi() testini ve D26_AmazonHucreTesti class’indan hucretesti() testini calistiracak xml kodunu yazin ve calistirin


Soru 4 :
D26_AmazonSatirSutunSayisi class’indan satirSayisi() testini ve D26_AmazonHucreTesti class’indan hucretesti() testini rapor alacak sekilde hazirlayin ve 3.sorudaki xml dosyasi ile calistirip raporu olusturun
 */
