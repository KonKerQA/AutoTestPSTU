package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import ru.pstu.Pages.EnrolleePages;
import ru.pstu.Pages.PSTUPages;
import ru.pstu.helpers.Attach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static ru.pstu.config.AppConfigProvider.props;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) //параллельный запуск по методам, а не по классам
public class baseTest {
    PSTUPages pstuPages = new PSTUPages();
    EnrolleePages enrolle = new EnrolleePages();

    @BeforeAll
    static void  beforeAllTests() {
        Configuration.baseUrl = props().pstuUrl();
        Configuration.browser="chrome";
        Configuration.fastSetValue = true;
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    @Step("Открываем главную страницу")
     void  beforeTests(){
        open(Configuration.baseUrl);
    }

    @AfterEach
    void addAttachments() {
        Attach.addAttachment();
    }

    @AfterAll
    static void  AfterAllTests() {
        closeWebDriver();
    }
}
