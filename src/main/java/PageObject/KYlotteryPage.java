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

    public String bankaBitGameShow = "/bankaBitGameShow/";

    public String beachBonanza = "/beachBonanza/";

    public String candyCashCane = "/candyCashCane/";

    public String celticClouds = "/celticClouds/";

    public String davinviDiamonds = "/davinviDiamonds/";

    public String dazzlingDiamondsDeluxe = "/dazzlingDiamondsDeluxe/";

    public String dragonSpawn = "/dragonSpawn/";

    public String dualCrosswordCraze = "/dualCrosswordCraze/";

    public String egyptianFortunes = "/egyptianFortunes/";

    public String emoticollect = "/emotiCollect/";

    public String lilLadyWinningWords = "/lilLadyWinningWords/";

    public String loteria = "/loteria/";

    public String luckys7 = "/luckys7/";

    public String siberianStorm = "/siberianStorm/";

    public String silverStarSuperme = "/silverStarSuperme/";

    public String spookyCashBoonanza = "/spookyCashBoonanza/";

    public String starshipKenoMultipler = "/starshipKenoMultipler/";

    public String supermeSoocer = "/supermeSoocer/";

    public String thunderousFortunes = "/thunderousFortunes/";

    public String ticTacTemple = "/ticTacTemple/";

    public String vipGoldGrant = "/vipGoldGrant/";

    public String volcanoCash = "/volcanoCash/";

    public String wilds8 = "/wilds8/";


    //All games
    //50xthecash
    public String a50xthecash_audio = "50xthecash_audio.png";
    public String a50xthecash_close = "50xthecash_close";
    public String a50xthecash_decrease = "50xthecash_decrease";
    public String a50xthecash_increase = "50xthecash_increase.png";
    public String a50xthecash_info = "50xthecash_info.png";
    public String a50xthecash_revealAll = "50xthecash_revealall.png";
    public String a50xthecash_try = "50xthecash_try.png";
    public String a50xthecash_try2 = "50xthecash_try2.png";
    public String BaseURL_50xthecash = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2184-002&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //Bankabitgameshow
    public String bankaBitGameShow_audio = "bankaBitGameShow_audio.png";
    public String bankaBitGameShow_ok = "bankaBitGameShow_ok.png";
    public String bankaBitGameShow_decrease = "bankaBitGameShow_decrease.png";
    public String bankaBitGameShow_increase = "bankaBitGameShow_increase.png";
    public String bankaBitGameShow_try = "bankaBitGameShow_try.png";
    public String bankaBitGameShow_autoplay = "bankaBitGameShow_autoplay.png";
    public String bankaBitGameShow_tryagain = "bankaBitGameShow_tryagain.png";
    public String BaseURL_bankaBitGameShow = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2083-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //beachbonanza
    public String beachBonanza_fp = "beachBonanza_fp.png";
    public String beachBonanza_settings = "beachBonanza_settings.png";
    public String beachBonanza_audio = "beachBonanza_audio.png";
    public String beachBonanza_allsounds = "beachBonanza_allsounds.png";
    public String beachBonanza_ok = "beachBonanza_ok.png";
    public String beachBonanza_decrease = "beachBonanza_decrease.png";
    public String beachBonanza_increase = "beachBonanza_increase.png";
    public String beachBonanza_try = "beachBonanza_try.png";
    public String beachBonanza_autoplay = "beachBonanza_autoplay.png";
    public String beachBonanza_tryagain = "beachBonanza_tryagain.png";
    public String BaseURL_beachBonanza = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2231-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //candycashcane
    public String candyCashCane_info = "candyCashCane_info.png";
    public String candyCashCane_audio = "candyCashCane_audio.png";
    public String candyCashCane_ok = "candyCashCane_ok.png";
    public String candyCashCane_decrease = "candyCashCane_decrease.png";
    public String candyCashCane_increase = "candyCashCane_increase.png";
    public String candyCashCane_try = "candyCashCane_try.png";
    public String candyCashCane_revealAll = "candyCashCane_revealAll.png";
    public String candyCashCane_tryagain = "candyCashCane_tryagain.png";
    public String BaseURL_candyCashCane = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2218-001&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //celticClouds
    public String celticClouds_info = "celtiClouds_info.png";
    public String celtiClouds_audio = "celtiClouds_audio.png";
    public String celtiClouds_ok = "celtiClouds_ok.png";
    public String celtiClouds_increase = "celtiClouds_increase.png";
    public String celtiClouds_try = "celtiClouds_try.png";
    public String celtiClouds_revealAll = "celtiClouds_revealAll.png";
    public String celtiClouds_try2 = "celtiClouds_try2.png";
    public String BaseURL_celtiClouds = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2144-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //davinviDiamonds
    //public String Davinvidiamonds_info = "Davinvidiamonds_info.png";
    public String davinviDiamonds_audio = "davinviDiamonds_audio.png";
    public String davinviDiamonds_ok = "davinviDiamonds_ok.png";
    public String davinviDiamonds_increase = "davinviDiamonds_increase.png";
    public String davinviDiamonds_try = "davinviDiamonds_try.png";
    public String davinviDiamonds_revealAll = "davinviDiamonds_revealAll.png";
    public String davinviDiamonds_try2 = "davinviDiamonds_try2.png";
    public String BaseURL_davinviDiamonds = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2100-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //dazzlingDiamondDeluxe
    public String dazzlingDiamondDeluxe_info = "dazzlingDiamondDeluxe_info.png";
    public String dazzlingDiamondDeluxe_audio = "dazzlingDiamondDeluxe_audio.png";
    public String dazzlingDiamondDeluxe_ok = "dazzlingDiamondDeluxe_ok.png";
    public String dazzlingDiamondDeluxe_increase = "dazzlingDiamondDeluxe_increase.png";
    public String dazzlingDiamondDeluxe_try ="dazzlingDiamondDeluxe_try.png";
    public String dazzlingDiamondDeluxe_revealAll = "dazzlingDiamondDeluxe_revealAll.png";
    public String dazzlingDiamondDeluxe_try2 = "dazzlingDiamondDeluxe_try.png";
    public String BaseURL_DazzlingDiamondDeluxe = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2176-006&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

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
    public String BaseURL_dragonSpawn = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2228-002&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

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
    public String extremeCashSpectacular_revealAll = "extremeCashSpectacular_revealAll.png";
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
    public String fortuneFest_revealAll = "fortuneFest_revealAll.png";
    //public String fortuneFest_try2 = "fiveCardCash_try2.png";
    public String BaseURL_fortuneFest = "";

    //lilLadyWinningWords
    public String lilLadyWinningWords_fp = "lilLadyWinningWords_fp.png";
    public String lilLadyWinningWords_setting = "lilLadyWinningWords_setting.png";
    public String lilLadyWinningWords_audio = "lilLadyWinningWords_audio.png";
    public String lilLadyWinningWords_allsound = "lilLadyWinningWords_allsound.png";
    public String lilLadyWinningWords_ok = "lilLadyWinningWords_ok.png";
    public String lilLadyWinningWords_decrease = "lilLadyWinningWords_decrease.png";
    public String lilLadyWinningWords_increase = "lilLadyWinningWords_increase.png";
    public String lilLadyWinningWords_try = "lilLadyWinningWords_try.png";
   // public String lilLadyWinningWords_autoplay = "thunderousFortunes_autoplay.png";
    public String BaseURL_lilLadyWinningWords="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2263-001&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

     //loteria

    public String loteria_info = "loteria_info.png";
    public String loteria_audio = "loteria_audio.png";
    public String loteria_ok = "loteria_ok.png";
    public String loteria_decrease = "loteria_decrease.png";
    public String loteria_increase = "loteria_increase.png";
    public String loteria_try = "loteria_try.png";
    public String loteria_revealAll = "loteria_autoplay.png";
    public String loteria_tryagain = "loteria_tryagain.png";
    public String BaseURL_loteria ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2099-006&channel=INT&presenttype=ST&technology=HTML&nscode=KYLT&skincode=KY01";

    //luckys7

    public String luckys7_info = "luckys7_info.png";
    public String luckys7_audio = "luckys7_audio.png";
    public String luckys7_close = "luckys7_close.png";
    public String luckys7_decrease = "luckys7_decrease.png";
    public String luckys7_increase = "luckys7_increase.png";
    public String luckys7_try = "luckys7_try.png";
    public String luckys7_revealAll = "luckys7_revealAll.png";
    public String luckys7_tryagain = "luckys7_tryagain.png";
    public String BaseURL_luckys7 ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2096-005&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //merryLittleCashMas

    public String merryLittleCashMas_info = "merryLittleCashMas_info.png";
    public String merryLittleCashMas_audio = "merryLittleCashMas_audio.png";
    public String merryLittleCashMas_ok = "merryLittleCashMas_ok.png";
    public String merryLittleCashMas_decrease = "merryLittleCashMas_decrease.png";
    public String merryLittleCashMas_increase = "merryLittleCashMas_increase.png";
    public String merryLittleCashMas_try = "merryLittleCashMas_try.png";
    public String merryLittleCashMas_revealAll = "merryLittleCashMas_revealAll.png";
    public String merryLittleCashMas_tryagain = "merryLittleCashMas_tryagain.png";
    public String BaseURL_merryLittleCashMas ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2154-002&channel=INT&presenttype=ST&technology=HTML&nscode=KYLT&skincode=KY01";

    //midasMatch

    public String midasMatch_info = "midasMatch_info.png";
    public String midasMatch_audio = "midasMatch_audio.png";
    public String midasMatch_ok = "midasMatch_ok.png";
    public String midasMatch_decrease = "midasMatch_decrease.png";
    public String midasMatch_increase = "midasMatch_increase.png";
    public String midasMatch_try = "midasMatch_try.png";
    public String midasMatch_revealAll = "midasMatch_revealAll.png";
    public String BaseURL_midasMatch = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2166-006&channel=INT&presenttype=ST&technology=HTML&nscode=KYLT&skincode=KY01";

    //moneyBank

    public String moneyBank_info = "moneyBank_info.png";
    public String moneyBank_audio = "moneyBank_audio.png";
    public String moneyBank_ok = "moneyBank_ok.png";
    public String moneyBank_decrease = "moneyBank_decrease.png";
    public String moneyBank_increase = "moneyBank_increase.png";
    public String moneyBank_try = "moneyBank_try.png";
    public String moneyBank_revealAll = "moneyBank_revealAll.png";
    public String BaseURL_moneyBank ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2083-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //moneyIsland
    public String moneyIsland_info = "moneyIsland_info.png";
    public String moneyIsland_audio = "moneyIsland_audio.png";
    public String moneyIsland_ok = "moneyIsland_ok.png";
    public String moneyIsland_decrease = "moneyIsland_decrease.png";
    public String moneyIsland_increase = "moneyIsland_increase.png";
    public String moneyIsland_try = "moneyIsland_try.png";
    public String moneyIsland_revealAll = "moneyIsland_revealAll.png";
    public String BaseURL_moneyIsland ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2179-005&channel=INT&presenttype=ST&technology=HTML&nscode=KYLT&skincode=KY01";

    //moneyMiner

    public String moneyMiner_fp = "moneyMiner_fp.png";
    public String moneyMiner_setting = "moneyMiner_setting.png";
    public String moneyMiner_audio = "moneyMiner_audio.png";
    public String moneyMiner_allsound = "moneyMiner_allsound.png";
    public String moneyMiner_ok = "moneyMiner_ok.png";
    public String moneyMiner_decrease = "moneyMiner_decrease.png";
    public String moneyMiner_increase = "moneyMiner_increase.png";
    public String moneyMiner_try = "moneyMiner_try.png";
    public String moneyMiner_play = "moneyMiner_play.png";
    public String moneyMiner_tryagain = "moneyMiner_tryagain.png";
    public String BaseURL_moneyMiner="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2226-001&channel=INT&presenttype=ST&technology=HTML&nscode=KYLT&skincode=KY01";

    //moneyStrike
    public String moneyStrike_info = "moneyStrike_info.png";
    public String moneyStrike_audio = "moneyStrike_audio.png";
    public String moneyStrike_ok = "moneyStrike_ok.png";
    public String moneyStrike_decrease = "moneyStrike_decrease.png";
    public String moneyStrike_increase = "moneyStrike_increase.png";
    public String moneyStrike_try = "moneyStrike_try.png";
    public String moneyStrike_revealAll = "moneyStrike_revealAll.png";
    public String BaseURL_moneyStrike ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2160-005&channel=INT&presenttype=ST&technology=HTML&nscode=KYLT&skincode=KY01";

    //multiplyTheCash
    public String multiplyTheCash_info = "multiplyTheCash_info.png";
    public String multiplyTheCash_audio = "multiplyTheCash_audio.png";
    public String multiplyTheCash_ok = "multiplyTheCash_ok.png";
    public String multiplyTheCash_decrease = "multiplyTheCash_decrease.png";
    public String multiplyTheCash_increase = "multiplyTheCash_increase.png";
    public String multiplyTheCash_try = "multiplyTheCash_try.png";
    public String multiplyTheCash_revealAll = "multiplyTheCash_revealAll.png";
    public String multiplyTheCash_tryagain = "multiplyTheCash_tryagain.png";
    public String BaseURL_multiplyTheCash ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2134-006&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //payoutPeak
    public String payoutPeak_audio = "payoutPeak_audio.png";
    public String payoutPeak_ok = "payoutPeak_ok.png";
    public String payoutPeak_decrease = "payoutPeak_decrease.png";
    public String payoutPeak_increase = "payoutPeak_increase.png";
    public String payoutPeak_try = "payoutPeak_try.png";
    public String payoutPeak_ok_inside = "payoutPeak_ok-inside.png";
    public String payoutPeak_autoclimb = "payoutPeak_autoclimb.png";
    public String payoutPeak_tryagain = "payoutPeak_tryagain.png";
    public String BaseURL_payoutPeak ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2172-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //piratesAndPlanks
    public String piratesAndPlanks_fp = "piratesAndPlanks_fp.png";
    public String piratesAndPlanks_setting = "piratesAndPlanks_setting.png";
    public String piratesAndPlanks_audio = "piratesAndPlanks_audio.png";
    public String piratesAndPlanks_allsound = "piratesAndPlanks_allsound.png";
    public String piratesAndPlanks_ok = "piratesAndPlanks_ok.png";
    public String piratesAndPlanks_decrease = "piratesAndPlanks_decrease.png";
    public String piratesAndPlanks_increase = "piratesAndPlanks_increase.png";
    public String piratesAndPlanks_try = "piratesAndPlanks_try.png";
    public String piratesAndPlanks_revealAll = "piratesAndPlanks_revealAll.png";
    public String BaseURL_piratesAndPlanks="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2238-001&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //potsOfPlenty
    public String potsOfPlenty_fp = "potsOfPlenty_fp.png";
    public String potsOfPlenty_setting = "potsOfPlenty_setting.png";
    public String potsOfPlenty_audio = "potsOfPlenty_audio.png";
    public String potsOfPlenty_allsound = "potsOfPlenty_allsound.png";
    public String potsOfPlenty_ok = "potsOfPlenty_ok.png";
    public String potsOfPlenty_decrease = "potsOfPlenty_decrease.png";
    public String potsOfPlenty_increase = "potsOfPlenty_increase.png";
    public String potsOfPlenty_try = "potsOfPlenty_try.png";
    public String potsOfPlenty_play = "potsOfPlenty_play.png";
    public String BaseURL_potsOfPlenty="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2209-001&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //precious7s




    //siberianStorm
    public String siberianStorm_info = "siberianStorm_info.png";
    public String siberianStorm_audio = "siberianStorm_audio.png";
    public String siberianStorm_ok = "siberianStorm_ok.png";
    public String siberianStorm_decrease = "siberianStorm_decrease.png";
    public String siberianStorm_increase = "siberianStorm_increase.png";
    public String siberianStorm_try = "siberianStorm_try.png";
    public String siberianStorm_revealAll = "siberianStorm_revealAll.png";
    public String siberianStorm_tryagain = "siberianStorm_tryagain.png";
    public String BaseURL_siberianStorm = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2182-003&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //silverStarSuperme
    public String silverStarSuperme_info = "silverStarSuperme_info.png";
    public String silverStarSuperme_audio = "silverStarSuperme_audio.png";
    public String silverStarSuperme_ok = "silverStarSuperme_ok.png";
    public String silverStarSuperme_decrease = "silverStarSuperme_decrease.png";
    public String silverStarSuperme_increase = "silverStarSuperme_increase.png";
    public String silverStarSuperme_try = "silverStarSuperme_try.png";
    public String silverStarSuperme_revealAll = "silverStarSuperme_revealAll.png";
    public String silverStarSuperme_tryagain = "silverStarSuperme_tryagain.png";
    public String BaseURL_silverStarSuperme ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2178-003&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //spookyCashBoonanza
    public String spookyCashBoonanza_info = "spookyCashBoonanza_info.png";
    public String spookyCashBoonanza_audio = "spookyCashBoonanza_audio.png";
    public String spookyCashBoonanza_ok = "spookyCashBoonanza_ok.png";
    public String spookyCashBoonanza_decrease = "spookyCashBoonanza_decrease.png";
    public String spookyCashBoonanza_increase = "spookyCashBoonanza_increase.png";
    public String spookyCashBoonanza_try = "spookyCashBoonanza_try.png";
    public String spookyCashBoonanza_autoreveal = "spookyCashBoonanza_autoreveal.png";
    public String BaseURL_spookyCashBoonanza ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2190-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //starshipKenoMultipler
    public String starshipKenoMultipler_audio = "starshipKenoMultipler_audio.png";
    public String starshipKenoMultipler_ok = "starshipKenoMultipler_ok.png";
    public String starshipKenoMultipler_decrease = "starshipKenoMultipler_decrease.png";
    public String starshipKenoMultipler_increase = "starshipKenoMultipler_increase.png";
    public String starshipKenoMultipler_try = "starshipKenoMultipler_try.png";
    public String starshipKenoMultipler_go = "starshipKenoMultipler_go.png";
    public String starshipKenoMultipler_tryagain = "starshipKenoMulipler_tryagain.png";
    public String BaseURL_starshipKenoMultipler="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2138-005&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //supermeSoocer
    public String supermeSoocer_audio = "supermeSoocer_audio.png";
    public String supermeSoocer_ok = "supermeSoocer_ok.png";
    public String supermeSoocer_decrease = "supermeSoocer_decrease.png";
    public String supermeSoocer_increase = "supermeSoocer_increase.png";
    public String supermeSoocer_try = "supermeSoocer_try.png";
    public String supermeSoocer_autoplay = "supermeSoocer_autoplay.png";
    public String supermeSoocer_tryagain = "supermeSoocer_tryagain.png";
    public String BaseURL_supermeSoocer="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2098-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

    //thunderousFortunes
    public String thunderousFortunes_fp = "thunderousFortunes_fp.png";
    public String thunderousFortunes_setting = "thunderousFortunes_setting.png";
    public String thunderousFortunes_audio = "thunderousFortunes_audio.png";
    public String thunderousFortunes_allsound = "thunderousFortune_allsound.png";
    public String thunderousFortunes_ok = "thunderousFortunes_ok.png";
    public String thunderousFortunes_decrease = "thunderousFortunes_decrease.png";
    public String thunderousFortunes_increase = "thunderousFortunes_increase.png";
    public String thunderousFortunes_try = "thunderousFortunes_try.png";
    public String thunderousFortunes_autoplay = "thunderousFortunes_autoplay.png";
    public String thunderousFortunes_tryagain = "thunderousFortunes_tryagain.png";
    public String BaseURL_thunderousFortunes= "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2258-001&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

