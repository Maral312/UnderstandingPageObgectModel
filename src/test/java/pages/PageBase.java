package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.Driver;

public class PageBase {
/**
    public void navigateToDrive(){

        WebElement driveElement = Driver.get().findElement(By.cssSelector("[title='Drive']"));
        BrowserUtils.waitForVisibility(driveElement,5);
        BrowserUtils.waitForClickablility(driveElement,5);
        driveElement.click();

    }
    public void navigateToCalendar(){
        WebElement calendarElement = Driver.get().findElement(By.cssSelector("[title=\"Calendar\"]"));
        BrowserUtils.waitForVisibility(calendarElement,5);
        BrowserUtils.waitForClickablility(calendarElement,5);
        calendarElement.click();
    }
*/
    public void menuNavigation(String menuItem){
        WebElement menu= Driver.get().findElement(By.cssSelector("[title='"+menuItem+"']"));
        BrowserUtils.waitForVisibility(menu, 5);
        BrowserUtils.waitForClickablility(menu, 5);
        menu.click();
    }

    public String getPageSubtitle(){
        WebElement subtitle =Driver.get().findElement(By.id("pagetitle"));
        BrowserUtils.waitForStaleElement(subtitle);
        String subTitleText = subtitle.getText();
        return  subTitleText;
    }
}
