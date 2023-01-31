package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class HomeWork01 extends TestBase {
    //Bir class olusturun: IframeOdev
    //https://the-internet.herokuapp.com/iframe  sitesine gidiniz
    //sayfadaki toplam iframe sayısını bulunuz.
    //Sayfa basliginda ‘Editor’ yazını içerdiğini test edelim.
    //Paragrafdaki yaziyi silelim
    //Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım
    //Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edelim
    @Test
    public void test01(){
        //https://the-internet.herokuapp.com/iframe  sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        //sayfadaki toplam iframe sayısını bulunuz.
//       List<WebElement> iframeSayisi =driver.findElements(By.tagName("frame")); 1.yol
        List<WebElement> iframeSayisi=driver.findElements(By.xpath("//iframe")); //2.yol
        System.out.println("iframeSayisi.size() = " + iframeSayisi.size());

        //Sayfa basliginda ‘Editor’ yazını içerdiğini test edelim.
        String actualText=driver.findElement(By.xpath("//h3")).getText();
        String expectedText="Editor";
        Assert.assertTrue(actualText.contains(expectedText));

        //Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).clear();

        //Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım
        driver.findElement(By.xpath("//p")).sendKeys("iframe in icindeyim");

        //Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edelim
        driver.switchTo().parentFrame();
        String actualText1=driver.findElement(By.xpath("//*[@style='text-align: center;']")).getText();
        String expectedText1="Elemental Selenium";
        Assert.assertTrue(actualText1.contains(expectedText1));



    }
}
