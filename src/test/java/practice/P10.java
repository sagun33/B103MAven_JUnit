package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class P10 extends TestBase {

    //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    //2) sayfadaki iframe sayısını bulunuz.
    //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
    //4) ilk iframe'den çıkıp ana sayfaya dönünüz
    //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html)
    //tıklayınız

    @Test
    public void test01(){
        driver.get("http://demo.guru99.com/test/guru99home/");

        driver.findElement(By.xpath("//*[@style='font-weight: 400;']")).click();

        List<WebElement> iframe=driver.findElements(By.xpath("//iframe"));
        System.out.println(iframe.size());
    }
}
