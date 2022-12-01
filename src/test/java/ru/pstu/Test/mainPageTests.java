package ru.pstu.Test;

import org.junit.jupiter.api.Test;
import ru.pstu.Pages.mainPagePages;


public class mainPageTests extends baseTest {

    mainPagePages mainPage = new mainPagePages();

    @Test
    void footerTest(){
        mainPage.checkFooter() ;
    }

    @Test
    void headerTest(){
        mainPage.checkHeader() ;
    }


}
