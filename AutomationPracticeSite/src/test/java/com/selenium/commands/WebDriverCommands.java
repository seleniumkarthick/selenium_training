package com.selenium.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		//launch chrome browser
		/*
		 * ChromeDriver
		 * FirefoxDriver
		 * SafariDriver
		 * EdgeDriver
		 * 
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Automatdasdasdsaion Practice Site")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.quit();
		
	}

}
