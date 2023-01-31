package grupvekendicalismalarim;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Q01 extends TestBase{
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'New User Signup!' is visible
    //6. Enter name and email address
    //7. Click 'Signup' button
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //9. Fill details: Title, Name, Email, Password, Date of birth
    //10. Select checkbox 'Sign up for our newsletter!'
    //11. Select checkbox 'Receive special offers from our partners!'
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //13. Click 'Create Account button'
    //14. Verify that 'ACCOUNT CREATED!' is visible
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button





    @Test
    public void test01()  {
        driver.get("http://automationexercise.com");


        //Verify that home page is visible successfully
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="http://automationexercise.com";
        Assert.assertFalse(actualUrl.equalsIgnoreCase(expectedUrl));

        driver.findElement(By.xpath("//*[@href='/login']")).click();

        //6. Enter name and email address
        //7. Click 'Signup' button
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("salih", Keys.TAB,"salihgueny@yahoo.de",Keys.TAB,Keys.ENTER);
        waitFor(3);
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String actuelText=driver.findElement(By.xpath("(//*[.='Enter Account Information'])[2]")).getText();
        String expectedText="ENTER ACCOUNT INFORMATION";
        Assert.assertEquals(expectedText,actuelText);

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("(//*[@class='form-control'])[1]")).sendKeys("salih gunay",Keys.TAB,"salihguenay@yahoo.de", Keys.TAB,"1234");

//        selectFromDropdown(driver.findElement(By.id("Day")),"2");
//        selectFromDropdown(driver.findElement(By.id("Month")),"2");
//        selectFromDropdown(driver.findElement(By.id("Year")),"2");


    }


}
