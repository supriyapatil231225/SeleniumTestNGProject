package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	
	public WebDriver driver;
	private By username = By.xpath("//input[@name='username']");
	private By password= By.xpath("//input[@name='password']");
	private By logIn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	public loginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterusername(){
		
		return driver.findElement(username);
	}
	public WebElement enterpassword(){
		
		return driver.findElement(password);
	}
	
	public WebElement logInB(){
		
		return driver.findElement(logIn);
	}
}
