package grupvekendicalismalarim.grupcalismasi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q106012023 extends TestBase {
    //1) Open the browser
    //2) Enter the URL “http://practice.automationtesting.in/”
    //3) Click on Shop Menu
    //4) Now click on Home menu button
    //5) Test whether the Home page has Three Sliders only
    //6) The Home page must contain only three sliders

    @Test
    public void test01(){
        driver.get("http://practice.automationtesting.in/");
        driver.findElement(By.xpath("(//*[@href='https://practice.automationtesting.in/shop/'])[1]")).click();
        driver.findElement(By.xpath("//*[a='Home']")).click();


        List<WebElement> list=driver.findElements(By.xpath("//*[@class='woocommerce-LoopProduct-link']"));
        System.out.println(list.size());




    }
}
