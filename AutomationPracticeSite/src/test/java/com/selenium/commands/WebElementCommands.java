package com.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		
		
		
		WebElement ele=driver.findElement(By.linkText("Shop"));
		//click the element
		ele.click();
		
		//element is present in website or not
		//ele.isDisplayed();
		
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]//following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]//following-sibling::input")).sendKeys("test@gmail.com");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("testing123");
		
		String val=driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(val);
		
		String val1=driver.findElement(By.name("username")).getAttribute("class");
		System.out.println(val1);
		
		
		boolean val2=driver.findElement(By.name("password")).isEnabled();
		
		System.out.println(val2);
		
		boolean remember=driver.findElement(By.id("rememberme")).isSelected();
		System.out.println(remember);
		
		driver.findElement(By.xpath("//label[@for='rememberme']")).click();
		
		
		boolean rememberSel=driver.findElement(By.id("rememberme")).isSelected();
		System.out.println(rememberSel);
		
		
		
		
		
	}

}
