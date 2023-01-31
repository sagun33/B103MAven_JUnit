package day01_burakhoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.annotation.Target;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C01_DropDownMenu {

    // ...Exercise 1...


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Books" secenegini secin
// arama cubuguna "Java" aratın
// arama sonuclarinin Java icerdigini test edin
WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
//    @After
//    public void tearDown(){
//        driver.close();
//    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com/");
        WebElement ddm=driver.findElement(By.xpath
                ("//*[@aria-describedby='searchDropdownDescription']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);
        WebElement sonuc=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
       String javaVarmi=sonuc.getText();
        Assert.assertTrue(javaVarmi.contains("Java"));
        System.out.println(javaVarmi);
        String [] a=javaVarmi.split(" ");
        System.out.println(a[6]);

    }
}
