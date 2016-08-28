package org.lifar.tany.jUnit_test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGoogleSearchPage {
    
    @Test
    public void testSerchPageFF() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        WebElement searchString = driver.findElement(By.name("q"));
        searchString.sendKeys("Cheese");
        searchString.submit();
    }
    
    @Test
    public void testSerchPageIE() {
        System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.com/");
        WebElement searchString = driver.findElement(By.name("q"));
 //       GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
 //       page.searchFor("Cheese");
        searchString.sendKeys("Cheese");
        searchString.submit();
    }
    
    @Test
    public void testSearchPageCh(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.google.com/");
//        WebElement searchString = driver.findElement(By.name("q"));
//        searchString.sendKeys("Cheese");
//        searchString.submit();
    }
        

}     

