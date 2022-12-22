package kendicalismalarim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    //1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
    //○ titleTest
    //○ imageTest
    //=> Sayfa başlığının “YouTube” oldugunu test edin
    //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    WebDriver driver = new ChromeDriver();


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("(//*[@class='yt-spec-touch-feedback-shape__fill'])[11]")).click();




    }
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void titleTest() {
        String actuelTitle = driver.getTitle();
        String expectedTitle = "Youtube";
        Assert.assertTrue(actuelTitle.equalsIgnoreCase(expectedTitle));

    }
    @Test
    public void imageTest(){
        WebElement sayfaResmi = driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]"));
        Assert.assertTrue(sayfaResmi.isDisplayed());
    }
    @Test
    public void searchBoxTest(){
        WebElement searchBox=driver.findElement(By.xpath("(//*[@id='search'])[3]"));
        Assert.assertTrue(searchBox.isEnabled());

    }
    @Test
    public void wrongTitleTest(){
        String actuelTitle=driver.getTitle();
        String expectedTitle="youtube";
        Assert.assertFalse(actuelTitle.equals(expectedTitle));

    }

    }