//ticTacTemple
    public String tictacTemple_info = "tictacTemple_info.png";
    public String tictacTemple_audio = "tictacTemple_audio.png";
    public String tictacTemple_ok = "tictacTemple_ok.png";
    public String tictacTemple_decrease = "tictacTemple_decrease.png";
    public String tictacTemple_increase = "tictacTemple_increase.png";
    public String tictacTemple_try = "tictacTemple_try.png";
    public String tictacTemple_play = "tictacTemple_play.png";
    public String tictacTemple_tryagain = "tictacTemple_tryagain.png";
    public String BaseURL_tictacTemple ="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2158-006&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

//vipGoldGrant

    public String vipGoldGrant_info = "vipGoldGrant_info.png";
    public String vipGoldGrant_audio = "vipGoldGrant_audio.png";
    public String vipGoldGrant_ok = "vipGoldGrant_ok.png";
    public String vipGoldGrant_decrease = "vipGoldGrant_decrease.png";
    public String vipGoldGrant_increase = "vipGoldGrant_increase.png";
    public String vipGoldGrant_try = "vipGoldGrant_try.png";
    public String vipGoldGrant_revealAll = "vipGoldGrant_revealAll.png";
    public String BaseURL_vipGoldGrant = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2188-004&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

//volcanoCash

    public String volcanoCash_fp = "volcanoCash_fp.png";
    public String volcanoCash_setting = "volcanoCash_setting.png";
    public String volcanoCash_audio = "volcanoCash_audio.png";
    public String volcanoCash_allsound = "volcanoCash_allsounds.png";
    public String volcanoCash_ok = "volcanoCash_ok.png";
    public String volcanoCash_decrease = "volcanoCash_decrease.png";
    public String volcanoCash_increase = "volcanoCash_increase.png";
    public String volcanoCash_try = "volcanoCash_try.png";
    public String volcanoCash_autoplay = "volcanoCash_autoplay.png";
    public String volcanoCash_tryagain = "volcanoCash_tryagain.png";
    public String BaseURL_volcanoCash="https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2220-003&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";

//wild's8

    public String wilds8_audio = "wilds8_audio.png";
    public String wilds8_ok = "wilds8_ok.png";
    public String wilds8_decrease = "wilds8_decrease.png";
    public String wilds8_increase = "wilds8_increase.png";
    public String wilds8_try = "wilds8_try.png";
    public String wilds8_revealAll = "wilds8_revealAll.png";
    public String BaseURL_wilds8 = "https://rgs-azsit01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2174-003&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY01";





}
