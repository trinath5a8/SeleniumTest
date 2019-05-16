package PopupsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertMessage {

	WebDriver driver;
	
	/**Capturing the alert message using getText()*/
	@Test
	public void testCapturingAlertMessage() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("9700058792");
		driver.findElement(By.id("Password")).sendKeys("7890");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-th-list']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),' Popups')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("alertBox")).click();
	}
}


