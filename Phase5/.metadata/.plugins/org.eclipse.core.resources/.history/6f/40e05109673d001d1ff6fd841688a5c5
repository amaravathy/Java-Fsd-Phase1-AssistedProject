package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktest {

	public static void main(String[] args) {
		
		String path= "D:\\Java-FSD-Phase1 Project\\Phase5\\chromedriver_win32\\chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", path);	
		WebDriver driver= new ChromeDriver();	
		String url="https://www.facebook.com/";
		driver.get(url);
		//maximise the window
				driver.manage().window().maximize();
			
				//get title of page
				System.out.println("Title:"+driver.getTitle());
				
				
				WebElement email=driver.findElement(By.id("email"));
				System.out.println(email.getAttribute("placeholder"));
				email.sendKeys("amaravathy@gmail.com");
				
				WebElement pass=driver.findElement(By.name("pass"));
				System.out.println(pass.getAttribute("placeholder"));
				pass.sendKeys("amar@123");
				
				WebElement login=driver.findElement(By.name("login"));
				login.submit();
}
}
