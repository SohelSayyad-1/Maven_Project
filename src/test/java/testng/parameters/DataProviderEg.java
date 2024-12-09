package testng.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderEg {
    @DataProvider(name="testcheck")
    public Object[][] testData(){
       return new Object[][]{
               {"java", "pune"},
               {"selenium","Mumbai"},
               {"testng", "Benglore"}
       };
    }
    @Test(dataProvider="testcheck")
    public void VerifyGogglesrch(String coursename,String cityname) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement srch=driver.findElement(By.name("q"));
        srch.sendKeys(coursename + " " +cityname);
        srch.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
}
}