package com.cbt;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/asanbaisuranov/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("github.com" + Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
		////E[contains(@A,'t') --> //input[contains(@class,'')  
		
	}

}
