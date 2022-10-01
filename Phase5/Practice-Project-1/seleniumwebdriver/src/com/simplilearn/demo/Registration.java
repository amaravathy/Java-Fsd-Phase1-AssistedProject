package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\Java-FSD-Phase1 Project\\\\\\\\\\\\\\\\Phase5\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Amaravathy");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("amar@gamil.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9756453211");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("amar@123");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
		
		
	}

}
