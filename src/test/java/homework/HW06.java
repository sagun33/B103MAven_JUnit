package homework;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class HW06 extends TestBase {
    //Faker Kutuphanesi HOMEWORK
    //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
    //degerler uretmemize imkan tanir.
    //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.

    @Test
    public void fakerTest(){
        Faker faker = new Faker();
        String eMail = faker.internet().emailAddress();
        String isim = faker.name().firstName();
        String soyisim = faker.name().lastName();
        String password = faker.numerify("122jdndb");
        String adres = faker.address().fullAddress();
        String evNo = faker.address().buildingNumber();
        String zipCode = faker.address().zipCode();
        String sehir = faker.address().city();
        String eyalet = faker.address().state();
        String ulke = faker.address().country();
        String meslek = faker.job().title();
        PhoneNumber telefon = faker.phoneNumber();

        String kurumAdresi = faker.address().secondaryAddress();
        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");

        //cookies i handle et
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();

        //“create new account”  butonuna basin
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();


        //“firstName” giris kutusuna bir isim yazin
        //“surname” giris kutusuna bir soyisim yazin
        //“email” giris kutusuna bir email yazin
        //“email” onay kutusuna emaili tekrar yazin
        //Bir sifre girin

        WebElement name=driver.findElement(By.id("u_3_b_K4")).sendKeys();
        name.sendKeys(isim, Keys.TAB,soyisim,Keys.TAB,eMail,Keys.TAB,password,Keys.TAB,password,Keys.TAB);


        //Tarih icin gun secin
        //Tarih icin ay secin
        //Tarih icin yil secin

        WebElement month=driver.findElement(By.id("Month"));
        WebElement day=driver.findElement(By.id("Day"));
        WebElement year=driver.findElement(By.id("Year"));

        selectFromDropdown(month,"09");
        selectFromDropdown(day,"27");
        selectFromDropdown(year,"1982");

         //Cinsiyeti secin
        WebElement male=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
        male.click();

        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        WebElement fMale=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
        WebElement custom=driver.findElement(By.xpath("(//*[@name='sex'])[3]"));
        Assert.assertTrue(male.isSelected());
        Assert.assertFalse(fMale.isSelected());
        Assert.assertFalse(custom.isSelected());


        //Sayfayi kapatin

        driver.close();
        waitFor(5);

}
}
