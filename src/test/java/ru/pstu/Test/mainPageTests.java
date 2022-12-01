package ru.pstu.Test;

import org.junit.jupiter.api.Test;
import ru.pstu.Pages.mainPagePages;


public class mainPageTests extends baseTest {
    mainPagePages mainPage = new mainPagePages();

    @Test
    void mainPageCheckTextTest() {
        mainPage.checkHeader().checkFaculty().checkContactInformation();
    }

    @Test
    void engLanguageTest() {
        mainPage.checkEngLanguage().checkChineseLanguage().checkArabicLanguage();
    }

    @Test
    void clickTelegramTest() {
        mainPage.checkTelegram();
    }

    @Test
    void clickVKTest() {
        mainPage.checkVK();
    }

    @Test
    void clickRutubeTest() {
        mainPage.checkRutube();
    }

    @Test
    void clickLNSTest() {
        mainPage.checkLNS();
    }

}
