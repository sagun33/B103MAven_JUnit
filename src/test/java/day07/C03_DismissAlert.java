package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_DismissAlert extends TestBase {
    @Test
    public void dismissAlerTest() throws InterruptedException {
        //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve
        // result mesajının "You clicked: Cancel" oldugunu test edin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[2]")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);

        String actualResult=driver.findElement(By.id("result")).getText();
        String expectedresult="You clicked: Cancel";
        Assert.assertEquals(expectedresult,actualResult);


    }


}
