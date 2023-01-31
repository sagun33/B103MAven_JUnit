//package grupvekendicalismalarim.kendicalismalarim;
//
//
//import com.github.javafaker.Faker;
//import com.github.javafaker.PhoneNumber;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import utilities.TestBase;
//
//public class Q01_AutomationExercise extends TestBase {
//
//
//    @Test
//    public void test01() throws InterruptedException {
//
////   Test Case 1: Register User
////1. Launch browser
////2. Navigate to url 'http://automationexercise.com'
//
//        driver.get("http://automationexercise.com");
//
//
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
//
//        //3. Verify that home page is visible successfully
//        WebElement homePageVisibility = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
//        Assert.assertTrue(homePageVisibility.isDisplayed());
//
//
//        //4. Click on 'Signup / Login' button
//        driver.findElement(By.xpath(" //*[text()=' Signup / Login'] ")).click();
//
//
//        //5. Verify 'New User Signup!' is visible
//        WebElement newUserVisible = driver.findElement(By.xpath("//h2"));
//        Assert.assertTrue(newUserVisible.isDisplayed());
//
//        //6. Enter name and email address
//        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys(isim, Keys.TAB, eMail);
//
//        //7. Click 'Signup' button
//        driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
//        waitFor(2);
//
//        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//        String actualResult = driver.findElement(By.xpath(" //*[b='Enter Account Information']")).getText();
//        String expectedResult = "ENTER ACCOUNT INFORMATION";
//        Assert.assertEquals(expectedResult, actualResult);
//
//
//        //9. Fill details: Title, Name, Email, Password, Date of birth
//        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
//        driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
//        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//
//
//        WebElement day = driver.findElement(By.xpath("//*[@id='days']"));
//        WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
//        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
//
//        selectFromDropdown(day, "27");
//        selectFromDropdown(month, "09");
//        selectFromDropdown(year, "1982");
//
//
//        //10. Select checkbox 'Sign up for our newsletter!'
//        driver.findElement(By.xpath("//*[@name='newsletter']")).click();
//        waitFor(1);
//
//
//        //11. Select checkbox 'Receive special offers from our partners!'
//        driver.findElement(By.xpath("//*[@id='optin']")).click();
//        waitFor(1);
//
//        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//
//        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(isim,
//                Keys.TAB, soyisim, Keys.TAB, meslek, Keys.TAB, eyalet, Keys.TAB, adres,
//                Keys.TAB, ulke, Keys.TAB, eyalet, Keys.TAB, sehir, Keys.TAB, zipCode, Keys.TAB, telefon.phoneNumber());
//        waitFor(1);
//
//
////13. Click 'Create Account button'
//        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
//        waitFor(1);
//
////14. Verify that 'ACCOUNT CREATED!' is visible
//        WebElement accountCr = driver.findElement(By.xpath("//*[text()='Account Created!']"));
//        Assert.assertTrue(accountCr.isDisplayed());
//        waitFor(1);
//
////15. Click 'Continue' button
//        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
//        waitFor(1);
//
//
////16. Verify that 'Logged in as username' is visible
//        WebElement usernameKontrol = driver.findElement(By.xpath("//*[@class='fa fa-user']"));
//        Assert.assertTrue(usernameKontrol.isDisplayed());
//        waitFor(1);
//
////17. Click 'Delete Account' button
//        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
//        waitFor(1);
//
////18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
//        WebElement accountDelete = driver.findElement(By.xpath("//*[text()='Account Deleted!']"));
//        Assert.assertTrue(accountDelete.isDisplayed());
//
//        waitFor(2);
//        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
//
//        waitFor(3);
//
//        driver.close();
//    }
//}