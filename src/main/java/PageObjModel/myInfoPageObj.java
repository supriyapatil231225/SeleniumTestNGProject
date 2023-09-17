package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class myInfoPageObj {
	
	@Test
	public void login() throws InterruptedException{
		
		SoftAssert SA= new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("welcome");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shdgs");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);
		String ActualText ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String ExpectedTexr =driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		SA.assertEquals(ActualText, ExpectedTexr);
		
		SA.assertAll();

}
