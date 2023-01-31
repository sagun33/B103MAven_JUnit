package day17;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class ClickExecuter extends TestBase {

    //clickByJSTest
    //Techpro education ana sayfasina git
    //LMS LOGIN elementine tikla
    //Cikan sayfayinin URL inin “https://lms.techproeducation.com/” oldugunu test et


    @Test
    public void clickByJSTest() {
        //    Techpro education ana sayfasina git
        driver.get("https://www.techproeducation.com");
        waitFor(3);
        //    LMS LOGIN elementine tikla
        clickByJS(driver.findElement(By.linkText("LMS LOGIN")));
        //    Cikan sayfayinin URL inin “https://lms.techproeducation.com/” oldugunu test et
        waitFor(3);
        Assert.assertEquals("https://lms.techproeducation.com/",driver.getCurrentUrl());


    }}