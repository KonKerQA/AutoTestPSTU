package ru.pstu.Pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverConditions.url;
import static ru.pstu.Test.baseTest.baseUrl;

public class EnrolleePages {

    xPathSelectors xpath = new xPathSelectors();
    @Step("Проверяем страницу для абитурентов")
    public EnrolleePages enrollPageCheck(){
        $(xpath.enrollHeader).click();
        webdriver().shouldHave(url( baseUrl + "enrollee/"));
        $(xpath.preparingCourses).click();
        $(xpath.checkPreparingCourses).shouldHave(text("Подготовительные курсы"));
        back();
        $(xpath.examsProgram).click();
        $(xpath.checkExamsProgram).shouldHave(text("Подготовка к поступлению"));
        back();
        $(xpath.excursionsPSTU).click();
        $(xpath.checkExcursionsPSTU).shouldHave(text("Экскурсии в ПНИПУ"));
        back();
        $(xpath.eventCalendar).click();
        $(xpath.checkEventCalendar).shouldHave(text("Календарь событий"));
        back();
        $(xpath.backToMainPage).click();

        return this;
    }
}
