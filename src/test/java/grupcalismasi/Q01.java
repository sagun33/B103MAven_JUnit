package grupcalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.impl.DefaultAddressResolver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {

        ///*
        //1. http://zero.webappsecurity.com sayfasina gidin
        //2. Signin buttonuna tiklayin
        //3. Login alanine  "username" yazdirin
        //4. Password alanine "password" yazdirin
        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        //6. Online Banking menusunden Pay Bills sayfasina gidin
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8. tarih kismina "2020-09-10" yazdirin
        //9. Pay buttonuna tiklayin
        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath(" //*[@id='signin_button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("(//strong)[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@class='headers'])[4]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='sp_amount']")).sendKeys("500");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void Test01() throws InterruptedException {
        WebElement success=driver.findElement(By.xpath("//*[@title='$ 500 payed to payee sprint']"));
        Assert.assertTrue(success.isDisplayed());




    }
}
