package com.selenium.commands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	public static void main(String[] args) throws Exception {

		/*
		 * 
		 * Thread.sleep(milliseconds) - Java
		 * 
		 * Implicity wait - wait for entire page to get loaded(DOM)
		 * ExplicityWait - wait for particular element to get loaded
		 * Fluentwait - wait for particular element to get loaded we will pooling time
		 * 
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Thread.sleep(30000);
		
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Login']"));
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait1.until(ExpectedConditions.visibilityOf(ele));
		
		
		
		//Declare and initialise a fluent wait
		FluentWait wait = new FluentWait(driver);
		//Specify the timout of the wait
		wait.withTimeout( Duration.ofSeconds(30));
		//Sepcify polling time
		wait.pollingEvery(Duration.ofSeconds(10));
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		wait.until(ExpectedConditions.alertIsPresent());
		
		WebElement ele1=driver.findElement(By.xpath("//h2[text()='Login']"));
		wait.until(ExpectedConditions.visibilityOf(ele1));
	}

}
