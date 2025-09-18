package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSample {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();

		driver.findElement(By.xpath("//a[@href=\"#Seperate\"]")).click();
				
		driver.findElement(By.xpath("//div[@id='Seperate']//button")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getWindowHandles());
		
		for(String child:driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

		driver.switchTo().window(parent);
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
