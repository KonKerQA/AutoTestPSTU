package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class baseTest {
   public static String  baseUrl = "https://pstu.ru/";
    @BeforeEach
     void  beforeTests(){
        Configuration.browserSize = "1920x1080";
        open(baseUrl);

    }
}
