package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    /// Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    //    Type any number in the first input
    //    Type any number in the second input
    // Click on Calcula
    // Print the result
    // close driver
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //-"https://testpages.herokuapp.com/styled/index.html" adresine gidelim
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        driver.findElement(By.id("calculatetest")).click();
        WebElement firstNiumber = driver.findElement(By.name("number1"));
        firstNiumber.sendKeys("30", Keys.TAB, Keys.TAB, "30", Keys.ENTER);


        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("sonuc = " + sonuc.getText());

    }
}
