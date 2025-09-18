package com.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("test");
		
		driver.findElement(By.id("username")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("username")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"A");
		
		
		
		
		
	}

}
