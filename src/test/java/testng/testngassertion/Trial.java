package testng.testngassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Trial {

@Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
        we.sendKeys("iphone 13 128gb ");
        Thread.sleep(4000);

    WebElement we1 = driver.findElement(By.xpath("//span[@class='s-heavy']"));
    we1.click();
    Thread.sleep(4000);

        WebElement clk = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        clk.click();
        Thread.sleep(4000);

        WebElement add = driver.findElement(By.name("submit.add-to-cart"));
        add.click();
        Thread.sleep(4000);

        WebElement c = driver.findElement(By.id("attach-sidesheet-checkout-button-announce"));
        c.click();
        Thread.sleep(4000);
        driver.close();
    }
    }
