package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterEg {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequisite(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
        driver.get("https://www.amazon.in/");
    }
    @Test
    public void test2(){
        driver.get("https://www.facebook.in/");
    }
    @Test
    public void test3(){
        driver.get("https://www.google.in/");
    }
    @AfterMethod
    public void postRequisite(){
        driver.close();
    }
}
