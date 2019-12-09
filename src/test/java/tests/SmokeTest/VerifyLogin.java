package tests.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;
import utils.Driver;

public class VerifyLogin extends TestBase {

    @Test(description = "Verify Login Test through page title")
    public void loginTest(){
        LoginPage loginPage= new LoginPage();
        loginPage.login();

        String expectedTitle = "Portal";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Login verification failed");
    }
}
