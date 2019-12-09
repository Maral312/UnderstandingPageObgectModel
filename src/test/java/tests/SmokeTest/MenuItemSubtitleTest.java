package tests.SmokeTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;

public class MenuItemSubtitleTest extends TestBase {
@DataProvider(name = "MenuData")
public Object[][] data(){
    return new Object[][]{
            {"Activity Stream", "Activity Stream"},
            { "Tasks", "My tasks"},
            {"Workgroups", "Workgroups and projects"},
            {"Drive","My Drive"},
            {"Calendar","Calendar" },
            {"Mail","Mailbox Integration"},
            {"Contact Center","Contact Center"},
            {"Time and Reports","Absence Chart"},
            {"Employees","Company Structure"},
            {"Services","Meeting Rooms"},
            {"Company","Company"}

    };
}
    @Test(dataProvider = "MenuData")
    public void menuItemTest(String menuItem, String pageSubtitle){
        LoginPage loginPage= new LoginPage();
        loginPage.login();
        loginPage.menuNavigation(menuItem);
        String expectedTitle = pageSubtitle;
        String actualTitle = loginPage.getPageSubtitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Page Subtitle is wrong");

    }

//    @Test(description = "Verify that page subtitle is correct for activity stream")
//    public void test1(){
//        LoginPage loginPage= new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Activity Stream");
//        String expectedTitle="Activity Stream";
//        String actualTitle =loginPage.getPageSubtitle();
//        Assert.assertEquals(expectedTitle,actualTitle, "Activity Stream page subtitle is wrong!");
//
//    }
//    @Test(description = "Verify that page subtitle is correct for Tasks")
//    public void test2(){
//        LoginPage loginPage= new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Tasks");
//        String expectedTitle = "My tasks";
//        String actualTitle = loginPage.getPageSubtitle();
//        Assert.assertEquals(expectedTitle,actualTitle, "Task subtitle is wrong!");
//    }
//
}
