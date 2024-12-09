package testng.testngassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEg {
    // if any test going to fail then it will keep continue execution
    @Test
    public void VerifySoftAssertion() {

        WebDriver driver = new ChromeDriver();
        // for softassert object creation is must
        SoftAssert sf=new SoftAssert();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        // soft assert will continue execution even condition is false
        sf.assertEquals(driver.getTitle(), "Rediffmail - Free Email for Login with Secure Access","title should be same" );
        sf.assertTrue(driver.findElement(By.id("login1")).isDisplayed(),"username textbox should be displayed");
        System.out.println("Hello..");
        sf.assertAll();
        driver.quit();
    }
}
