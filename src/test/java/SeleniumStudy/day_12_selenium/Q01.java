package SeleniumStudy.day_12_selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q01 extends TestBase {
    //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
    //2. "Hover over Me First" kutusunun ustune gelin
    //3. "Link 1" e tiklayin
    //4. Popup mesajini yazdirin
    //5. Popup'i tamam diyerek kapatin
    //6. "Click and hold" kutusuna basili tutun
    //7. "Click and hold" kutusunda cikan yaziyi yazdirin
    //8. "Double click me" butonunu cift tiklayin
    //9. "Double click me" butonunun renk değiştridiğini doğrulayın
    @Test
    public void test01(){

        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin
        Actions actions=new Actions(driver);
        WebElement kutu1=driver.findElement(By.xpath("(//*[@class='dropbtn'])[1]"));
        actions.moveToElement(kutu1).perform();




        //3. "Link 1" e tiklayin
        driver.findElement(By.linkText("Link 1")).click();


        //4. Popup mesajini yazdirin
        String mesaj=driver.switchTo().alert().getText();
        System.out.println(mesaj);


        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();



        //6. "Click and hold" kutusuna basili tutun
        WebElement clickOn=driver.findElement(By.id("click-box"));
        actions.clickAndHold(clickOn).perform();

        waitFor(5);

        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(clickOn.getText());


        //8. "Double click me" butonunu cift tiklayin
        WebElement box2 = driver.findElement(By.id("double-click"));
        String oncekiRenk = box2.getCssValue("background-color");
        System.out.println("Çift tıklamadan önceki renk: " + oncekiRenk);
        actions.doubleClick(box2).perform();

        //9. "Double click me" butonunun renk değiştridiğini doğrulayın
        String sonrakiRenk = box2.getCssValue("background-color");
        System.out.println("Çift tıkladıktan sonraki renk: " + sonrakiRenk);
        Assert.assertNotEquals(oncekiRenk,sonrakiRenk);



    }
}
