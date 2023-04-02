package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Jsalerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.get(url);
        WebElement alertButton1 = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        WebElement result = driver.findElement(By.id("result"));
        alertButton1.click();
        driver.switchTo().alert().accept();
        String expectedresult = "You successfully clicked an alert";
        String actualResult = result.getText();
        if (expectedresult.equals(actualResult))
        {
            System.out.println("Passed");
        }else
            System.out.println("Failed");
        Thread.sleep(2000);
        driver.quit();
    }
}
