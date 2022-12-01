package ru.pstu.Test;

import org.junit.jupiter.api.Test;
import ru.pstu.Pages.mainPagePages;


public class mainPageTests extends baseTest {

    mainPagePages mainPage = new mainPagePages();

    @Test
    void mainPageCheckTextTest() {
        mainPage.checkHeader().checkFaculty().checkFooter();
    }

    @Test
    void engLanguageTest() {
        mainPage.checkEngLanguage();
    }


    @Test
    void cnLanguageTest() {
        mainPage.checkChineseLanguage();
    }


    @Test
    void arLanguageTest() {
        mainPage.checkArabicLanguage();
    }

}
