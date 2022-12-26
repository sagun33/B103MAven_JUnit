package SeleniumStudy.day_06_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q07 {
    ///*
    //1-https://books-pwakit.appspot.com/ adresine gidin.
    //2-"BOOKS" başlığının görünür olduğunu doğrulayın
    //3-Arama çubuğunda "Selenium" u aratın.
    //4-Arama sonuçlarındaki ilk ürün isminin "Selenium" içerdiğini doğrulayın.
    //*/
    WebDriver driver;
    @Before
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://books-pwakit.appspot.com/");
    }
    @Test
    public void titleVisibelMi(){

        String actualTitle=driver.getTitle();
        String expectedTitle="Books";
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Test
    public void seleniumArat(){
        driver.findElement(By.xpath("//*[@id='input']")).sendKeys("Selenium", Keys.ENTER);
    }
}
