//package homework;
//
//import com.github.javafaker.Faker;
//import com.github.javafaker.PhoneNumber;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import utilities.TestBase;
//
//public class HW06 extends TestBase {
//    //Faker Kutuphanesi HOMEWORK
//    //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
//    //degerler uretmemize imkan tanir.
//    //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.
//
//
//
//
//
//    @Test
//    public void fakerTest() {
//
//        Faker faker = new Faker();
//
//        String firstName = faker.name().firstName();
//        String lastNAme = faker.name().lastName();
//        String eMail = faker.internet().emailAddress();
//        String password = faker.internet().password();
//        String dayNumber = String.valueOf(faker.number().numberBetween(1, 31));
//        String monthNumber = String.valueOf(faker.number().numberBetween(1, 12));
//        String yearNumber = String.valueOf(faker.number().numberBetween(1900, 2015));
//
//
//        //1.adim: "https://facebook.com"  Adresine gidin
//        driver.get("https://facebook.com");
//
//        //2.Adim:cookies handle(eger cookie cikarsa)
//        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
//
//        //3.adim: “create new account”  butonuna basin
//        driver.findElement(By.linkText("Create new account")).click();
//
//        //4.adim:“firstName” giris kutusuna bir isim yazin
//        //5.adim:“surname” giris kutusuna bir soyisim yazin
//        //6.adim:“email” giris kutusuna bir email yazin
//        WebElement name = driver.findElement(By.name("firstname"));
//        name.sendKeys(firstName, Keys.TAB, lastNAme, Keys.TAB, eMail);
//
//
//        //7.adim:“email” onay kutusuna emaili tekrar yazin
//        //8.adim:Bir sifre girin
//        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(eMail, Keys.TAB, password);
//
//        //9.adim:Tarih icin ay secin
//        WebElement month = driver.findElement(By.id("month"));
//        selectFromDropdown(month,monthNumber); //(TestBase den geldi)
//
//
//        //10.adim:Tarih icin gun secin
//        WebElement day = driver.findElement(By.id("day"));
//        selectFromDropdown(day, dayNumber); //(TestBase den geldi)
//
//
//        //11.adim:Tarih icin yil secin
//        WebElement year = driver.findElement(By.id("year"));
//        selectFromDropdown(year,yearNumber); //(TestBase den geldi)
//
//
//
//
//        //12.adim:Cinsiyeti secin
//        WebElement woman = driver.findElement(By.xpath("//input[@value='1']"));
//        woman.click();
//        WebElement man = driver.findElement(By.xpath("//input[@value='2']"));
//        WebElement other = driver.findElement(By.xpath("//input[@value='-1']"));
//
//
//        //13.adim:Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
//        Assert.assertTrue(woman.isSelected());
//        Assert.assertFalse(man.isSelected());
//        Assert.assertFalse(other.isSelected());
//        // 14. adim:Sign up buttonuna tiklanyin
//        driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
//
//
//    }
//}