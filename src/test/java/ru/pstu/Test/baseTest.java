package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class baseTest {
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
}
