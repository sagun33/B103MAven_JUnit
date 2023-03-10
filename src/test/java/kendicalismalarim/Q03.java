package kendicalismalarim;

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

import java.security.Key;
import java.time.Duration;

//Bir Class olusturalim YanlisEmailTesti
//2. http://automationpractice.com/index.php sayfasina gidelim
//3. Sign in butonuna basalim
//4. Email kutusuna @isareti olmayan bir mail yazip enter’a
//bastigimizda “Invalid email address” uyarisi ciktigini test edelim

public class Q03 {
WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");


    }

    @After
    public void rearDown(){
        driver.close();
    }
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        String email1="salihguenay@yahoo.de";
        WebElement a=driver.findElement(By.xpath("//*[@data-qa='login-email']"));

        Thread.sleep(3000);
        a.sendKeys("salihguenay@yahoo.de");
        Thread.sleep(3000);
        Assert.assertTrue(email1.contains("@"));


    }
}
