package com.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='/ Sign Up']"));
		// Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", ele);
        
        WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'References')]"));
		// Scrolling down the page till the element is found		
        js.executeScript("arguments[0].click();", ele1);
        
		
		
	}

}
