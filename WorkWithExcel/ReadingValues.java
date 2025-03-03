package Selenium_With_Java.WorkWithNumbers_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingValues {
    public static void main(String[] args) throws IOException {

        // Load the Excel file
        FileInputStream fis = new FileInputStream("/Users/shahirbilagi/IdeaProjects/MainFile/src/Selenium_With_Java/WorkWithNumbers_Excel/Cars.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet 1");
        int rowNum = sheet.getLastRowNum();
        int Cells = sheet.getRow(1).getLastCellNum();
        System.out.println("Total Rows are:" + rowNum);
        System.out.println("Cell number is " + Cells);

        for (int i = 1; i <= rowNum; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row == null) {
                System.out.println("Row " + i + " is empty or does not exist.");
                continue; // Skip this row if it's null
            }

            for (int j = 0; j < Cells; j++) { // Cell indices should start from 0
                XSSFCell cell = row.getCell(j);
                if (cell == null) {
                    System.out.print("EMPTY\t");
                } else {
                    System.out.print(cell.toString() + "\t");
                }
            }
            System.out.println();
        }

    }
}
