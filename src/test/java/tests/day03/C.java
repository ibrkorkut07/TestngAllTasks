package tests.day03;

public class C {
}

/*
●Bir class oluşturun: DropDown
●https://the-internet.herokuapp.com/dropdown adresine gidin.
1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçinve yazdırın
4.Tüm dropdown değerleri(value) yazdırın
5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsoldaTrue , degilse False yazdırın.

●Bir class oluşturun: C3_DropDownAmazon
●https://www.amazon.com/adresine gidin.
-Test 1
Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
-Test 2
1.Kategori menusunden Books secenegini  secin
2.Arama kutusuna Java yazin ve aratin
3.Bulunan sonuc sayisini yazdirin
4. Sonucun Java kelimesini icerdigini test edin

HandleDropdown
1. http://zero.webappsecurity.com/Adresine gidin2. Sign in butonuna basin3. Login kutusuna “username” yazin4. Password kutusuna “password.” yazin5. Sign in tusuna basin
6. Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. “amount” kutusuna bir sayi girin
10. “US Dollars” in secilmedigini test edin
11. “Selected currency” butonunu secin
12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.

Bir class oluşturun: DependsOnTest
●https://www.amazon.com/adresine gidin.
1. Test : Amazon ana sayfaya gittiginizi test edin
2.Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin                  aramayapin ve aramanizin gerceklestigini Test edin
3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83 oldugunu test edin

SoftAssert Class Work
Yeni bir Class Olusturun : C03_SoftAssert
1. “http://zero.webappsecurity.com/” Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password” yazin
5. Sign in tusuna basin
6. Online banking menusu icinde Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"

SoftAssert Class Work
Yeni bir Class Olusturun : D11_SoftAssert1
1.“https://www.hepsiburada.com/” Adresine gidin
2.Basliginin “Turkiye’nin En Buyuk Alisveris Sitesi" icerdiginidogrulayin
3.search kutusuna araba yazip arattirin
4.bulunan sonuc sayisini yazdirin
5.sonuc yazisinin "araba" icerdigini dogrulayin
6.Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin


●Bir class olusturun: Alerts
●https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
●Bir metod olusturun: acceptAlert
○1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının“You successfully clicked an alert” oldugunu test edin.
●Bir metod olusturun: dismissAlert
○2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının “successfuly” icermedigini test edin.
●Bir metod olusturun: sendKeysAlert
○3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna tıklayın ve resultmesajında isminizingörüntülendiğini doğrulayın.

BasicAuthentication Class Work
1-Bir class olusturun : BasicAuthentication
2-https://the-internet.herokuapp.com/basic_authsayfasina gidin
3-asagidaki yontem ve test datalarini kullanarak authentication’i yapin
Html komutu : https://username:password@URL
Username     : admin
password      : admin
4-Basarili sekilde sayfaya girildigini dogrulayin
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

●Bir class olusturun: IframeTest
●https://the-internet.herokuapp.com/iframe adresine gidin.
●Bir metod olusturun: iframeTest
○“An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
○Text Box’a “Merhaba Dunya!” yazin.
○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve konsoldayazdirin.

●Bir class olusturun: IframeTest02
1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
2) sayfadaki iframe sayısını bulunuz.
3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
4) ilk iframe'den çıkıp ana sayfaya dönünüz
5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız

●Yeni bir class olusturun: WindowHandle
●Amazon anasayfa adresine gidin.
●Sayfa’nin window handle degerini String bir degiskene atayin
●Sayfatitle’nin “Amazon” icerdigini test edin
●Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
●Sayfatitle’nin “TECHPROEDUCATION” icerdigini test edin
●Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
●Sayfatitle’nin “Walmart” icerdigini test edin
●Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

●Tests package’inda yeni bir class olusturun: WindowHandle2
●https://the-internet.herokuapp.com/windows adresine gidin.
●Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
●Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
●Click Here butonuna basın.
●Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
●Sayfadaki textin “New Window” olduğunu doğrulayın.
●Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunudoğrulayın
 */
