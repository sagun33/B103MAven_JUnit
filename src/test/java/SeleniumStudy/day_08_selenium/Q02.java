package SeleniumStudy.day_08_selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q02 extends TestBase {
    // go to url :http://demo.automationtesting.in/Alerts.html
    //    click  "Alert with OK" and click 'click the button to display an alert box:'
    //"Alert with OK" butonuna tıklayın ve "click the button to display an  alert box:" 'a tıklayın
    //    accept Alert(I am an alert box!) and print alert on console
//Alert(I am an alert box!) konsolda yazdırın ve Alert'ü kabul edin.
    //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
//"Alert with OK & Cancel" butonuna tıklayın ve"click the button to display a confirm box " butonuna tıklayın
    //    cancel Alert  (Press a Button !)
//Alert'ü kapatın
    //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
//"Alert with Textbox" butonuna tıklayın ve "click the button to demonstrate the prompt box " butonuna tıklayın.
    //    and then sendKeys 'TechProEducation' (Please enter your name)
//Açılan alert e 'TechProEducation' (Lütfen İsminizi girin).
//Gönderdiğiniz metnin isminizi içerdiğini doğrulayın
    //    finally print on console this mesaaje "Hello TechproEducation How are you today"

    @Test
    public void test1() throws InterruptedException {

        driver.get("http://demo.automationtesting.in/Alerts.html");

        //"Alert with OK" butonuna tıklayın ve "click the button to display an  alert box:" 'a tıklayın

        driver.findElement(By.xpath("//*[@class='active']")).click();
        driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
        //    accept Alert(I am an alert box!) and print alert on console
//Alert(I am an alert box!) konsolda yazdırın ve Alert'ü kabul edin.
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
//"Alert with OK & Cancel" butonuna tıklayın ve"click the button to display a confirm box " butonuna tıklayın
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
        driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
        Thread.sleep(3000);

        //    cancel Alert  (Press a Button !)
//Alert'ü kapatın
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
//"Alert with Textbox" butonuna tıklayın ve "click the button to demonstrate the prompt box " butonuna tıklayın.
        driver.findElement(By.xpath("(//*[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
        Thread.sleep(3000);
        //    and then sendKeys 'TechProEducation' (Please enter your name)
//Açılan alert e 'TechProEducation' (Lütfen İsminizi girin).
        driver.switchTo().alert().sendKeys("TechProEducation");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
//Gönderdiğiniz metnin isminizi içerdiğini doğrulayın
        //    finally print on console this mesaaje "Hello TechproEducation How are you today"

        String actualResult = driver.findElement(By.id("demo1")).getText();
        Thread.sleep(3000);
        String expectedResult = "Hello TechProEducation How are you today";
        Thread.sleep(3000);

        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}

