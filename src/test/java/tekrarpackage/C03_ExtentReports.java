package tekrarpackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;


public class C03_ExtentReports extends TestBase {
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;
    @Test
    public void name()  {
        String currentTime=new SimpleDateFormat("yyyyMMMMddhhmmss").format(new Date());
        String path=System.getProperty("user.dir")+"/test-output/reports/"+currentTime+"html_report.html";
        extentHtmlReporter=new ExtentHtmlReporter(path);
        extentReports=new ExtentReports();

        extentReports.setSystemInfo("Test Cesidi","Manuel Test");
        extentReports.setSystemInfo("cas","amazon");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Grup","kartallar");
        extentReports.setSystemInfo("QA","Salih");

        extentHtmlReporter.config().setDocumentTitle("Ana Basllik");
        extentHtmlReporter.config().setDocumentTitle("Test sonucu");



        extentReports.attachReporter(extentHtmlReporter);
        extentTest=extentReports.createTest("Extent Report Login Test","Smoke Test Raporu");
        extentTest.pass("salih adrese gider");
        driver.get("https:///www.amazon.com");
        extentTest.pass("bir urune tiklar");



    }
}
