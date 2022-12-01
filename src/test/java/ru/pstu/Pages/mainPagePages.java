package ru.pstu.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class mainPagePages {

    private final By contactAddressFooter = xpath("//div[@class='botom_block'][1]//p[1]");
    private final By contactPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[1]/a[1]");
    private final By contactEmailFooter = xpath("//div[@class='botom_block'][1]//p[1]/a[2]");
    private final By questionsEmailFooter = xpath("//div[@class='botom_block'][1]//p[2]/a[2]");
    private final By questionsPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[2]/a[1]");
    private final By massMediaPhoneNumberFooter = xpath("//div[@class='botom_block'][1]//p[3]/a[1]");
    private final By massMediaEmailFooter = xpath("//div[@class='botom_block'][1]//p[3]/a[2]");

    private final By contactheader = xpath("//div[@class='target_groups']/ul/li/a");



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
}
