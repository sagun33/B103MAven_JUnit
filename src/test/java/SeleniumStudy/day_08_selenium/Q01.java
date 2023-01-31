package SeleniumStudy.day_08_selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q01 extends TestBase {
    ////go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    ////maximize the web site
    //// ikinci emojiye tıklayın
    //// ikinci emoji altındaki tüm öğelere tıklayın
    //// ana iframe'e geri dön
    ////formu doldurun,(Formu istediğiniz metinlerle doldurun)
    //// uygula butonuna tıklayın

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("(//*[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

        List<WebElement> tumEmojiler = driver.findElements(By.xpath("//div[@id='nature']/div/img"));

        for (WebElement w : tumEmojiler) {
            w.click();
        }
        Thread.sleep(10000);
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("(//*[@class='mdl-textfield__input'])[1]")).sendKeys("güner", Keys.TAB, "Muhammed");
        driver.findElement(By.xpath("//*[.='Apply']")).click();


    }
}