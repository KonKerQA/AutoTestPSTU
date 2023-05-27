package ru.pstu.Pages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.openqa.selenium.By.xpath;

public class PSTUPages {

    //footer
    public final By contactAddressFooter = xpath("//div[@class='botom_block'][1]//p[1]");
    public final By contactPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[1]/a[1]");
    public final By contactEmailFooter = xpath("//div[@class='botom_block'][1]//p[1]/a[2]");
    public final By questionsEmailFooter = xpath("//div[@class='botom_block'][1]//p[2]/a[2]");
    public final By questionsPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[2]/a[1]");
    public final By massMediaPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[3]/a[1]");
    public final By massMediaEmailFooter = xpath("//div[@class='botom_block'][1]//p[3]/a[2]");
    public final By clickRutube = xpath("//div[@class='bottom_soc']/a[1]");
    public final By clickVK = xpath("//div[@class='bottom_soc']/a[2]");
    public final By clickTelegram = xpath("//div[@class='bottom_soc']/a[3]");
    public final By clickLSN = xpath("//div[@class='bottom_soc']/a[5]");

    //header
    public final By enrollHeader = xpath("//div[@class='target_groups']/ul/li[1]/a");
    public final By studentHeader = xpath("//div[@class='target_groups']/ul/li[2]/a");
    public final By aspirantHeader = xpath("//div[@class='target_groups']/ul/li[3]/a");
    public final By workersHeader = xpath("//div[@class='target_groups']/ul/li[4]/a");
    public final By worldwideHeader = xpath("//div[@class='target_groups']/ul/li[5]/a");
    public final By partnersHeader = xpath("//div[@class='target_groups']/ul/li[6]/a");
    public final By massMediaHeader = xpath("//div[@class='target_groups']/ul/li[7]/a");
    public final By engVersion = xpath("//div[@class='lngs_contaner']/a[2]");
    public final By chinaVersion = xpath("//div[@class='lngs_contaner']/a[3]");
    public final By arabVersion = xpath("//div[@class='lngs_contaner']/a[4]");
    public final By rusVersion = xpath("//div[@class='lngs_contaner']/a[1]");
    public final By lowEyeVersion = xpath("//div[@class='top_nav_contaner']/a[1]");
    public final By highEyeVersion = xpath("//div[@id='head']//b/a");

    //faculty
    public final By aerospace = xpath("//div[@class='faculties_contaner']/ul/li[1]/a");
    public final By mountOil = xpath("//div[@class='faculties_contaner']/ul/li[2]/a");
    public final By gym = xpath("//div[@class='faculties_contaner']/ul/li[3]/a");
    public final By mechanicTechnic = xpath("//div[@class='faculties_contaner']/ul/li[4]/a");
    public final By build = xpath("//div[@class='faculties_contaner']/ul/li[5]/a");
    public final By mathAndMechanic = xpath("//div[@class='faculties_contaner']/ul/li[6]/a");
    public final By chemistry = xpath("//div[@class='faculties_contaner']/ul/li[7]/a");
    public final By electricTechnic = xpath("//div[@class='faculties_contaner']/ul/li[8]/a");

    //left menu
    public final By checkLeftStudentMenu = xpath("//div[@class='menu_left']/ul/li[2]/ul");

