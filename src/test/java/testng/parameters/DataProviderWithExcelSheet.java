package testng.parameters;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelSheet {
    @DataProvider(name = "testcheck")
    public Object[][] testData() throws IOException {
        Object[][] arrayobj = getExcelsheetdata("D:\\Sohel\\Edso\\Dataprovider.xlsx", "dataProvider");

        return arrayobj;
    }

    public String[][] getExcelsheetdata(String filePath, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook Wb = new XSSFWorkbook(fileInputStream); // to fetch excel file
        XSSFSheet sheet = Wb.getSheet(sheetName); // access the particular sheet of excel file
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfclm = row.getLastCellNum();
        Cell cell;

        String [][] data=new String[noOfRows][noOfclm];
        for (int i=1;i<noOfRows;i++){  //fetching values of rows
            for (int j=0; j<noOfclm; j++){ //fetching values of columns
                row=sheet.getRow(i);
                cell=row.getCell(j);
                data[i][j]=cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider="testcheck")
    public void Verifysrch(String Coursename,String Cityname) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement srch=driver.findElement(By.name("q"));
        srch.sendKeys(Coursename + " "+ Cityname);
        srch.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
