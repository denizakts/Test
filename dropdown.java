package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class dropdown {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String url = "https://www.amazon.com.tr/";
        driver.get(url);
        driver.findElement(By.xpath("//input[@class='a-button-input celwidget']")).click();
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        System.out.println("3 : "+select.getFirstSelectedOption().getText());
        List<WebElement> optionList = select.getOptions();
        int sayac=0;
        System.out.println("\n");
        for (WebElement w :optionList) {
            System.out.println(sayac+" : " +w.getText());
            sayac++;
        }



    }
}
