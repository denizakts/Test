package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class tes2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String url ="https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);
     WebElement cbox1= driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
     WebElement cbox2=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
        if(!cbox1.isSelected())
        {
            Thread.sleep(2000);
            cbox1.click();
        }
        Thread.sleep(2000);
        if(!cbox2.isSelected())
        {
            cbox2.click();
        }

    driver.quit();
    }
}
