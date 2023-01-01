package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class HomeWork02 extends TestBase {
    //https://testcenter.techproeducation.com/index.php?page=multiple-windows
    //Title in ‘Windows’ oldugunu test edin
    //Click here a tiklayin
    //Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin

    @Test
    public void test01() {
        //https://testcenter.techproeducation.com/index.php?page=multiple-windows
        driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");
        String windowHandle1 = driver.getWindowHandle();
        System.out.println(windowHandle1);

        //Title in ‘Windows’ oldugunu test edin
        String actalTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(expectedTitle, actalTitle);

        //Click here a tiklayin

        driver.findElement(By.xpath("//*[@href='index.php?page=new-windows']")).click();
        threadSleep();

        //Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin

        Set<String> windowHandels = driver.getWindowHandles();
        System.out.println(windowHandels);
        threadSleep();
//        windowHandels.stream().filter(t->!t.equals(windowHandle1)).forEach(t->driver.switchTo().window(t));
        for (String eachHandle : windowHandels) {
            if (!eachHandle.equals(windowHandle1)) {
                driver.switchTo().window(eachHandle);
                break;

            }
            threadSleep();

        }


    }
}

