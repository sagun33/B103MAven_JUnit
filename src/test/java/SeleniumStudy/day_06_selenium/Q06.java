package SeleniumStudy.day_06_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q06 {
    ///* Given kullanici "https://editor.datatables.net/" sayfasina gider
    //    Then new butonuna basar
    //    And editor firstname kutusuna "<firstName>" bilgileri girer
    //    And editor lastname kutusuna "<lastName>" bilgileri girer
    //    And editor position kutusuna "<position>" bilgileri girer
    //    And editor office kutusuna "<office>" bilgileri girer
    //    And editor extension kutusuna "<extension>" bilgileri girer
    //    And editor startdate kutusuna "<startDate>" bilgileri girer
    //    And editor salary kutusuna "<salary>" bilgileri girer
    //    When Create tusuna basar
    //    Then Kullanıcının eklendiğini doğrular.
    //    And Eklediği kullanıcı kaydını siler
    //    Then Kullanıcinin silindiğini doğrular.
    //    */

    WebDriver driver;
    @Before
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://editor.datatables.net/");
    }

//    @After
//    public void tearDown(){
//        driver.close();
//    }
    @Test      //    Then new butonuna basar
    public void newButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='dt-button buttons-create']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='DTE_Field_first_name']")).sendKeys("Ali");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='DTE_Field_last_name']")).sendKeys("Kaya");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='DTE_Field_position']")).sendKeys("QA");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='DTE_Field_office']")).sendKeys("Bremen");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='DTE_Field_extn']")).sendKeys("3");
        Thread.sleep(3000);
        WebElement date = driver.findElement(By.xpath("//*[@id='DTE_Field_start_date']"));
        Select gunDropdown = new Select(date);
        gunDropdown.selectByVisibleText("01");//CASE SENSITIVE -
        gunDropdown.selectByVisibleText("11");
        gunDropdown.selectByVisibleText("2019");


        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='DTE_Field_salary']")).sendKeys("5000");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='btn']")).click();
        Thread.sleep(3000);

    }
}
