package com.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_default");
		
		driver.manage().window().maximize();
		
		/*
		 * driver.switchTo().frame(0);
		 * driver.switchTo().frame("iframeResult");
		 * driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		 * 
		 */
		
		driver.switchTo().frame("iframeResult");
		
		String val=driver.findElement(By.xpath("//h1")).getText();		
		System.out.println(val);
		
		//to come outside the frame
		driver.switchTo().defaultContent();
		
		String val1=driver.findElement(By.xpath("//div[@id='breadcrumb']//li[3]")).getText();
		System.out.println(val1);
		
		/*
		 * WebElement ele=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		 * driver.switchTo().frame(ele);
		 * 
		 *  WebElement ele1=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 * driver.switchTo().frame(ele1);
		 * 
		 * driver.findElement(By.xpath("//h5")).getText();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * WebElement ele=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		 * driver.switchTo().frame(ele);
		 * 
		 */
		
		for(int i=0;i<2;i++) {
			driver.switchTo().frame(i);
		}
		
	}

}
