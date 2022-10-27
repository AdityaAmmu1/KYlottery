package TestCases;

import PageObject.KYlotteryPage;
import common.config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URISyntaxException;
import java.net.URL;

public class KYGames extends config {
  public static Screen screen = new Screen();
  URL resourceFolderURL =this.getClass().getClassLoader().getResource("images");
  public String baseImagePath;
  public WebDriver driver;

  @BeforeClass(description = "Go to Ky Lottery")
  public void goToKYgames(){
  driver = new config().inizialize_driver();
  }
  @AfterClass(description = "Close browser")
  public void closeBrowser() throws InterruptedException {
    Thread.sleep(10000);
    driver.close();
  }

  @Test
  public void a50xthecash() throws URISyntaxException, FindFailed {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
baseImagePath =resourceFolderURL.toURI().getPath() +kYlotteryPage.a50xthecash;
driver.get(kYlotteryPage.BaseURL_50xthecash);
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_info,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_audio,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_close,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_increase,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_try,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_revealall,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_try2);
    }
}
