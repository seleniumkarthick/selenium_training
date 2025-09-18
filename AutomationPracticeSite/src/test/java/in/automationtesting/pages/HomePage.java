package in.automationtesting.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(linkText="Shop")
	WebElement shopLink;
	
	@FindBy(linkText="Home")
	WebElement homeLink;
	
	@FindBy(xpath="//div[@class='n2-ss-slider-3']/div//img")
	List<WebElement> slider;
	
	@FindBy(xpath="(//div[contains(@class,'themify_builder_sub_row')])[2]/div//img")
	List<WebElement> newArrival;
	
	
	@FindBy(xpath="(//div[contains(@class,'themify_builder_sub_row')])[2]/div[1]//img")
	WebElement arrivalImg;
	
	
	@FindBy(xpath="//button[text()='Add to basket']")
	WebElement addBasketBtn;
	
	@FindBy(xpath="//h2[text()='Product Description']//following-sibling::p")
	WebElement prodDesc;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']/li/strong")
	WebElement message;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	public void clickShopMenu() {
		shopLink.click();
	}
	
	public void clickHomeMenu() {
		homeLink.click();
	}
	
	public int getSliderSize() {
		return slider.size();
	}

	public int getNewArraivalProductSize() {
		return newArrival.size();
	}
	
	public boolean navigateNewArrival() {
		arrivalImg.click();
		return addBasketBtn.isDisplayed();
	}
	
	public String getProductDescription() {
		return prodDesc.getText();
	}
	
	public void enterCredential(String user_name,String password) {
		username.clear();
		username.sendKeys(user_name);
		
		pass.clear();
		pass.sendKeys(password);
		
		loginBtn.click();
		
		
	}
	
	public void verifyErrorMsg() {
		message.isDisplayed();
	}

}
