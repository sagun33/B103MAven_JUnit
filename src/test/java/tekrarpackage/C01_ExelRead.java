//package tekrarpackage;
//import org.apache.poi.ss.usermodel.*;
//import org.junit.Assert;
//import org.junit.Test;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.junit.Test;
//import utilities.TestBase;
//
//import java.io.FileInputStream;
//
//public class C01_ExelRead extends TestBase {
//    @Test
//    public void name() throws Exception {
////        String path="./src/test/java/resources/Capitals.xlsx";
////        FileInputStream fileInputStream=new FileInputStream(path);
////        Workbook workbook= WorkbookFactory.create(fileInputStream);
////        Sheet sheet1=workbook.getSheet("Sheet1");
////        Row row1=sheet1.getRow(0);
////        Cell cell1=row1.getCell(0);
////        System.out.println(cell1);
////        Cell cell1_2=sheet1.getRow(0).getCell(1);
////        System.out.println(cell1_2);
////        Cell cell2_2=sheet1.getRow(1).getCell(1);
////        System.out.println(cell2_2);
////        Cell cell3_3=sheet1.getRow(2).getCell(2);
////        System.out.println(cell1_2);
////        Cell cell4_4=sheet1.getRow(3).getCell(3);
////        System.out.println(cell4_4);
////        Cell cell5_5=sheet1.getRow(4).getCell(4);
////        System.out.println(cell5_5);
////        Assert.assertEquals("COUNTRY",cell1.toString());
////        Assert.assertEquals("CAPITAL",cell1_2.toString());
////        int toplamSatirSayisi=sheet1.getLastRowNum()+1;
////        System.out.println(toplamSatirSayisi);
////        int kullanilanToplamSatirSayisi=sheet1.getPhysicalNumberOfRows();
////        System.out.println(kullanilanToplamSatirSayisi);
////        Map<String,String>ulkeVeBaskentler=new HashMap<>();
////        for (int i = 1; i < kullanilanToplamSatirSayisi; i++) {
////            String ulkeler=sheet1.getRow(i).getCell(0).toString();
////            String baskentler=sheet1.getRow(i).getCell(1).toString();
////            ulkeVeBaskentler.put(ulkeler,baskentler);
////        }
////        System.out.println("ulkeVeBaskentleri = " + ulkeVeBaskentler);
//
//
//Cell cell=getData("./src/test/java/resources/Capitals.xlsx","sheet1",0,0);
//        System.out.println("cell = " + cell);
//        Cell cell1=getData("./src/test/java/resources/103 QA Test Case Ornek (1) (1).xlsx","örnek sablon",0,1);
//        System.out.println(cell1);
//
//
//
//
//    }
//}
