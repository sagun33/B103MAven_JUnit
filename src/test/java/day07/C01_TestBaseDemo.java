package day07;

import utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class C01_TestBaseDemo extends TestBase {
    @Test
    public void test01(){
        driver.get("https://www.techproeducation.com");
        String pageTitle=driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));
    }

}