    @Step("Проверяем конактную информацию")
    public PSTUPages checkContactInformation() {
        $(contactAddressFooter).hover().shouldHave(text("614990, Пермский край, г. Пермь, Комсомольский проспект, д. 29"));
        $(contactPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-520"));
        $(contactEmailFooter).shouldHave(text("kanc@pstu.ru"));
        $(questionsEmailFooter).shouldHave(text("enter@pstu.ru"));
        $(questionsPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-065"));
        $(massMediaPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-119"));
        $(massMediaEmailFooter).shouldHave(text("kolesnik@pstu.ru"));

        return this;
    }

    @Step("Проверяем названия в хеддере")
    public PSTUPages checkHeader() {
        $(enrollHeader).hover().shouldHave(text("Абитуриентам"));
        $(studentHeader).shouldHave(text("Студентам"));
        $(aspirantHeader).shouldHave(text("Аспирантам"));
        $(workersHeader).shouldHave(text("Сотрудникам"));
        $(worldwideHeader).shouldHave(text("Иностранным гражданам"));
        $(partnersHeader).shouldHave(text("Партнерам"));
        $(massMediaHeader).shouldHave(text("СМИ"));

        return this;
    }

    @Step("Проверяем ссылки из хеддера")
    public PSTUPages othersHeaderPageCheck() {
        $(studentHeader).click();
        webdriver().shouldHave(url(baseUrl + "title1/student/pamyatka/"));
        $(checkLeftStudentMenu).shouldHave(text("Личный кабинет студента"));
        $(checkLeftStudentMenu).shouldHave(text("Система уведомления обучающихся"));
        $(aspirantHeader).click();
        webdriver().shouldHave(url(baseUrl + "title1/aspirantu/"));
        $(workersHeader).click();
        webdriver().shouldHave(url(baseUrl + "personal_info/staff_ads/"));
        $(partnersHeader).click();
        webdriver().shouldHave(url(baseUrl + "business/1/"));
        $(massMediaHeader).click();
        webdriver().shouldHave(url(baseUrl + "pressa/"));

        return this;
    }

    @Step("Проверяем факультеты")
    public PSTUPages checkFaculty() {
        $(aerospace).hover().shouldHave(text("Аэрокосмический"));
        $(mountOil).shouldHave(text("Горно-нефтяной"));
        $(gym).shouldHave(text("Гуманитарный"));
        $(mechanicTechnic).shouldHave(text("Механико-технологический"));
        $(build).shouldHave(text("Строительный"));
        $(mathAndMechanic).shouldHave(text("Прикладной математики и механики"));
        $(chemistry).shouldHave(text("Химических технологий, промышленной экологии и биотехнологий"));
        $(electricTechnic).shouldHave(text("Электро-технический"));

        return this;
    }

    @Step("Проверяем английскую версию сайта")
    public PSTUPages checkEngLanguage() {
        $(engVersion).click();
        webdriver().shouldHave(url(baseUrl + "en/"));
        back();

        return this;
    }

    @Step("Проверяем китайскую версию сайта")
    public PSTUPages checkChineseLanguage() {
        $(chinaVersion).click();
        webdriver().shouldHave(url(baseUrl + "cn/"));
        back();

        return this;
    }

    @Step("Проверяем арабскую версию сайта")
    public PSTUPages checkArabicLanguage() {
        $(arabVersion).click();
        webdriver().shouldHave(url(baseUrl + "ar/"));
        back();

        return this;
    }

    @Step("Проверяем версию сайта для слабовидящих")
    public PSTUPages checkLowEye() {
        $(lowEyeVersion).click();
        webdriver().shouldHave(url(baseUrl + "?special=1"));
        $(highEyeVersion).click();

        return this;
    }

    @Step("Проверяем кнопку-редирект на рутуб")
    public PSTUPages checkRutube() {
        $(clickRutube).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://rutube.ru/channel/25507363/"));
        closeWindow();
        switchTo().window(0);

        return this;
    }

    @Step("Проверяем кнопку-редирект на вк")
    public PSTUPages checkVK() {
        $(clickVK).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://vk.com/politehperm"));
        closeWindow();
        switchTo().window(0);

        return this;
    }

    @Step("Проверяем кнопку-редирект на телеграм")
    public PSTUPages checkTelegram() {
        $(clickTelegram).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://t.me/politehperm"));
        closeWindow();
        switchTo().window(0);

        return this;
    }

    @Step("Проверяем кнопку-редирект на лнс")
    public PSTUPages checkLNS() {
        $(clickLSN).hover().click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://lsn.pstu.ru/#/login"));
        closeWindow();
        switchTo().window(0);

        return this;
    }

}
