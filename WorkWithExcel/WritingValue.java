package Selenium_With_Java.WorkWithNumbers_Excel;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingValue {
    public static void main(String[] args) throws IOException {
        // Load the Excel file

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Sheet");

        // Creating header row
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("Car Number");
        row.createCell(1).setCellValue("Car Type");
        row.createCell(2).setCellValue("Car Model");
        row.createCell(3).setCellValue("Car Year");

        // Adding car details
        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("MH12AB1234");
        row1.createCell(1).setCellValue("Sedan");
        row1.createCell(2).setCellValue("Honda City");
        row1.createCell(3).setCellValue("2021");

        XSSFRow row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("KA05CD5678");
        row2.createCell(1).setCellValue("SUV");
        row2.createCell(2).setCellValue("Toyota Fortuner");
        row2.createCell(3).setCellValue("2022");

        XSSFRow row3 = sheet.createRow(3);
        row3.createCell(0).setCellValue("DL08EF9101");
        row3.createCell(1).setCellValue("Hatchback");
        row3.createCell(2).setCellValue("Maruti Swift");
        row3.createCell(3).setCellValue("2020");

        XSSFRow row4 = sheet.createRow(4);
        row4.createCell(0).setCellValue("TN09GH2345");
        row4.createCell(1).setCellValue("Coupe");
        row4.createCell(2).setCellValue("BMW M4");
        row4.createCell(3).setCellValue("2023");

        FileOutputStream fis = new FileOutputStream("/Users/shahirbilagi/IdeaProjects/MainFile/src/Selenium_With_Java/WorkWithNumbers_Excel/CarExample.xlsx");
        workbook.write(fis);
        fis.close();
        System.out.println("Done");
    }
}
