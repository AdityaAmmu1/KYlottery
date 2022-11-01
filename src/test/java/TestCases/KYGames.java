package TestCases;

import PageObject.KYlotteryPage;
import common.config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
  public static Logger logger = LogManager.getLogger(KYGames.class);


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
  public void a50xthecash() throws URISyntaxException, FindFailed
  {

    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
baseImagePath =resourceFolderURL.toURI().getPath() +kYlotteryPage.a50xthecash;
driver.get(kYlotteryPage.BaseURL_50xthecash);
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_info,100).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_audio,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_close,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_increase,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_try,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_revealall,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_try2,30);
  }

    @Test
  public void bankaBitGameShow() throws URISyntaxException, FindFailed {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath = resourceFolderURL.toURI().getPath()+kYlotteryPage.bankaBitGameShow;
    driver.get(kYlotteryPage.BaseURL_bankaBitGameShow);
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_decrease,60).click();
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_autoplay,60).click();
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_tryagain,60).click();
     }

  @Test
  public void candyCashCane() throws URISyntaxException, FindFailed {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath = resourceFolderURL.toURI().getPath()+kYlotteryPage.candyCashCane;
    driver.get(kYlotteryPage.BaseURL_candyCashCane);
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_info,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_decrease,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_revealAll,60).click();
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_tryagain,60).click();
  }

  @Test
  public void beachBonanza() throws URISyntaxException, FindFailed {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath = resourceFolderURL.toURI().getPath()+kYlotteryPage.beachBonanza;
    driver.get(kYlotteryPage.BaseURL_beachBonanza);
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_fp,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_settings,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_allsounds,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_decrease,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_autoplay,60).click();
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_tryagain,60).click();
  }

}
