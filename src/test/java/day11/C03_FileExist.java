package day11;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03_FileExist {

    @Test
    public void isExist(){
        String userDir=System.getProperty("user.dir");
        System.out.println("userDir: "+userDir);

        String userHome=System.getProperty("user.home");
        System.out.println("userHome: "+userHome);

        String dosyaYolu = userHome+"/OneDrive/Desktop/logo.jpeg";
        System.out.println(dosyaYolu);

        boolean isExist=Files.exists(Paths.get(dosyaYolu));
        Assert.assertTrue(isExist);

    }
}
