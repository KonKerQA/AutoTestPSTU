package ru.pstu.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
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



    public mainPagePages checkFooter(){
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


    public mainPagePages checkEngLanguage(){
        $(engVersion).click();
        webdriver().shouldHave(url( baseUrl + "en/"));
        return this;
    }



    public mainPagePages checkChineseLanguage(){
        $(chinaVersion).click();
        webdriver().shouldHave(url( baseUrl + "cn/"));
        return this;
    }



    public mainPagePages checkArabicLanguage(){
        $(arabVersion).click();
        webdriver().shouldHave(url( baseUrl + "ar/"));

        return this;
    }


}
