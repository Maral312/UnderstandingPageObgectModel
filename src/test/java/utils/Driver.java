package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;

    //you cannot do like this, if constructor is privateDriver obj= new Driver()
    private Driver(){

    }
    public static WebDriver get(){

        //if webdriver object was not created yet
        if(driver==null){
            //create webDriver object based on browser value from properties file
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    //if browser type is wrong, stops testing and throw exception.
                    //no browser will be opened
                    throw new RuntimeException("Wrong browser type!");
            }
        }
        //if webDriver object is
        return driver;
    }
    public static void close(){
        //if driver still exist
        if(driver!=null){
            //close all browsers
            driver.quit();
            //destroy driver object, ready for garbage collector
            driver=null;

        }
    }


}
