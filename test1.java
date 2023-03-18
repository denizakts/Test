package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        System.out.println("Maximize : "+driver.manage().window().getPosition());
        driver.manage().window().minimize();
        System.out.println("Minimize : " +driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(1200,600));
        int xKoor = driver.manage().window().getPosition().getX();
        int yKoor = driver.manage().window().getPosition().getY();
        int widtht = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        if (xKoor==0 && yKoor ==0 && widtht==1200 && height==600)
        {
            System.out.println("Passed");
        }else System.out.println("Not Passed");
        driver.quit();
    }


}
