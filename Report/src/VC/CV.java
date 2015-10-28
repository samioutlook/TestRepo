package VC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CV {
	
	//this is a comment
	
	@Test 
	public void th() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\jqueryui.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        Thread.sleep(3000);
        driver.quit();
        
       //alternate way
       /** WebElement element = driver.findElement(By.xpath(".//*[@id='sidebar']/aside[4]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        Thread.sleep(4000);
        actions.click();
        actions.perform();
        **/
           
		
	}
}
