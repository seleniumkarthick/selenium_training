package in.automationtesting.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.automationtesting.pages.HomePage;

public class AddToBasketTest {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		HomePage homepageObj=new HomePage(driver);
		
		//=====================START TEST CASE1=============
		homepageObj.clickShopMenu();
		homepageObj.clickHomeMenu();
		//driver.findElement(By.linkText("Shop")).click();
		//driver.findElement(By.linkText("Home")).click();
		//int actualSliderSize=driver.findElements(By.xpath("//div[@class='n2-ss-slider-3']/div//img")).size();
		int actualSliderSize=homepageObj.getSliderSize();
		int expectedSliderSize=3;
		Assert.assertEquals(expectedSliderSize,actualSliderSize);
		//=====================END TEST CASE1=============
		
		
		//=====================START TEST CASE2=============
		int actualArrivalSize=homepageObj.getNewArraivalProductSize();
		int expectedArrivalSize=3;
		Assert.assertEquals(expectedArrivalSize,actualArrivalSize);
		//=====================START TEST CASE2=============
		
		
		//=====================START TEST CASE3=============
		boolean addToBasketPresence=homepageObj.navigateNewArrival();
		Assert.assertEquals("Add to basket button not found in the page",true,addToBasketPresence);
		Assert.assertTrue(addToBasketPresence);
		//=====================START TEST CASE3=============
		
		
		//=====================START TEST CASE4=============
		String prodDesc=homepageObj.getProductDescription();
		String expDesc="The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. It contains hundreds of solutions to real-world problems, with clear explanations and ready-to-run test scripts you can use in your own projects.";
		Assert.assertEquals("Add to basket button not found in the page",expDesc,prodDesc);
		//=====================START TEST CASE4=============
		
		
		
	}

}
