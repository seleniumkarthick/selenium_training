package com.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Select sel=new Select(driver.findElement(By.id("cars")));
		
		sel.selectByIndex(3);
		
		sel.selectByValue("opel");
		
		sel.selectByVisibleText("Volvo");
		
		String val=sel.getFirstSelectedOption().getText();
		System.out.println(val);
		
		
		
	}

}
