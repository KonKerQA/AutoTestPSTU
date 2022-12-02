package ru.pstu.Test;

import org.junit.jupiter.api.Test;
import ru.pstu.Pages.PSTUPages;


public class PSTUTests extends baseTest {
    PSTUPages pstuPages = new PSTUPages();

    @Test
    void mainPageCheckTextTest() {
        pstuPages.checkHeader().
                checkFaculty().
                checkContactInformation();
    }

    @Test
    void otherVersionsSiteTest() {
        pstuPages.checkEngLanguage().
                checkChineseLanguage().
                checkArabicLanguage().
                checkLowEye();
    }

    @Test
    void otherSocialNetworksTest() {
        pstuPages.checkTelegram().
                checkLNS().
                checkRutube().
                checkVK();
    }

    @Test
    void enrollTest() {
        pstuPages.enrollPageCheck();
    }

    @Test
    void othersHeaderPagesTest() {
        pstuPages.othersHeaderPageCheck();
    }

}
