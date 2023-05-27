package ru.pstu.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;


public class PSTUTests extends baseTest {

    @Test
    @Epic("Главная страница")
    @Feature("Проверка текста на главной странице")
    @DisplayName("Проверка текста на главной странице")
    void mainPageCheckTextTest() {

        pstuPages.checkHeader().
                checkFaculty().
                checkContactInformation();
    }

    @Test
    @Epic("Главная страница")
    @Feature("Проверка открытия других версий сайта")
    @DisplayName("Проверка открытия английской, китайской, арабской и для слабовидящих версий сайта")
    void otherVersionsSiteTest() {

        pstuPages.checkEngLanguage().
                checkChineseLanguage().
                checkArabicLanguage().
                checkLowEye();
    }

    @Test
    @Epic("Главная страница")
    @Feature("Проверка кнопок для перехода на другие ресурсы")
    @DisplayName("Проверка кнопок-ссылок на другие ресурсы в соц сетях")
    void otherSocialNetworksTest() {

        pstuPages.checkTelegram().
                checkLNS().
                checkRutube().
                checkVK();
    }

    @Test
    @Epic("Абитуренты")
    @Feature("Проверка страницы абитеренты")
    @DisplayName("Проверка страницы абитуренты")
    @Link("https://pstu.ru/enrollee/")
    void enrollTest() {

        enrolle.enrollPageCheck();
    }

    @Test
    @Epic("Главная страница")
    @Feature("Проверка информационных разделов")
    @DisplayName("Проверка информационных разделов из хеддера")
    void othersHeaderPagesTest() {

        pstuPages.othersHeaderPageCheck();
    }

}
