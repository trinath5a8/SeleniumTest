package OperationaAndWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**1. Print all the options available in the dropdown
2. Print first selected option from a dropdown
3. Select an option by value from a dropdown
4. Select an option by visible text from a dropdown
5. Select an option by index from a dropdown*/
public class DropDownList {

	@Test
	public void DropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://qamagnus.jalatechnologies.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("UserName")).sendKeys("trinath5a8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8121510785");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Employee")).click();
		driver.findElement(By.linkText("Create")).click();
		
		//1.Print all the options available in the dropdown
		Select Country = new Select(driver.findElement(By.name("CountryId")));
		
		List<WebElement> list=Country.getOptions();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		     
		/*for(WebElement we:list) {
			System.out.println(we.getText());
		}*/
		/**output:--Select Country--
		Bangladesh  	Canada 		China 		France	India	Japan	 Nepal	Sri Lanka	 UK	 USA*/
		
		//2.Print first selected option from a dropdown
		Select City1 = new Select(driver.findElement(By.name("CountryId")));
		City1.selectByValue("1"); //It will be select Bangladesh	
		
		
		// 3. Select an option by value from a dropdown
		Select City2 = new Select(driver.findElement(By.name("CountryId")));
		City2.selectByValue("6"); //It will be select Canada
		
		
		
		// 4. Select an option by visible text from a dropdown
		Select City3 = new Select(driver.findElement(By.name("CountryId")));
		City3.selectByVisibleText("Japan");
		
		
		// 5. Select an option by index from a dropdown
		Select City4 = new Select(driver.findElement(By.name("CountryId")));
		City4.selectByIndex(1);  //It will be select Bangladesh		
		
		
		driver.close();
		
		
	}

}
