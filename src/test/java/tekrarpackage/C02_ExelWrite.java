package tekrarpackage;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C02_ExelWrite {
    @Test
    public void name() throws Exception {

        String path="./src/test/java/resources/Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
       Workbook workbook=WorkbookFactory.create(fileInputStream);
       Sheet sheet1= workbook.getSheet("Sheet1");
       Row row1=sheet1.getRow(0);
       Cell cell1=row1.createCell(6);
       cell1.setCellValue("SalihGunay");


        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);



    }
}
