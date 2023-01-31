package grupvekendicalismalarim.grupcalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    WebDriver driver;


    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        ////2 https://www.google.com adresine gidin
        driver.get("https://www.google.com");
        //3 cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("(//*[@role='none'])[18]")).click();
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void testSayfaBasligiininGoggleOldugunuSorgula(){
        //4 Sayfa basliginin "Google" ifadesi icerdigini test edin

        String actuelSayfaBasligi=driver.getTitle();
        String expectedSayfaBasligi="Google";
        Assert.assertEquals(expectedSayfaBasligi,actuelSayfaBasligi);

    }
    @Test
    public void testNutellaArat(){
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutellaa", Keys.ENTER);
        String sonucSayisi= String.valueOf(driver.findElement(By.xpath("//*[@id='result-stats']")).getText());
        System.out.println("sonucSayisi = " + sonucSayisi);


    }

}








