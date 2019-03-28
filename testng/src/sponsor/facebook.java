package sponsor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class facebook {
	
	public void landingpage() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Srikanth office\\chrome driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Properties prob =new Properties();
		FileInputStream path = new FileInputStream("C:\\Users\\srikanth\\eclipse-workspace\\testng\\src\\uimaps\\datadrivern.properties");
		prob.load(path);
		String username=prob.getProperty("username");
		String pass=prob.getProperty("password");
		
		driver.findElement(By.cssSelector("#email")).sendKeys(username);
		driver.findElement(By.cssSelector("#pass")).sendKeys(pass);
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#pass")).clear();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		 
		
	}

}
