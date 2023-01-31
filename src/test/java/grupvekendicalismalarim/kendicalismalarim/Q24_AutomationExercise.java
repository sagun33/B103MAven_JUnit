//package grupvekendicalismalarim.kendicalismalarim;
//
//import com.github.javafaker.Faker;
//import com.github.javafaker.PhoneNumber;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import utilities.TestBase;
//
//public class Q24_AutomationExercise extends TestBase {
//    @Test
//    public void test01() {
//        Faker faker = new Faker();
//        String eMail = faker.internet().emailAddress();
//        String isim = faker.name().firstName();
//        String soyisim = faker.name().lastName();
//        String password = faker.numerify("122jdndb");
//        String adres = faker.address().fullAddress();
//        String evNo = faker.address().buildingNumber();
//        String zipCode = faker.address().zipCode();
//        String sehir = faker.address().city();
//        String eyalet = faker.address().state();
//        String ulke = faker.address().country();
//        String meslek = faker.job().title();
//        PhoneNumber telefon = faker.phoneNumber();
//
//        String kurumAdresi = faker.address().secondaryAddress();
//
//        //1. Launch browser
//        //2. Navigate to url 'http://automationexercise.com'
//        driver.get("http://automationexercise.com");
//        //3. Verify that home page is visible successfully
//        WebElement homePageVisibility = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
//        Assert.assertTrue(homePageVisibility.isDisplayed());
//        //4. Add products to cart
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        waitFor(5);
//
//        WebElement p1 = driver.findElement(By.xpath("(//*[@data-product-id='1'])[1]"));
//
//        WebElement ok = driver.findElement(By.xpath("//*[@class='btn btn-success close-modal btn-block']"));
//        WebElement p2 = driver.findElement(By.xpath("(//*[@data-product-id='2'])[1]"));
//        WebElement p3 = driver.findElement(By.xpath("(//*[@data-product-id='3'])[1]"));
//
//        actions.moveToElement(p1);
//        p1.click();
//        waitFor(3);
//        ok.click();
//
//        waitFor(3);
//
//        actions.moveToElement(p2).perform();
//        p2.click();
//        waitFor(3);
//        ok.click();
//
//        waitFor(3);
//
//        actions.moveToElement(p3).perform();
//        p3.click();
//        waitFor(3);
//        ok.click();
//        waitFor(3);
//
//        //5. Click 'Cart' button
//        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();
//        driver.findElement(By.xpath("(//*[@href='/view_cart'])[1]")).click();
//        //6. Verify that cart page is displayed
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@href='/product_details/1']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@href='/product_details/2']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@href='/product_details/3']")).isDisplayed());
//
//        //7. Click Proceed To Checkout
//        driver.findElement(By.xpath("//*[@class='btn btn-default check_out']")).click();
//        //8. Click 'Register / Login' button
//        driver.findElement(By.xpath("(//u)[1]")).click();
//        //9. Fill all details in Signup and create account
//        driver.findElement(By.xpath("//*[@data-qa='signup-name']"))
//                .sendKeys(isim,Keys.TAB,eMail,Keys.TAB,Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
//        driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
//        WebElement day = driver.findElement(By.xpath("//*[@id='days']"));
//        WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
//        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
//
//        selectFromDropdown(day, "27");
//        selectFromDropdown(month, "09");
//        selectFromDropdown(year, "1982");
//        driver.findElement(By.xpath("//*[@name='newsletter']")).click();
//        waitFor(1);
//        driver.findElement(By.xpath("//*[@id='optin']")).click();
//        waitFor(1);
//        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(isim,
//                Keys.TAB, soyisim, Keys.TAB, meslek, Keys.TAB, eyalet, Keys.TAB, adres,
//                Keys.TAB, ulke, Keys.TAB, eyalet, Keys.TAB, sehir, Keys.TAB, zipCode, Keys.TAB, telefon.phoneNumber());
//        waitFor(1);
//        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
//        waitFor(1);
//
//
//
//        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
//        waitFor(1);
//        driver.findElement(By.xpath("//*[@data-qa='continue-button']")).click();
//        //11. Verify ' Logged in as username' at top
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='fa fa-user']")).isDisplayed());
//
//        //12.Click 'Cart' button
//        driver.findElement(By.xpath("(//*[@href='/view_cart'])[1]")).click();
//        //13. Click 'Proceed To Checkout' button
//        driver.findElement(By.xpath("//*[@class='btn btn-default check_out']")).click();
//        //14. Verify Address Details and Review Your Order
//        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='heading'])[1]")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='heading'])[2]")).isDisplayed());
//
//        //15. Enter description in comment text area and click 'Place Order'
//        driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("islem yavas yavas tamamlaniyor",Keys.TAB,Keys.ENTER);
//        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//        driver.findElement(By.xpath("//*[@class='col-md-12 form-group']"));
//        //17. Click 'Pay and Confirm Order' button
//        //18. Verify success message 'Your order has been placed successfully!'
//        //19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
//        //20. Click 'Continue' button
//        //21. Click 'Delete Account' button
//        //22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
//    }
//}
