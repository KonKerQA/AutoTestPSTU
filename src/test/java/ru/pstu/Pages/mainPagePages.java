package ru.pstu.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.openqa.selenium.By.xpath;
import static ru.pstu.Test.baseTest.baseUrl;

public class mainPagePages {

    //footer
    private final By contactAddressFooter = xpath("//div[@class='botom_block'][1]//p[1]");
    private final By contactPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[1]/a[1]");
    private final By contactEmailFooter = xpath("//div[@class='botom_block'][1]//p[1]/a[2]");
    private final By questionsEmailFooter = xpath("//div[@class='botom_block'][1]//p[2]/a[2]");
    private final By questionsPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[2]/a[1]");
    private final By massMediaPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[3]/a[1]");
    private final By massMediaEmailFooter = xpath("//div[@class='botom_block'][1]//p[3]/a[2]");
    private final By clickRutube = xpath("//div[@class='bottom_soc']/a[1]");
    private final By clickVK = xpath("//div[@class='bottom_soc']/a[2]");
    private final By clickTelegram = xpath("//div[@class='bottom_soc']/a[3]");
    private final By clickLSN = xpath("//div[@class='bottom_soc']/a[5]");

    //header
    private final By enrollHeader = xpath("//div[@class='target_groups']/ul/li[1]/a");
    private final By studentHeader = xpath("//div[@class='target_groups']/ul/li[2]/a");
    private final By aspirantHeader = xpath("//div[@class='target_groups']/ul/li[3]/a");
    private final By workersHeader = xpath("//div[@class='target_groups']/ul/li[4]/a");
    private final By worldwideHeader = xpath("//div[@class='target_groups']/ul/li[5]/a");
    private final By partnersHeader = xpath("//div[@class='target_groups']/ul/li[6]/a");
    private final By massMediaHeader = xpath("//div[@class='target_groups']/ul/li[7]/a");
    private final By engVersion = xpath("//div[@class='lngs_contaner']/a[2]");
    private final By chinaVersion = xpath("//div[@class='lngs_contaner']/a[3]");
    private final By arabVersion = xpath("//div[@class='lngs_contaner']/a[4]");
    private final By rusVersion = xpath("//div[@class='lngs_contaner']/a[1]");
    private final By lowEyeVersion = xpath("//div[@class='top_nav_contaner']/a[1]");
    private final By highEyeVersion = xpath("//div[@id='head']//b/a");

    //faculty
    private final By aerospace = xpath("//div[@class='faculties_contaner']/ul/li[1]/a");
    private final By mountOil = xpath("//div[@class='faculties_contaner']/ul/li[2]/a");
    private final By gym = xpath("//div[@class='faculties_contaner']/ul/li[3]/a");
    private final By mechanicTechnic = xpath("//div[@class='faculties_contaner']/ul/li[4]/a");
    private final By build = xpath("//div[@class='faculties_contaner']/ul/li[5]/a");
    private final By mathAndMechanic = xpath("//div[@class='faculties_contaner']/ul/li[6]/a");
    private final By chemistry = xpath("//div[@class='faculties_contaner']/ul/li[7]/a");
    private final By electricTechnic = xpath("//div[@class='faculties_contaner']/ul/li[8]/a");

    //enrol
    private final By preparingCourses = xpath("//div[@class='content_block_training']/ul/li[1]/a");
    private final By checkPreparingCourses = xpath("//div[@class='content']/h1");
    private final By examsProgram = xpath("//div[@class='content_block_training']/ul/li[2]/a");
    private final By checkExamsProgram = xpath("//div[@class='content']/h1");
    private final By excursionsPSTU = xpath("//div[@class='content_block_training']/ul/li[4]/a");
    private final By checkExcursionsPSTU = xpath("//div[@class='content']/h1");
    private final By eventCalendar = xpath("//div[@class='content_block_training']/ul/li[5]/a");
    private final By checkEventCalendar = xpath("//div[@class='content']/h1");
    private final By backToMainPage = xpath("//div[@class='site_map']/ul[1]/li[1]/a");


    public mainPagePages checkContactInformation(){
        $(contactAddressFooter).hover().shouldHave(text("614990, Пермский край, г. Пермь, Комсомольский проспект, д. 29"));
        $(contactPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-520"));
        $(contactEmailFooter).shouldHave(text("kanc@pstu.ru"));
        $(questionsEmailFooter).shouldHave(text("enter@pstu.ru"));
        $(questionsPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-065"));
        $(massMediaPhoneNumberFooter).shouldHave(text("+7 (342) 2-198-119"));
        $(massMediaEmailFooter).shouldHave(text("kolesnik@pstu.ru"));

        return this;
    }

    public mainPagePages checkHeader(){
        $(enrollHeader).hover().shouldHave(text("Абитуриентам"));
        $(studentHeader).shouldHave(text("Студентам"));
        $(aspirantHeader).shouldHave(text("Аспирантам"));
        $(workersHeader).shouldHave(text("Сотрудникам"));
        $(worldwideHeader).shouldHave(text("Иностранным гражданам"));
        $(partnersHeader).shouldHave(text("Партнерам"));
        $(massMediaHeader).shouldHave(text("СМИ"));

        return this;
    }

    public mainPagePages othersHeaderPageCheck(){
        $(studentHeader).click();
        webdriver().shouldHave(url( baseUrl + "title1/student/pamyatka/"));
        $(aspirantHeader).click();
        webdriver().shouldHave(url( baseUrl + "title1/aspirantu/"));
        $(workersHeader).click();
        webdriver().shouldHave(url( baseUrl + "personal_info/staff_ads/"));
        $(partnersHeader).click();
        webdriver().shouldHave(url( baseUrl + "business/1/"));
        $(massMediaHeader).click();
        webdriver().shouldHave(url( baseUrl + "pressa/"));

        return this;
    }

    public mainPagePages enrollPageCheck(){
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

    public mainPagePages checkFaculty(){
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


    public mainPagePages checkEngLanguage(){
        $(engVersion).click();
        webdriver().shouldHave(url( baseUrl + "en/"));
        back();
        return this;
    }



    public mainPagePages checkChineseLanguage(){
        $(chinaVersion).click();
        webdriver().shouldHave(url( baseUrl + "cn/"));
        back();
        return this;
    }



    public mainPagePages checkArabicLanguage(){
        $(arabVersion).click();
        webdriver().shouldHave(url( baseUrl + "ar/"));
        back();
        return this;
    }


    public mainPagePages checkLowEye(){
        $(lowEyeVersion).click();
        webdriver().shouldHave(url( baseUrl + "?special=1"));
        $(highEyeVersion).click();
        return this;
    }


    public mainPagePages checkRutube(){
        $(clickRutube).click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://rutube.ru/channel/25507363/"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


    public mainPagePages checkVK(){
        $(clickVK).click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://vk.com/politehperm"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


    public mainPagePages checkTelegram(){
        $(clickTelegram).click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://t.me/politehperm"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


    public mainPagePages checkLNS(){
        $(clickLSN).hover().click();
        switchTo().window(1);
        webdriver().shouldHave(url( "https://lsn.pstu.ru/#/login"));
        closeWindow();
        switchTo().window(0);
        return this;
    }


}
