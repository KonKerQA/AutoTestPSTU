package ru.pstu.Test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pstu.Pages.PSTUPages;

import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;


public class PSTUTests extends baseTest {

    @Test
    @DisplayName("Проверка текста на главной странице")
    void mainPageCheckTextTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.checkHeader().
                checkFaculty().
                checkContactInformation();
    }

    @Test
    @DisplayName("Проверка открытия английской, китайской, арабской и для слабовидящих версий сайта")
    void otherVersionsSiteTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.checkEngLanguage().
                checkChineseLanguage().
                checkArabicLanguage().
                checkLowEye();
    }

    @Test
    @DisplayName("Проверка кнопок-ссылок на другие ресурсы в соц сетях")
    void otherSocialNetworksTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.checkTelegram().
                checkLNS().
                checkRutube().
                checkVK();
    }

    @Test
    @DisplayName("Проверка страницы абитуренты")
    void enrollTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        enrolle.enrollPageCheck();
        attachment("Source", webdriver().driver().source());
    }

    @Test
    @DisplayName("Проверка информационных разделов из хеддера")
    void othersHeaderPagesTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        pstuPages.othersHeaderPageCheck();
        attachment("Source", webdriver().driver().source());
    }

}
