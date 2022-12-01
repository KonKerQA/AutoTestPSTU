package ru.pstu.Test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class baseTest {
   public static String  baseUrl = "https://pstu.ru/";
    @BeforeEach
     void  beforeTests(){
        Configuration.browserSize = "1920x1080";
        open(baseUrl);

    }
}
