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

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class KYGames extends config {
  public static Screen screen = new Screen();
  URL resourceFolderURL =this.getClass().getClassLoader().getResource("images");
  public String baseImagePath;
  public WebDriver driver;
  public static Logger logger = (Logger) LogManager.getLogger(KYGames.class);


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
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_info,120).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_audio,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_close,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_increase,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_try,20).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_revealAll,60).click();
screen.wait(baseImagePath+kYlotteryPage.a50xthecash_try2,30);
  }

    @Test
  public void bankaBitGameShow() throws URISyntaxException, FindFailed {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath = resourceFolderURL.toURI().getPath()+kYlotteryPage.bankaBitGameShow;
    driver.get(kYlotteryPage.BaseURL_bankaBitGameShow);
    screen.wait(baseImagePath+kYlotteryPage.bankaBitGameShow_audio,120).click();
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
    screen.wait(baseImagePath+kYlotteryPage.candyCashCane_info,120).click();
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
    screen.wait(baseImagePath+kYlotteryPage.beachBonanza_fp,120).click();
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

  @Test
  public void celticClouds() throws URISyntaxException, FindFailed

  {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath = resourceFolderURL.toURI().getPath()+kYlotteryPage.celticClouds;
    driver.get(kYlotteryPage.BaseURL_celtiClouds);
    screen.wait(baseImagePath+kYlotteryPage.celticClouds_info,120).click();
    screen.wait(baseImagePath+kYlotteryPage.celtiClouds_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.celtiClouds_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.celtiClouds_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.celtiClouds_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.celtiClouds_revealAll,60).click();
    screen.wait(baseImagePath+kYlotteryPage.celtiClouds_try2,60).click();

  }
  @Test
  public void loteria() throws URISyntaxException,FindFailed
  {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath= resourceFolderURL.toURI().getPath()+kYlotteryPage.loteria;
    driver.get(kYlotteryPage.BaseURL_loteria);
    screen.wait(baseImagePath+kYlotteryPage.loteria_audio,120).click();
    screen.wait(baseImagePath+kYlotteryPage.loteria_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.loteria_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.loteria_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.loteria_revealAll,60).click();
    screen.wait(baseImagePath+kYlotteryPage.loteria_tryagain,60).click();

  }
  @Test
  public void luckys7() throws URISyntaxException,FindFailed
  {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath = resourceFolderURL.toURI().getPath()+kYlotteryPage.luckys7;
    driver.get(kYlotteryPage.BaseURL_luckys7);
    screen.wait(baseImagePath+kYlotteryPage.luckys7_info,120).click();
    screen.wait(baseImagePath+kYlotteryPage.luckys7_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.luckys7_close,60).click();
    screen.wait(baseImagePath+kYlotteryPage.luckys7_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.luckys7_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.luckys7_revealAll,60).click();
    screen.wait(baseImagePath+kYlotteryPage.luckys7_tryagain,60).click();
  }
  @Test
  public void silverStarSuperme() throws URISyntaxException,FindFailed
  {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath=resourceFolderURL.toURI().getPath()+kYlotteryPage.silverStarSuperme;
    driver.get(kYlotteryPage.BaseURL_silverStarSuperme);
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_info,120).click();
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_revealAll,60).click();
    screen.wait(baseImagePath+kYlotteryPage.silverStarSuperme_tryagain,60).click();
  }
  @Test
  public void ticTacTemple() throws URISyntaxException,FindFailed
  {
    KYlotteryPage kYlotteryPage = new KYlotteryPage(driver);
    baseImagePath=resourceFolderURL.toURI().getPath()+kYlotteryPage.ticTacTemple;
    driver.get(kYlotteryPage.BaseURL_tictacTemple);
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_info,120).click();
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_play,60).click();
    screen.wait(baseImagePath+kYlotteryPage.tictacTemple_tryagain,60).click();
  }
  @Test
  public void volcanoCash() throws URISyntaxException,FindFailed
  {
    KYlotteryPage kYlotteryPage= new KYlotteryPage(driver);
    baseImagePath=resourceFolderURL.toURI().getPath()+kYlotteryPage.volcanoCash;
    driver.get(kYlotteryPage.BaseURL_volcanoCash);
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_fp,120).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_setting,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_audio,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_allsound,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_ok,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_decrease,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_increase,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_try,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_autoplay,60).click();
    screen.wait(baseImagePath+kYlotteryPage.volcanoCash_tryagain,60).click();

  }

}
