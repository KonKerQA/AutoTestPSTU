package ru.pstu.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.openqa.selenium.By.xpath;
import static ru.pstu.Test.baseTest.baseUrl;

public class PSTUPages {

    //footer
    xPathSelectors xpath = new xPathSelectors();

    public PSTUPages checkContactInformation(){
        $(xpath.contactAddressFooter).hover().shouldHave(text("614990, Пермский край, г. Пермь, Комсомольский проспект, д. 29"));
        $(xpath.contactPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-520"));
        $(xpath.contactEmailFooter).shouldHave(text("kanc@pstu.ru"));
        $(xpath.questionsEmailFooter).shouldHave(text("enter@pstu.ru"));
        $(xpath.questionsPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-065"));
        $(xpath.massMediaPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-119"));
        $(xpath.massMediaEmailFooter).shouldHave(text("kolesnik@pstu.ru"));

        return this;
    }

    public PSTUPages checkHeader(){
        $(xpath.enrollHeader).hover().shouldHave(text("Абитуриентам"));
        $(xpath.studentHeader).shouldHave(text("Студентам"));
        $(xpath.aspirantHeader).shouldHave(text("Аспирантам"));
        $(xpath.workersHeader).shouldHave(text("Сотрудникам"));
        $(xpath.worldwideHeader).shouldHave(text("Иностранным гражданам"));
        $(xpath.partnersHeader).shouldHave(text("Партнерам"));
        $(xpath.massMediaHeader).shouldHave(text("СМИ"));

        return this;
    }

    public PSTUPages othersHeaderPageCheck(){
        $(xpath.studentHeader).click();
        webdriver().shouldHave(url( baseUrl + "title1/student/pamyatka/"));
        $(xpath.checkLeftStudentMenu).shouldHave(text("Личный кабинет студента"));
        $(xpath.checkLeftStudentMenu).shouldHave(text("Система уведомления обучающихся"));
        $(xpath.aspirantHeader).click();
        webdriver().shouldHave(url( baseUrl + "title1/aspirantu/"));
        $(xpath.workersHeader).click();
        webdriver().shouldHave(url( baseUrl + "personal_info/staff_ads/"));
        $(xpath.partnersHeader).click();
        webdriver().shouldHave(url( baseUrl + "business/1/"));
        $(xpath.massMediaHeader).click();
        webdriver().shouldHave(url( baseUrl + "pressa/"));

        return this;
    }

    public PSTUPages enrollPageCheck(){
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

    public PSTUPages checkFaculty(){
        $(xpath.aerospace).hover().shouldHave(text("Аэрокосмический"));
        $(xpath.mountOil).shouldHave(text("Горно-нефтяной"));
        $(xpath.gym).shouldHave(text("Гуманитарный"));
        $(xpath.mechanicTechnic).shouldHave(text("Механико-технологический"));
        $(xpath.build).shouldHave(text("Строительный"));
        $(xpath.mathAndMechanic).shouldHave(text("Прикладной математики и механики"));
        $(xpath.chemistry).shouldHave(text("Химических технологий, промышленной экологии и биотехнологий"));
        $(xpath.electricTechnic).shouldHave(text("Электро-технический"));

        return this;
    }


    public PSTUPages checkEngLanguage(){
        $(xpath.engVersion).click();
        webdriver().shouldHave(url( baseUrl + "en/"));
        back();
        return this;
    }



    public PSTUPages checkChineseLanguage(){
        $(xpath.chinaVersion).click();
        webdriver().shouldHave(url( baseUrl + "cn/"));
        back();
        return this;
    }



    public PSTUPages checkArabicLanguage(){
        $(xpath.arabVersion).click();
        webdriver().shouldHave(url( baseUrl + "ar/"));
        back();
        return this;
    }


    public PSTUPages checkLowEye(){
        $(xpath.lowEyeVersion).click();
        webdriver().shouldHave(url( baseUrl + "?special=1"));
        $(xpath.highEyeVersion).click();
        return this;
    }


    public PSTUPages checkRutube(){
        $(xpath.clickRutube).click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://rutube.ru/channel/25507363/"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


    public PSTUPages checkVK(){
        $(xpath.clickVK).click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://vk.com/politehperm"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


    public PSTUPages checkTelegram(){
        $(xpath.clickTelegram).click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://t.me/politehperm"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


    public PSTUPages checkLNS(){
        $(xpath.clickLSN).hover().click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://lsn.pstu.ru/#/login"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


}
