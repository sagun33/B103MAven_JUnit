package grupvekendicalismalarim.grupcalismasi;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q01_05012023 extends TestBase {
    //1) Open the browser
    //2) Enter the URL “http://practice.automationtesting.in/”
    //3) Click on Shop Menu
    //4) Now click on Home menu button
    //5) Test whether the Home page has Three Sliders only
    //6) The Home page must contains only three sliders
    @Test
    public void test01(){
        //2) Enter the URL “http://practice.automationtesting.in/”
        driver.get("http://practice.automationtesting.in/");
        //3) Click on Shop Menu
        driver.findElement(By.xpath("(//*[@href='https://practice.automationtesting.in/shop/'])[1]")).click();
        //4) Now click on Home menu button
        driver.findElement(By.xpath("(//*[@href='https://practice.automationtesting.in'])[2]")).click();
    }


}
