package com.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		
		WebElement ele=driver.findElement(By.linkText("Shop"));
		//click the element
		ele.click();
		
		String val=driver.findElement(By.xpath("//aside[@id='sidebar']//h4")).getText();	
		System.out.println(val);
		
		String val1=driver.findElement(By.xpath("(//ul[@class='product-categories']/li)[3]")).getText();	
		System.out.println(val1);
		
		/*
		driver.findElement(By.xpath("(//ul[@class='product-categories']/li)[1]")).getText();	
		driver.findElement(By.xpath("(//ul[@class='product-categories']/li)[2]")).getText();	
		driver.findElement(By.xpath("(//ul[@class='product-categories']/li)[3]")).getText();	
		driver.findElement(By.xpath("(//ul[@class='product-categories']/li)[4]")).getText();	
		*/
		
		for(int i=1;i<=4;i++) {
			/*
			 * driver.findElement(By.xpath("(//ul[@class='product-categories']/li)[i]")).getText();	
			   the above code will consider i as string if we pass directly inside double quotes
			 * 
			 * 
			 */
			
			String values=driver.findElement(By.xpath("(//ul[@class='product-categories']/li)["+i+"]")).getText();	
			System.out.println(values);
		}
		
		
		
		
		List<WebElement> list_of_ele=driver.findElements(By.xpath("//div[@id='content']//ul/li"));
		
		int count=list_of_ele.size();
		
		for(int i=1;i<=count;i++) {
			String values=driver.findElement(By.xpath("(//div[@id='content']//ul/li)["+i+"]")).getText();	
			System.out.println(values);
		}
		
		
		
	}

}
