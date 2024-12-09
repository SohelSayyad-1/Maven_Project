package testng.testngassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionEg {
// if any test going to fail then it will stop execution or terminate execution
    @Test
    public void VerifyTestMethod() {
       // Assert a=new Assert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Assert.assertEquals(driver.getTitle(),"Rediffmail - Free Email for Login with Secure Access","Title should be match");
        driver.findElement(By.id("login1")).isDisplayed();
        System.out.println("Hello..");
        driver.quit();
    }
}
