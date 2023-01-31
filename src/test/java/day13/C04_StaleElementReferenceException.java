package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_StaleElementReferenceException extends TestBase {
    @Test
    public void staleElementReferenceExceptionTest1(){
        driver.get("https://www.techproeducation.com");
//        LMS LOGIN linkine tikla ve o sayfanin URL inin lms icerdigini test et
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(3);
        lmsLoginLink.click();//LMS e git
        Assert.assertTrue(driver.getCurrentUrl().contains("lms"));//URl in lms kelimesini icerdigini test et
        waitFor(3);
//        Tekrar ana sayfaya gel ve LMS LOGIN sayfasina tekrar
        driver.navigate().back();//tekrar ana sayfaya gittik
        waitFor(3);
        lmsLoginLink.click();//LMS e git
    }
    @Test
    public void staleElementReferenceExceptionTest2(){
        driver.get("https://www.techproeducation.com");
        waitFor(5);
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        driver.navigate().refresh();
        waitFor(5);
        lmsLoginLink.click();

    }
}

//Stale Element = eski, kullanılamaz durumda, kullanım artık elverişli degil
//-Sayfayi yenilediğinizde (refresh())
//-Sayfada ileri geri gittimizde
//COZUM:
//Elementi tekrar bulmak


//Stale Element means the element is no longer fresh. It is old and no longer available
//When the element is no longer fresh on the page and you try to use it
//When the element is detached from the DOM
//When the element is removed after session started
//Solution:
//Relocate the same element again. You can use a new variable name as well.
//Example:


//Seleniumda aldigin 5 exception
//Null pointer, no such element, time out, slale element reference, web driver
//Genel olarak exception aldiginda bozum yolun nedir?
//Hata mesajini oku
//Genel olarak zamanlama, yanlis locator, iframe hataları olabiliyor
//Hata mesajina gore exception I cozdukden sonra tekrar kodumu calistirim
//Selniumda kullandigin waitler nelerdir>
//Implicit yada explicit yada fluent
//Hangi waiti tercih edersin?
//Test Base (Driver sinifinda) implicit wait kullanıyorum. Cogu problemi bozuyor Cozemedigi durumlarda explicit wait kullanıyorum.
//Neden Explicit wait?
//Explicit wait element e ouzel yazilabilir. Yerel cozum gerektiğinde explicit wait I kullanmak zorundayiz.
//Senkronize(bekleme) problemlerini nasıl çözersin
//Selenium waitlerini kullanarak. Implicit wait driver im da var, ama yetmedigi durumlarda explicit
// wait kullanirim. Bu yüzden ReusableMethod sinifimda tekrar tekrar kullanabileceğimiz
// explicit wait method lari var. Kolaylıkla explicit wait ile bekleme problemlerini cozebuliyoruz.