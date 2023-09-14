package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	public void initializeDriver() throws IOException {
		
		FileInputStream file= new FileInputStream("C:\\Automation\\Wk2\\5thJune23Frameworkdemo\\src\\main\\java\\Resources\\data.properties");
		
		Properties obj= new Properties();
		
		obj.load(file);
		
		String Bn=obj.getProperty("browser");
		
		  if (Bn.equalsIgnoreCase("chrome")) {
			   driver = new ChromeDriver();

			  }

			  else if (Bn.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();

			  } else if (Bn.equalsIgnoreCase("edge")) {
		         driver = new EdgeDriver();

			  } else {

			   System.out.println("Please choose valid browser");
			  }        
		
	}
	
	
	
}
