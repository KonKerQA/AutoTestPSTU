package ru.pstu.Pages;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class xPathSelectors {
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

    //enrol
    public final By preparingCourses = xpath("//div[@class='content_block_training']/ul/li[1]/a");
    public final By checkPreparingCourses = xpath("//div[@class='content']/h1");
    public final By examsProgram = xpath("//div[@class='content_block_training']/ul/li[2]/a");
    public final By checkExamsProgram = xpath("//div[@class='content']/h1");
    public final By excursionsPSTU = xpath("//div[@class='content_block_training']/ul/li[4]/a");
    public final By checkExcursionsPSTU = xpath("//div[@class='content']/h1");
    public final By eventCalendar = xpath("//div[@class='content_block_training']/ul/li[5]/a");
    public final By checkEventCalendar = xpath("//div[@class='content']/h1");
    public final By backToMainPage = xpath("//div[@class='site_map']/ul[1]/li[1]/a");

    //left menu
    public final By checkLeftStudentMenu = xpath("//div[@class='menu_left']/ul/li[2]/ul");

}
