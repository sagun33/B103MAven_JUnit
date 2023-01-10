package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileUpload extends TestBase {

    //Tests packagenin altina bir class oluşturun : C05_UploadFile
    //https://the-internet.herokuapp.com/upload adresine gidelim

    @Test void upload(){


    //chooseFile butonuna basalim

       WebElement chooseFileButton =driver.findElement(By.id("file-upload"));
    //Yuklemek istediginiz dosyayi secelim.

        chooseFileButton.sendKeys(System.getProperty("user.home")+"/OneDrive/logo.jpeg");
        waitFor(5);
    //Upload butonuna basalim.
    //“File Uploaded!” textinin goruntulendigini test edelim.
}

}
