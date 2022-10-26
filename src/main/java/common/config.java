package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

    public WebDriver inizialize_driver(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\a.savchenko\\Desktop\\SIINFO\\RINGMASTER\\chromedriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        tdriver.set(driver);
        return getDriver();
    }

    public static synchronized WebDriver getDriver(){
        return tdriver.get();
    }

    public void closeBrowser() throws InterruptedException {
        driver.close();
    }
}
