package grupvekendicalismalarim.grupcalismasi;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
        //3. Verify that home page is visible successfully
        String currenactuelUrl=driver.getCurrentUrl();
        String beklenenUrl="https://automationexercise.com/";
        if (currenactuelUrl.equals(beklenenUrl)){
            System.out.println("passed");
        }else System.out.println("failed");
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

//        //5. Verify 'New User Signup!' is visible
        WebElement newUserVisible=driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        if (newUserVisible.isDisplayed()){
            System.out.println("passed");
        }else System.out.println("failed");

        Assert.assertTrue(newUserVisible.isDisplayed());



//        //6. Enter name and email address
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("salih",Keys.ENTER);
        driver.findElement(By.xpath("(//*[@type='email'])[2]")).sendKeys("salihguenay33@gmail.com",Keys.ENTER);

//
//        //7. Click 'Signup' button
        WebElement signup=driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        signup.click();

//        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (signup.isDisplayed()){
            System.out.println("passed");
        }else System.out.println("failed");
//        //9. Fill details: Title, Name, Email, Password, Date of birth

//        //10. Select checkbox 'Sign up for our newsletter!'
//        //11. Select checkbox 'Receive special offers from our partners!'
//        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//        //13. Click 'Create Account button'
//        //14. Verify that 'ACCOUNT CREATED!' is visible
//        //15. Click 'Continue' button
//        //16. Verify that 'Logged in as username' is visible
//        //17. Click 'Delete Account' button
//        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
