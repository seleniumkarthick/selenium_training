package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.navigate().to("https://practice.automationtesting.in/");
		
		WebElement ele=driver.findElement(By.linkText("Shop"));
		//click the element
		ele.click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
	}

}
