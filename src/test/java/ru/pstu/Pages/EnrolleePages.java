package ru.pstu.Pages;

import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.openqa.selenium.By.xpath;
import static ru.pstu.Test.baseTest.baseUrl;

public class EnrolleePages {

    public final By preparingCourses = xpath("//div[@class='content_block_training']/ul/li[1]/a");
    public final By checkPreparingCourses = xpath("//div[@class='content']/h1");
    public final By examsProgram = xpath("//div[@class='content_block_training']/ul/li[2]/a");
    public final By checkExamsProgram = xpath("//div[@class='content']/h1");
    public final By excursionsPSTU = xpath("//div[@class='content_block_training']/ul/li[4]/a");
    public final By checkExcursionsPSTU = xpath("//div[@class='content']/h1");
    public final By eventCalendar = xpath("//div[@class='content_block_training']/ul/li[5]/a");
    public final By checkEventCalendar = xpath("//div[@class='content']/h1");
    public final By backToMainPage = xpath("//div[@class='site_map']/ul[1]/li[1]/a");
    public final By enrollHeader = xpath("//div[@class='target_groups']/ul/li[1]/a");


    @Step("Проверяем страницу для абитурентов")

    public EnrolleePages enrollPageCheck(){
        $(enrollHeader).click();
        webdriver().shouldHave(url( baseUrl + "enrollee/"));
        $(preparingCourses).click();
        $(checkPreparingCourses).shouldHave(text("Подготовительные курсы"));
        back();
        $(examsProgram).click();
        $(checkExamsProgram).shouldHave(text("Подготовка к поступлению"));
        back();
        $(excursionsPSTU).click();
        $(checkExcursionsPSTU).shouldHave(text("Экскурсии в ПНИПУ"));
        back();
        $(eventCalendar).click();
        $(checkEventCalendar).shouldHave(text("Календарь событий"));
        back();
        $(backToMainPage).click();

        return this;
    }
}
