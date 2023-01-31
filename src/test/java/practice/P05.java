package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.impl.DefaultAddressResolver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P05 {
    //BeforeClass ile driver ı olusturun ve
//Maximize edin, 15 sn bekletin
//http://www.google.com adresine gidin
//arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
//arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
//arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
//AfterClass ile kapatın
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Before
    public void setUp()  {
        driver.get("http://www.google.com");

    }

    @Test
    public void test01() {
        driver.findElement(By.xpath("//*[@class='QS5gu sy4vM']")).click();
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("The God Father", Keys.ENTER);
    }

    @Test
    public void test02() {
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("Lord of the Rings", Keys.ENTER);

    }

    @Test
    public void test03() {
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("Kill Bill", Keys.ENTER);
    }


     @After
    public void tearDown() throws Exception {
        String [] sonuc = driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
        System.out.println("Arama Sonuc Sayısı = "+sonuc[1]);


        }






    @AfterClass
    public static void afterClass() throws Exception {
        driver.close();
    }

}
