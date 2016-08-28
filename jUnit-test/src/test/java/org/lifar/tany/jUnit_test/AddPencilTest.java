package org.lifar.tany.jUnit_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddPencilTest {
    
    FirstDayAtSchool school = new FirstDayAtSchool();
    String[] bag = { "Books", "Notebooks", "Pens", "Pencils" };

    @Test
    public void testAddPencils() {
        
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag, school.addPencils());
    }

    @Test
    public void testSearchPageCh(){
        System.out.println(1);
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        System.out.println(2);
        WebDriver driver = new ChromeDriver();
        System.out.println(3);
        driver.get("http://www.google.com/");
        System.out.println(4);
        WebElement searchString = driver.findElement(By.name("q"));
        System.out.println(5);
        searchString.sendKeys("Cheese");
        System.out.println(6);
        searchString.submit();
        System.out.println(7);
        driver.close();
        System.out.println(8);
    }
        
}
