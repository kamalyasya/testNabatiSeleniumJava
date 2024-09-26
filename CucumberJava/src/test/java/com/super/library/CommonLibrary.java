package com.nabati.library;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonLibrary {
    private static WebDriver driver;

    @SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
        if (driver == null) {
        	System.out.println("Ending - First Step - Browser is Open");
        	String projectPath = System.getProperty("user.dir");
        	System.out.println("Project Path is : "+projectPath);
        	
        	
            System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
//            driver = new FirefoxDriver();
            
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	    
    	    driver.manage().window().maximize();
    	    
    	    System.out.println("Ending - Browser in Open");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}