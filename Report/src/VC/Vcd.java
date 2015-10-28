package VC;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Vcd {
	
	@Test
	public void log() throws InterruptedException{
		System.out.println("hello");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//adding comment - scrolling down on the page
			for (int second = 0;; second++) {
            if(second >=10){
                break;
            }
                ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,200)", "");
                Thread.sleep(3000);
            }
		//click on your element
		
		WebElement k = driver.findElement(By.xpath(".//*[@id='content']/div[2]/ul/li[8]/ul/li[2]/a"));
			k.click();
			Thread.sleep(4000);
		
			for (int second = 0;; second++) {
	            if(second >=10){
	                break;
	            }
	                ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,200)", "");
	                Thread.sleep(3000);
	            }
			driver.findElement(By.xpath(".//*[@id='sidebar']/aside[3]/ul/li[2]/a")).click();
			Thread.sleep(4000);
			
			for (int second = 0;; second++) {
	            if(second >=10){
	                break;
	            }
	                ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,200)", "");
	                Thread.sleep(3000);
	            }
			driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[7]/a")).click();
			Thread.sleep(4000);
		driver.quit();
		
	}
	@Test
	public boolean isElementPresent(RemoteWebDriver driver, By by){
	    try{
	        driver.findElement(by);
	        return true;
	    }catch(NoSuchElementException e){
	        return false;
	    }
	}
}
