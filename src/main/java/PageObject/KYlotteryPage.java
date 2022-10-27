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
    public String beachbonanza_fp = "beachbonanza_fp.png";
    public String beachbonanza_settings = "beachbonanza_settings.png";
    public String beachbonanza_audio = "beachbonanza_audio.png";
    public String beachbonanza_allsounds = "beachbonanza_allsounds.png";
    public String beachbonanza_ok = "beachbonanza_ok.png";
    public String beachbonanza_decrease = "beachbonanza_decrease.png";
    public String beachbonanza_increase = "beachbonanza_increase.png";
    public String beachbonanza_try = "beachbonanza_try.png";
    public String beachbonanza_autoplay = "beachbonanza_autoplay.png";
    public String beachbonanza_tryagain = "beachbonanza_tryagain.png";
    public String BaseURL_beachbonanza = "";

    //candycashcane
    public String candycashcane_info = "candycashcane_info.png";
    public String candycashcane_audio = "candycashcane_audio.png";
    public String candycashcane_ok = "candycashcane_ok.png";
    public String candycashcane_decrease = "candycashcane_decrease.png";
    public String candycashcane_increase = "candycashcane_increase.png";
    public String candycashcane_try = "candycashcane_try.png";
    public String candycashcane_revealAll = "candycashcane_revealAll.png";
    public String candycashcane_tryagain = "candycashcane_tryagain.png";
    public String BaseURL_candycashcane = "";

    //celticclouds
    public String celticclouds_info = "celticclouds_info.png";
    public String celticlouds_audio = "celticlouds_audio.png";
    public String celticlouds_ok = "celticlouds_ok.png";
    public String celticlouds_increase = "celticlouds_increase.png";
    public String celticlouds_try = "celticlouds_try.png";
    public String celticlouds_revealAll = "celticlouds_revealAll.png";
    public String celticlouds_try2 = "celticlouds_try2.png";
    public String BaseURL_celticlouds = "";

    //Davinvidiamonds
    //public String Davinvidiamonds_info = "Davinvidiamonds_info.png";
    public String Davinvidiamonds_audio = "Davinvidiamonds_audio.png";
    public String Davinvidiamonds_ok = "Davinvidiamonds_ok.png";
    public String Davinvidiamonds_increase = "Davinvidiamonds_increase.png";
    public String Davinvidiamonds_try = "Davinvidiamonds_try.png";
    public String Davinvidiamonds_revealAll = "Davinvidiamonds_revealAll.png";
    public String Davinvidiamonds_try2 = "Davinvidiamonds_try2.png";
    public String BaseURL_Davinvidiamonds = "";

    //DazzlingDiamondDeluxe
    public String DazzlingDiamondDeluxe_info = "DazzlingDiamondDeluxe_info.png";
    public String DazzlingDiamondDeluxe_audio = "DazzlingDiamondDeluxe_audio.png";
    public String DazzlingDiamondDeluxe_ok = "DazzlingDiamondDeluxe_ok.png";
    public String DazzlingDiamondDeluxe_increase = "DazzlingDiamondDeluxe_increase.png";
    public String DazzlingDiamondDeluxe_try ="DazzlingDiamondDeluxe_try.png";
    public String DazzlingDiamondDeluxe_revealAll = "DazzlingDiamondDeluxe_revealAll.png";
    public String DazzlingDiamondDeluxe_try2 = "DazzlingDiamondDeluxe_try.png";
    public String BaseURL_DazzlingDiamondDeluxe = "";

    //dragonSpawn
    public String dragonSpawn_fp = "dragonSpawn_fp.png";
    public String dragonSpawn_settings = "dragonSpawn_settings.png";
    public String dragonSpawn_audio = "dragonSpawn_audio.png";
    public String dragonSpawn_allsounds = "dragonSpawn_allsounds.png";
    public String dragonSpawn_ok = "dragonSpawn_ok.png";
    public String dragonSpawn_decrease = "dragonSpawn_decrease.png";
    public String dragonSpawn_increase = "dragonSpawn_increase.png";
    public String dragonSpawn_try = "dragonSpawn_try.png";
   // public String dragonSpawn_autoplay = "dragonSpawn_autoplay.png";
    public String dragonSpawn_tryagain = "dragonSpawn_tryagain.png";
    public String BaseURL_dragonSpawn = "";

    //dualCrossWordCraze
    public String dualCrossWordCraze_audio = "dragonSpawn_audio.png";
    public String dualCrossWordCraze_ok = "dragonSpawn_ok.png";
    public String dualCrossWordCraze_increase = "dragonSpawn_increase.png";
    public String dualCrossWordCraze_decrease = "dragonSpawn_decrease.png";
    public String dualCrossWordCraze_try = "dragonSpawn_try.png";

    //egyptianFortunes
    public String egyptianFortunes_info = "egyptianFortunes_info.png";
    public String egyptianFortunes_audio = "egyptianFortunes_audio.png";
    public String egyptianFortunes_ok = "egyptianFortunes_ok.png";
    public String egyptianFortunes_increase = "egyptianFortunes_increase.png";
    public String egyptianFortunes_decrease = "egyptianFortunes_decrease.png";
    public String egyptianFortunes_try = "egyptianFortunes_try.png";
    public String egyptianFortunes_revealAll = "egyptianFortunes_revealAll";

    //emotiCollect
    //public String emotiCollect_info = "emotiCollect_info.png";
    public String emotiCollect_audio = "emotiCollect_audio.png";
    public String emotiCollect_ok = "emotiCollect_ok.png";
    public String emotiCollect_increase = "emotiCollect_increase.png";
    public String emotiCollect_decrease = "emotiCollect_decrease.png";
    public String emotiCollect_try = "emotiCollect_try.png";
    public String emotiCollect_autoPlay = "emotiCollect_autoPlay.png";
    public String emotiCollect_try2 = "emotiCollect_try2.png";

    //emotiCollectSuperSpin
    public String emotiCollectSuperSpin_info = "emotiCollectSuperSpin_info.png";
    public String emotiCollectSuperSpin_audio = "emotiCollectSuperSpin_audio.png";
    public String emotiCollectSuperSpin_ok = "emotiCollectSuperSpin_ok.png";
    //public String emotiCollectSuperSpin_increase = "emotiCollectSuperSpin_increase.png";
    public String emotiCollectSuperSpin_decrease = "emotiCollectSuperSpin_decrease.png";
    public String emotiCollectSuperSpin_try = "emotiCollectSuperSpin_try.png";
    public String emotiCollectSuperSpin_autoPlay = "emotiCollectSuperSpin_autoPlay.png";
    public String emotiCollectSuperSpin_try2 = "emotiCollectSuperSpin_try2.png";

    //emotiCollectVactionRiches
    public String emotiCollectVactionRiches_fp = "emotiCollectVactionRiches_fp.png";
    public String emotiCollectVactionRiches_settings = "emotiCollectVactionRiches_settings.png";
    public String emotiCollectVactionRiches_audio = "emotiCollectVactionRiches_audio.png";
    public String emotiCollectVactionRiches_allsounds = "emotiCollectVactionRiches_allsounds.png";
    public String emotiCollectVactionRiches_ok = "emotiCollectVactionRiches_ok.png";
    public String emotiCollectVactionRiches_decrease = "emotiCollectVactionRiches_decrease.png";
    public String emotiCollectVactionRiches_increase = "emotiCollectVactionRiches_increase.png";
    public String emotiCollectVactionRiches_try = "emotiCollectVactionRiches_try.png";
    public String emotiCollectVactionRiches_autoplay = "emotiCollectVactionRiches_autoplay.png";
    public String emotiCollectVactionRiches_tryagain = "emotiCollectVactionRiches_tryagain.png";
    public String BaseURL_emotiCollectVactionRiches = "";

    //extremeCashSpectacular
    public String extremeCashSpectacular_info = "extremeCashSpectacular_info.png";
    public String extremeCashSpectacular_audio = "extremeCashSpectacular_audio.png";
    public String extremeCashSpectacular_ok = "extremeCashSpectacular_ok.png";
    public String extremeCashSpectacular_decrease = "extremeCashSpectacular_decrease.png";
    public String extremeCashSpectacular_increase = "extremeCashSpectacular_increase.png";
    public String extremeCashSpectacular_try = "extremeCashSpectacular_try.png";
    public String extremeCashSpectacular_revealall = "extremeCashSpectacular_revealall.png";
    public String BaseURL_extremeCashSpectacular = "";

    //fiveCardCash
    public String fiveCardCash_info = "fiveCardCash_info.png";
    public String fiveCardCash_audio = "fiveCardCash_audio.png";
    public String fiveCardCash_ok = "fiveCardCash_ok.png";
    public String fiveCardCash_decrease = "fiveCardCash_decrease.png";
    public String fiveCardCash_increase = "fiveCardCash_increase.png";
    public String fiveCardCash_try = "fiveCardCash_try.png";
    public String fiveCardCash_autoplay = "fiveCardCash_autoplay.png";
    public String fiveCardCash_try2 = "fiveCardCash_try2.png";
    public String BaseURL_fiveCardCash = "";

    //fortuneFest
    public String fortuneFest_info = "fortuneFest_info.png";
    public String fortuneFest_audio = "fortuneFest_audio.png";
    public String fortuneFest_ok = "fortuneFest_ok.png";
    public String fortuneFest_decrease = "fortuneFest_decrease.png";
    public String fortuneFest_increase = "fortuneFest_increase.png";
    public String fortuneFest_try = "fortuneFest_try.png";
    public String fortuneFest_revealall = "fortuneFest_revealall.png";
    //public String fortuneFest_try2 = "fiveCardCash_try2.png";
    public String BaseURL_fortuneFest = "";

    //fortuneSkies

}
