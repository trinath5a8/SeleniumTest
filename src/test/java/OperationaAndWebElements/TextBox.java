package OperationaAndWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {

	/**Text Box
1. How to Type in text box using Selenium Web Driver
2. How to get a Text Box value using Selenium Web Driver
3. How to read the placeholder value of a Text Box using getAttribute() method
4. Deleting/clear text from the Text Box
5. Check if Text Box is enabled/disabled*/
	
	@Test
	public void Text()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://qamagnus.jalatechnologies.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//1. How to Type in text box using Selenium Web Driver
		WebElement ele=driver.findElement(By.id("UserName"));
		ele.sendKeys("trinath5a8@gmail.com");
		
		//2. How to get a Text Box value using Selenium Web Driver
		System.out.println(ele.getAttribute("value"));
		
		//3. How to read the placeholder value of a Text Box using getAttribute() method
		System.out.println(ele.getAttribute("placeholder"));
		
		//4. Deleting/clear text from the Text Box
		ele.clear();
		
		//5. Check if Text Box is enabled/disabled*/
		if(ele.isEnabled()) {
			System.out.println("enable");
		}
		else
		{
			System.out.println("disabled");
		}
		
		
		driver.close();
		}
		
	}

