package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class HW05 extends TestBase {


    TreeMap<String, String> urunler = new TreeMap<>();
    TreeMap<String, String> sepettekiler = new TreeMap<>();

    @Test
    public void test01() {          // Test01
        // 1- amazon gidin
        driver.get("https://www.amazon.com");

        // Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        List<WebElement> optionsList = select.getOptions();

        optionsList.stream().forEach(t -> System.out.println(t.getText() + " "));

        //dropdown menude 28 eleman olduğunu doğrulayın
        Assert.assertEquals(28, optionsList.size());

    }

    @Test

    public void test2() {
        driver.get("https://amazon.com");

        //dropdown menuden elektronik bölümü seçin
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByVisibleText("Electronics");

        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER);
        WebElement resultText = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println("resultText = " + resultText.getText());

        //sonuc sayisi bildiren yazinin iphone icerdigini test edin
        Assert.assertTrue(resultText.getText().contains("iphone"));

        // ikinci ürüne relative locater kullanarak tıklayin
        WebElement firstProduct = driver.findElement(By.xpath("//*[@class='s-image']"));
        By secondProduct = with(By.tagName("div")).toRightOf(firstProduct);
        driver.findElement(secondProduct).click();

        //ürünün title'ni ve fiyatını variable'a  assign edip ürünü sepete ekleyelim
        WebElement firstProductTitle = driver.findElement(By.xpath("//*[@id='title']"));
        WebElement firstProductPrice = driver.findElement(By.xpath("//*[@class='a-price aok-align-center']"));

        String[] arrPrice = firstProductPrice.getText().split("\n");  //Burada fiyati diziye dondurup alt satirda aralarina nokta koyarak yazdirdik
//        System.out.println("splitle :"+ Arrays.toString(arrPrice));
        String firstPrice = arrPrice[0] + "." + arrPrice[1];
        System.out.println("firstProductTitle = " + firstProductTitle.getText());
        System.out.println("firstProductPrice = " + firstPrice);
        urunler.put(firstProductTitle.getText(), firstPrice);
        driver.findElement(By.name("submit.add-to-cart")).click();
    }

    @Test
    public void test03() {
        test2();
        System.out.println("***************");
        // yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);
        switchToWindow(1);
        driver.get("https://www.amazon.com");

        //dropdown'dan bebek bölümünu secin
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByVisibleText("Baby");

        //bebek puset aratıp bulunan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bebek puset", Keys.ENTER);
        WebElement resultText = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println("resultText = " + resultText.getText());

        //sonuç yazsının puset içerdiğini test edin
        Assert.assertTrue(resultText.getText().contains("puset"));

        // ucuncu ürüne relative locater kullanarak tıklayin
        WebElement secondProduct = driver.findElement(By.xpath("//*[@cel_widget_id='MAIN-SEARCH_RESULTS-2']"));
       driver.findElement(with(By.tagName("img")).below(secondProduct)).click();


        // title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
        WebElement thirdProductTitle = driver.findElement(By.xpath("//h1[@id='title']"));
        WebElement thirdProductPrice = driver.findElement(By.xpath("//*[@class='a-price aok-align-center']"));
        String[] arrPrice = thirdProductPrice.getText().split("\n");
        String thirddPrice = arrPrice[0] + "." + arrPrice[1];
        System.out.println("thirdProductTitle = " + thirdProductTitle.getText());
        System.out.println("thirdProductPrice = " + thirddPrice);
        urunler.put(thirdProductTitle.getText(), thirddPrice);
        driver.findElement(By.name("submit.add-to-cart")).click();
    }

    @Test
    public void test04() {
        test03();
        System.out.println("***********************");

        // 1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
        driver.findElement(By.id("nav-cart")).click();

        String productTitle1 = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[5]")).getText();
        productTitle1 = productTitle1.replaceAll("…", "");
        System.out.println("productTitle1 = " + productTitle1);
        String productPrice1 = driver.findElement(By.xpath("(//p[@class='a-spacing-mini'])[1]")).getText();

        String productTitle2 = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[6]")).getText();
        productTitle2 = productTitle2.replaceAll("…", "");
        System.out.println("productTitle2 = " + productTitle2);
        String productPrice2 = driver.findElement(By.xpath("(//p[@class='a-spacing-mini'])[2]")).getText();

        sepettekiler.put(productTitle1, productPrice1);
        sepettekiler.put(productTitle2, productPrice2);
        System.out.println("**********************");

        Iterator<String> iterator1 = urunler.keySet().iterator();             //iteratora atip tek tek karsilastirma yapacagiz.
        Iterator<String> iterator2 = sepettekiler.keySet().iterator();         //hashnext() ilerde eleman oldugu surece iteratorun icinde ilerleyecek
        while (iterator1.hasNext() && iterator2.hasNext()) {
            String firsturunler = iterator1.next();
            String firstsepetteki = iterator2.next();
            System.out.println(firsturunler + " = " + firstsepetteki + " " + firsturunler.contains(firstsepetteki)); //gormek icin yazdirdim
            Assert.assertTrue(firsturunler.contains(firstsepetteki));
        }

        System.out.println("***********************");
        iterator1 = urunler.values().iterator();
        iterator2 = sepettekiler.values().iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            String first = iterator1.next();
            String second = iterator2.next();
            System.out.println(first + " = " + second + " " + first.contains(second));
            Assert.assertEquals(first, second);


        }
    }
}