package tests.day07;

public class C {
}

/*
1 -https://www.facebook.com/adresine gidin
2-POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
3-Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
4-Basarili giris yapilamadigini test edin

1 ) Bir Class olustur : PositiveTest
2) Bir test method olustur positiveLoginTest()
https://www.hotelmycamp.com/adresine git
login butonuna bas
test data username: manager ,
test data password : Manager1!
Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

1 ) Bir Class olustur : NegativeTest
2) Bir test method olustur NegativeLoginTest()
https://www.hotelmycamp.com/adresine git
login butonuna bas
test data username: manager1 ,
test data password : manager1!
Degerleri girildiginde sayfaya girilemedigini test et

Smoke Test
1) com.techproedaltinda bir package olustur :smoketest
2) Bir Class olustur : PositiveTest
3) Bir test method olustur positiveLoginTest()
https://www.hotelmycamp.comadresine git
login butonuna bas
test data username: manager ,
test data password : Manager1!
Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

Smoke Test
1) smokeTestpaketi altinda yeni bir Class olustur: NegativeTest
3 Farkli test Methodunda 3 senaryoyu test et
-yanlisSifre
-yanlisKulllanici
-yanlisSifreKullanici
test data yanlis username: manager1 , yanlis password : manager1
2) https://www.hotelmycamp.comadresine git
3) Login butonuna bas
4) Verilen senaryolar ile giris yapilamadigini test et

E2E Testing/ Create Hotel Test
1. Tests packagenin altına class olusturun: CreateHotel
2. Bir metod olusturun: createHotel
3. https://www.hotelmycamp.comadresine git.
4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
a. Username : manager
b. Password : Manager1!
5. Login butonuna tıklayın.
6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
8. Save butonuna tıklayın.
9. “Hotel was inserted successfully” textinin göründüğünü test edin.
10. OK butonuna tıklayın.

E2E Testing/ Create Room Test
1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
2. Bir metod olusturun: RoomCreateTest()
3. https://www.hotelmycamp.comadresine gidin.
4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
a. Username : managerb. Password : Manager1!
5. Login butonuna tıklayın.
6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
8. Save butonuna basin.
9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
10. OK butonuna tıklayın.
11. Hotel rooms linkine tıklayın.
12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın
 */
