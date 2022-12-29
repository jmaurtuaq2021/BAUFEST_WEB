package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static JavascriptExecutor js;

    public BasePage(WebDriver d) {
        driver=d;
        wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        PageFactory.initElements(driver,this);
        js= (JavascriptExecutor) driver;
    }
}
