package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjModel.loginPageObjects;
import Resources.BaseClass;

public class loginTest extends BaseClass {
	
	@Test
	public void verifylogin() throws IOException, InterruptedException {
		
		initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		loginPageObjects lp= new loginPageObjects(driver);
		lp.enterusername().sendKeys("Admin");
		lp.enterpassword().sendKeys("admin123");
		lp.logInB().click();
		
	}
	
	@Test
	public void verifyInvalidlogin() throws IOException, InterruptedException {
		
		initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		loginPageObjects lp= new loginPageObjects(driver);
		lp.enterusername().sendKeys("Admin");
		lp.enterpassword().sendKeys("admintt123");
		lp.logInB().click();
		
	}

	
	
}
