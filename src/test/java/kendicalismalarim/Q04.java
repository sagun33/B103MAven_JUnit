//package kendicalismalarim;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.checkerframework.checker.units.qual.A;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//import java.util.List;
//
//public class Q04 {
//
//    //1. Launch browser
//    //2. Navigate to url 'http://automationexercise.com'
//    //3. Verify that home page is visible successfully
//    //4. Click on 'Signup / Login' button
//    //5. Verify 'New User Signup!' is visible
//    //6. Enter name and email address
//    //7. Click 'Signup' button
//    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//    //9. Fill details: Title, Name, Email, Password, Date of birth
//    //10. Select checkbox 'Sign up for our newsletter!'
//    //11. Select checkbox 'Receive special offers from our partners!'
//    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//    //13. Click 'Create Account button'
//    //14. Verify that 'ACCOUNT CREATED!' is visible
//    //15. Click 'Continue' button
//    //16. Verify that 'Logged in as username' is visible
//    //17. Click 'Delete Account' button
//    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
//    WebDriver driver;
//    @Before
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("http://automationexercise.com");
//
//
//    }
//    @After
//    public void teardown(){
//        driver.close();
//    }
//    //2. Navigate to url 'http://automationexercise.com'
//    //3. Verify that home page is visible successfully
//    @Test  //2. Navigate to url 'http://automationexercise.com' //3. Verify that home page is visible successfully
//    public void test01(){
//
//
//
//        String currenactuelUrl=driver.getCurrentUrl();
//        String beklenenUrl="https://automationexercise.com/";
//        if (currenactuelUrl.equals(beklenenUrl)){
//            System.out.println("passed");
//        }else System.out.println("failed");
//
//    }
//    @Test  //4. Click on 'Signup / Login' button
//    public void Test02(){
//
//        WebElement signUp=driver.findElement(By.xpath("//*[@href='/login']"));
//
//        signUp.click();
//       basliklarial(driver.findElement())
//
//w
//
//
//    }
//    public List<WebElement> basliklarial(WebElement driver){
//        List<WebElement> sayfaBasliklari= driver.findElements(By.xpath("(//h2)"));
//        for (WebElement w:sayfaBasliklari) {
//            sayfaBasliklari.add(w);
//
//        }
//        return sayfaBasliklari;
//    }
//
//}
