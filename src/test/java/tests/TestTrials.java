package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;

public class TestTrials extends TestBase {

    @Test(description = "Verify login")
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        System.out.println(Driver.get().getTitle());
        // loginPage.navigateToDrive();
        // BrowserUtils.wait(2);
        // LoginPage.navigateToCAlendar();
        // BrowserUtils.wait(2);

        loginPage.menuNavigation("Tasks");
        System.out.println(loginPage.getPageSubtitle());
        BrowserUtils.wait(2);
        loginPage.menuNavigation("Mail");
        BrowserUtils.wait(2);
        System.out.println(loginPage.getPageSubtitle());
        BrowserUtils.wait(2);

    }
}