package ru.pstu.Test;

import org.junit.jupiter.api.Test;
import ru.pstu.Pages.mainPagePages;


public class mainPageTests extends baseTest {
    mainPagePages mainPage = new mainPagePages();

    @Test
    void mainPageCheckTextTest() {
        mainPage.checkHeader().
                checkFaculty().
                checkContactInformation();
    }

    @Test
    void otherVersionsSiteTest() {
        mainPage.checkEngLanguage().
                checkChineseLanguage().
                checkArabicLanguage().
                checkLowEye();
    }

    @Test
    void otherSocialNetworksTest() {
        mainPage.checkTelegram().
                checkLNS().
                checkRutube().
                checkVK();
    }

    @Test
    void enrollTest() {
        mainPage.enrollPageCheck();
    }

}
