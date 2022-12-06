package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import ru.pstu.Pages.EnrolleePages;
import ru.pstu.Pages.PSTUPages;
import ru.pstu.helpers.Attach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class baseTest {
    PSTUPages pstuPages = new PSTUPages();
    EnrolleePages enrolle = new EnrolleePages();
   public static String  baseUrl = "https://pstu.ru/";

    @BeforeAll
    static void  beforeAllTests() {
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    @Step("Открываем главную страницу")
     void  beforeTests(){
        open(baseUrl);
    }

    @AfterEach
    void addAttachments() {
        Attach.takeScreenshot("Final screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
      //  Attach.addVideo();
        closeWebDriver();
    }
}
