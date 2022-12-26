package SeleniumStudy.day_05_selenium04test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
//    ~ click on Phones & PDAs
//    ~ get the brandName of phones
//    ~ click on add to button for all elements
//    ~ click on black total added cart button
//    ~ get the names of list from the cart
//    ~ compare the names from displaying list and cart list

public class Q05 {
    WebDriver driver;
    WebElement PhonesPdAs;
   @Before
           public void setUp() {
       WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
       PhonesPdAs=driver.findElement(By.xpath("WebDriver driver;"));


   }


//    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home

       @Test
               public void Test(){
           PhonesPdAs.click();




       }
////    ~ click on Phones & PDAs
//        driver.findElement(By.xpath("//*[@href=\"http://tutorialsninja.com/demo/index.php?route=product/category&path=24\"]")).click();
////    ~ get the brandName of phones
//        List<String> brandNames = getBrandNames(driver);
//
////    ~ click on add to button for all elements
//        clickAllElement(driver);
//
////    ~ click on black total added cart button
//        driver.findElement(By.xpath("//*[@class=\"btn btn-inverse btn-block btn-lg dropdown-toggle\"]")).click();
//
////    ~ get the names of list from the cart
//        List<String> namesInCart = namesInCart(driver);
//
////    ~ compare the names from displaying list and cart list
//        compare(brandNames, namesInCart);
//
//    }
//
//    public static void clickAllElement(WebDriver a) {
//        List<WebElement> addButtons = a.findElements(By.xpath("//*[text()='Add to Cart']"));
//        addButtons.forEach(t -> t.click());
//    }
//
//    public static List<String> getBrandNames(WebDriver a) {
//        List<WebElement> brandNames = a.findElements(By.xpath("//h4"));
//        List<String> sBrandNames = new ArrayList<>();
//        brandNames.forEach(t -> sBrandNames.add(t.getText()));
//        Collections.sort(sBrandNames);
//        return sBrandNames;
//    }
//
//    public static List<String> namesInCart(WebDriver a) {
//        List<WebElement> names = a.findElements(By.xpath("//*[@class='text-left']"));
//        List<String> sNames = new ArrayList<>();
//        names.forEach(t -> sNames.add(t.getText()));
//        Collections.sort(sNames);
//        return sNames;
//    }
//
//    public static void compare(List<String> a, List<String> b) {
//        if (a.equals(b)) {
//            System.out.println("Eşleşme başarılı");
//        } else System.err.println("Eşleşme başarısız");
    }
