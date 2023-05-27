package ru.pstu.Test;

import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;


public class PSTUTests extends baseTest {

    @Test
    @DisplayName("Проверка текста на главной странице")
    void mainPageCheckTextTest() {

        pstuPages.checkHeader().
                checkFaculty().
                checkContactInformation();
    }

    @Test
    @DisplayName("Проверка открытия английской, китайской, арабской и для слабовидящих версий сайта")
    void otherVersionsSiteTest() {

        pstuPages.checkEngLanguage().
                checkChineseLanguage().
                checkArabicLanguage().
                checkLowEye();
    }

    @Test
    @DisplayName("Проверка кнопок-ссылок на другие ресурсы в соц сетях")
    void otherSocialNetworksTest() {

        pstuPages.checkTelegram().
                checkLNS().
                checkRutube().
                checkVK();
    }

    @Test
    @DisplayName("Проверка страницы абитуренты")
    @Link("https://pstu.ru/enrollee/")
    void enrollTest() {

        enrolle.enrollPageCheck();
        attachment("Source", webdriver().driver().source());
    }

    @Test
    @DisplayName("Проверка информационных разделов из хеддера")
    void othersHeaderPagesTest() {

        pstuPages.othersHeaderPageCheck();
        attachment("Source", webdriver().driver().source());
    }

}
