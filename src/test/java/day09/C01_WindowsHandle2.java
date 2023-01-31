package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_WindowsHandle2 extends TestBase {
    //https://the-internet.herokuapp.com/windows adresine gidin.
    //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //Click Here butonuna basın.
    //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String window1Handle=driver.getWindowHandle();
        String actualWindow1Text=driver.findElement(By.xpath("//h3")).getText();
       String expectedWindow1Text="Opening a new window";
       Assert.assertEquals(expectedWindow1Text,actualWindow1Text);
       String actualWindow1Title=driver.getTitle();
       String expectedWindow1Title="The Internet";
       Assert.assertEquals(expectedWindow1Title,actualWindow1Title);

       driver.findElement(By.linkText("Click Here")).click();

       waitFor(3);
      switchToWindow(1);
      String actualWindow2Title=driver.getTitle();
      String expectedWindow2Title="New Window";
      Assert.assertEquals(expectedWindow2Title,actualWindow2Title);
      switchToWindow(0);




    }
}
