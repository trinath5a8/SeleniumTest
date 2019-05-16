package OperationaAndWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {
	/*
	 * Radio Button / Check Box  
	 * 1. Selecting the Radio Button by Label Text / value
	 * 2. Find out number of elements in a radio group 
	 * 3. Find out all radio button values
	 * 4. How to get the selected radio button label text? 
	 * 5. Check if Radio Button is selected?
	 * 6. Check if Radio Button is enabled or disabled?
	 */

	@Test
	public void RadioBtn() throws InterruptedException {

		// Setting the path of the Firefox Webdriver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		// Creating an object for the Firefox Webdriver
		WebDriver driver = new ChromeDriver();
		
		// Deleting all the cookies
		driver.manage().deleteAllCookies();

		// It is used to set the browser window size to fullscreen
		driver.manage().window().maximize();

		// This is used to open the url in the Browser
		driver.get("http://qamagnus.jalatechnologies.com/");		
		
		driver.findElement(By.id("UserName")).sendKeys("trinath5a8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8121510785");
		driver.findElement(By.id("btnLogin")).click();
		
		//pauses the program execution for 3 seconds so that the page loads up
	       Thread.sleep(3000);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Employee")).click();
		driver.findElement(By.linkText("Create")).click();

		
		//1. Selecting the Radio Button by Label Text / value
		driver.findElement(By.id("rdbFemale")).click();	
		
		// 2. Find out number of elements in a radio group 
		List<WebElement> a=driver.findElements(By.name("rdbGender"));
		System.out.println(a.size());
		
		// 4. How to get the selected radio button label text? 
		List<WebElement> b= driver.findElements(By.id("rdbFemale"));		      
		for(WebElement ElementText1: b) {
			System.out.println(ElementText1.getText());
		}
		
		
		
		//3. Find out all radio button values
		//4. How to get the selected radio button label text?
		
		
		/*List<WebElement> c= driver.findElements(By.name("rdbGender"));		
			System.out.println(c.getText());*/
		
		
		
		//5. Check if Radio Button is selected?
		List<WebElement> d= driver.findElements(By.id("rdbMale"));
		for(WebElement elementText3 : d)
			if(elementText3.isSelected())
				System.out.println("is Selected");      
			else
				System.out.println("Not selected");
	
		//6. Check if Radio Button is enabled or disabled?
		List<WebElement> e= driver.findElements(By.id("rdbMale"));
		for(WebElement elementText4 : e)
			if(elementText4.isEnabled())
				System.out.println("is Enabled");       
			else
				System.out.println("is Disabled");
		
		
		
		driver.close();
		
}	
	
	
		
		

	}


