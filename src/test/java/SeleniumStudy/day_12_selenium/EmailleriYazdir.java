package SeleniumStudy.day_12_selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class EmailleriYazdir extends TestBase {
    @Test
    public void test01() {
        ////https://www.way2automation.com/angularjs-protractor/webtables/


        ////tüm E-mail leri yazdırın
        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
        List<WebElement> emailler=driver.findElements(By.xpath("//table//tbody//tr//td[7]"));
//        emailler.forEach(t-> System.out.println(t.getText()));
        for (WebElement w:emailler) {
            System.out.println(w.getText());

        }
        ////Tüm E-maillerin "@" işareti içerdiğini doğrulayin
       emailler.forEach(t->Assert.assertTrue(t.getText().contains("@")));
    }


}
