package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class baseTest {

    @BeforeAll
    static void  beforeTests(){
        Configuration.browserSize = "1920x1080";
        open("https://pstu.ru/");

    }
}
