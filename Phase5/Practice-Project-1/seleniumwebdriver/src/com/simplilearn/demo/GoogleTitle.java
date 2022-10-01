package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args) {
		
		String path= "D:\\Java-FSD-Phase1 Project\\Phase5\\chromedriver_win32\\chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", path);	
		WebDriver driver= new ChromeDriver();	
		String url="http://www.google.com";
		driver.get(url);

		System.out.println("Title:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//assertEquals("Google1", driver.getTitle());
		
		driver.close();
	}
}
