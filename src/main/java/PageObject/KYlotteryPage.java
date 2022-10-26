package PageObject;

import common.config;
import org.openqa.selenium.WebDriver;
//import org.sikuli.script.Screen;
import java.net.URL;

public class KYlotteryPage extends config {
    public WebDriver driver;
//    public Screen screen;
    public String baseImgPath;
    public URL resourceFolderURL = this.getClass().getClassLoader().getResource("images");

    public KYlotteryPage(WebDriver d){driver = d;}

    //
    public String a50xthecash = "/50xthecash/";

    public String Bankabitgameshow = "/Bankabitgameshow/";

    public String beachbonanza = "/beachbonanza/";

    public String candycashcane = "/candycashcane/";

    public String celticclouds = "/celticclouds/";

    public String Davinvidiamonds = "/Davinvidiamonds/";

    public String DazzlingDiamondsDeluxe = "/DazzlingDiamondsDeluxe/";

    public String dragonspawn = "/dragonspawn/";

    public String Dualcrosswordcraze = "/Dualcrosswordcraze/";

    public String EgyptianFortunes = "/EgyptianFortunes/";

    public String emoticollect = "/emoticollect/";

    //All games
    //50xthecash
    public String a50xthecash_audio = "50xthecash_audio.png";
    public String a50xthecash_close = "50xthecash_close";
    public String a50xthecash_decrease = "50xthecash_decrease";
    public String a50xthecash_increase = "50xthecash_increase.png";
    public String a50xthecash_info = "50xthecash_info.png";
    public String a50xthecash_revealall = "50xthecash_revealall.png";
    public String a50xthecash_try = "50xthecash_try.png";
    public String a50xthecash_try2 = "50xthecash_try2.png";
    public String BaseURL_50xthecash = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2184-002&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //Bankabitgameshow
    public String Bankabitgameshow_audio = "Bankabitgameshow_audio.png";
    public String Bankabitgameshow_ok = "Bankabitgameshow_ok.png";
    public String Bankabitgameshow_decrease = "Bankabitgameshow_decrease.png";
    public String Bankabitgameshow_increase = "Bankabitgameshow_increase.png";
    public String Bankabitgameshow_try = "Bankabitgameshow_try.png";
    public String Bankabitgameshow_autoplay = "Bankabitgameshow_autoplay.png";
    public String Bankabitgameshow_tryagain = "Bankabitgameshow_tryagain.png";
    public String BaseURL_Bankabitgameshow = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2083-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //beachbonanza
    public String beachbonanza_audio = "beachbonanza_audio.png";
    public String beachbonanza_ok = "beachbonanza_ok.png";
    public String beachbonanza_decrease = "beachbonanza_decrease.png";
    public String beachbonanza_increase = "beachbonanza_increase.png";
    public String beachbonanza_try = "beachbonanza_try.png";
    public String beachbonanza_autoplay = "beachbonanza_autoplay.png";
    public String beachbonanza_tryagain = "beachbonanza_tryagain.png";
    public String BaseURL_beachbonanza = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2083-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //
    //beachbonanza
//    public String beachbonanza_audio = "beachbonanza_audio.png";
//    public String beachbonanza_ok = "beachbonanza_ok.png";
//    public String beachbonanza_decrease = "beachbonanza_decrease.png";
//    public String beachbonanza_increase = "beachbonanza_increase.png";
//    public String beachbonanza_try = "beachbonanza_try.png";
//    public String beachbonanza_autoplay = "beachbonanza_autoplay.png";
//    public String beachbonanza_tryagain = "beachbonanza_tryagain.png";
//    public String BaseURL_beachbonanza = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2083-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";



}
