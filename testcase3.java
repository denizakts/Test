package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class testcase3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String url ="https://the-internet.herokuapp.com/javascript_alerts";
        driver.get(url);
        WebElement button = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        button.click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Deniz Aktas");
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.id("result"));
        String actualResult = result.getText();
        String expectedResult = "You entered: Deniz Aktas";
        Thread.sleep(2000);
        if (expectedResult.equals(actualResult))
        {
            System.out.println("Passed");
        }else
            System.out.println("Failed");
        Thread.sleep(2000);
        driver.quit();





    }
}
