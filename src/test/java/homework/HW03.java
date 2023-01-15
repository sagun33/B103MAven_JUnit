package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class HW03 extends TestBase {
    //Keyboard Base Actions
    //Homework
    //Yeni Class olusturun ActionsClassHomeWork
    //1- "http://webdriveruniversity.com/Actions" sayfasina gidin  2- Hover over Me First" kutusunun ustune gelin

    @Test
    public void test01() {
        driver.get("https://www.webdriveruniversity.com/Actions");
        //Link 1" e tiklayin
        Actions actions=new Actions(driver);

        WebElement target=driver.findElement(By.xpath("//*[*='Hover Over Me First!']"));
        actions.moveToElement(target).perform();
        driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();

        driver.switchTo().alert();
        System.out.println(driver.findElement(By.xpath("//*[*='Well done you clicked on the link!']")));




        //Popup mesajini yazdirin
        //Popup'i tamam diyerek kapatin
        //“Click and hold" kutusuna basili tutun
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        //8- “Double click me" butonunu cift tiklayin


    }
}
