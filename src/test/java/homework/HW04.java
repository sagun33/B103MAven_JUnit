package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class HW04 extends TestBase {
    //Bir Class olusturalim KeyboardActions2
    //https://html.com/tags/iframe/ sayfasina gidelim
    //video’yu gorecek kadar asagi inin
    //videoyu izlemek icin Play tusuna basin
    //videoyu calistirdiginizi test edin
    @Test
    public void test(){

//https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

        //video'yu gorecek kadar asagi inin

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        waitFor(10);

        //videoyu izlemek icin Play tusuna basin
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
        waitFor(3);
//videoyu calistirdigini test et
        WebElement testEt= driver.findElement(By.xpath("//button[@aria-label='Play']"));
        Assert.assertFalse(testEt.isDisplayed());
    }
}

