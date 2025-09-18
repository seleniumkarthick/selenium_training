package in.automationtesting.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.automationtesting.pages.HomePage;
import io.cucumber.java.en.*;


public class LoginSteps {
	
	WebDriver driver;
	HomePage homepageObj;
	
	@Given("^the user launches the application$")
	public void user_launchs_the_application() {

		driver=new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		homepageObj=new HomePage(driver);
		
	}
	
	@When("^the user navigates to home page from shop$")
	public void the_user_navigates_to_home_page_from_shop() {
		homepageObj.clickShopMenu();
		homepageObj.clickHomeMenu();
	}
	
	@Then("^the user validates the slider$")
	public void the_user_validates_the_slider(){
		int actualSliderSize=homepageObj.getSliderSize();
		int expectedSliderSize=3;
		Assert.assertEquals(expectedSliderSize,actualSliderSize);
	}
	
	@Then("^the user validates the new arrival$")
	public void the_user_validates_the_new_arrival(){
		int actualArrivalSize=homepageObj.getNewArraivalProductSize();
		int expectedArrivalSize=3;
		Assert.assertEquals(expectedArrivalSize,actualArrivalSize);
	}
	
	
	@And("^the user close the browser$")
	public void the_user_close_the_browser(){
		driver.quit();
	}
	
	@Given("^user launches account page$")
	public void user_launches_account_page() {
		
		driver=new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		driver.manage().window().maximize();
		
		homepageObj=new HomePage(driver);
		
	}
	
		
	
	@When("user provides {string} and {string}")
	public void user_provides_username_and_password(String user,String pass) {
		homepageObj.enterCredential(user,pass);
	}
	
	@Then("user validates message")
	public void user_validates_message() {
	    homepageObj.verifyErrorMsg();
	   
	}

	
	
	
	
	
	
	
	
	

}
