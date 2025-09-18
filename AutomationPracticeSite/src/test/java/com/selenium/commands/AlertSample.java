package com.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://practice.automationtesting.in/");
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("SwitchTo")).click();
		
		driver.findElement(By.linkText("Alerts")).click();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		
		
		
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
		
		String actual=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(actual.equals("You pressed Ok")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		
		
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		
		System.out.println(alrt.getText());
		
		alrt.dismiss();
		
		String cancel_actual=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(cancel_actual.equals("You Pressed Cancel")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		
		
	}

}
