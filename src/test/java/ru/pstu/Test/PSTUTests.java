package ru.pstu.Test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import ru.pstu.Pages.PSTUPages;

import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;


public class PSTUTests extends baseTest {
    PSTUPages pstuPages = new PSTUPages();

    @Test
    void mainPageCheckTextTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.checkHeader().
                checkFaculty().
                checkContactInformation();
    }

    @Test
    void otherVersionsSiteTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.checkEngLanguage().
                checkChineseLanguage().
                checkArabicLanguage().
                checkLowEye();
    }

    @Test
    void otherSocialNetworksTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.checkTelegram().
                checkLNS().
                checkRutube().
                checkVK();
    }

    @Test
    void enrollTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.enrollPageCheck();
        attachment("Source", webdriver().driver().source());
    }

    @Test
    void othersHeaderPagesTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.othersHeaderPageCheck();
        attachment("Source", webdriver().driver().source());
    }

}
