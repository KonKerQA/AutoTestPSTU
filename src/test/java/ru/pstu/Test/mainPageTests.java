package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.pstu.Pages.mainPagePages;

import static com.codeborne.selenide.Selenide.open;

public class mainPageTests {

    mainPagePages mainPage = new mainPagePages();

    @BeforeAll
    static void  beforeTests(){
        Configuration.browserSize = "1920x1080";
        open("https://pstu.ru/");

    }
    @Test
    void footerTest(){
        mainPage.checkFooter() ;
    }


}
