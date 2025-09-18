package com.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://www.w3schools.com");
		
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'References')]"));
		act.moveToElement(ele1).click().build().perform();
			
		
	}

}
