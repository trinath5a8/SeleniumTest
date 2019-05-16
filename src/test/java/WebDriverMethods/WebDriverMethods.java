package WebDriverMethods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverMethods {

	WebDriver driver;
	
	/**Executing WebDriver methods using the Chrome WebDriver*/
	@Test
	public void testWebDriverMethods() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//get() - opens the url
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		//getCurrentUrl() - fetches the current url
		System.out.println(driver.getCurrentUrl());
		System.out.println("\n");
		
		//getTitle() - gets the title of the page
		System.out.println(driver.getTitle());
		System.out.println("\n");
		
		//getPageSource() - gets the page source code
		System.out.println(driver.getPageSource());
		System.out.println("\n");
		
		//findElement() - finds the element by using selectors
		System.out.println(driver.findElement(By.id("UserName")));
		System.out.println("\n");
		
		//findElements() - finds the list of elements by tagname
		List<WebElement> element=driver.findElements(By.tagName("a"));
		for(WebElement label: element)
		System.out.println(label.getText());
		System.out.println("\n");
		
		Thread.sleep(6000);
		//getWindowHandle()
		System.out.println(driver.getWindowHandle());
		System.out.println("\n");
		
		//getWindowHandles()
		Set<String> windowID=driver.getWindowHandles();
		for(String r: windowID) {
			System.out.println(r);
		}
		
		//switchTo()
		String parent=driver.getWindowHandle();
		for(String r: windowID) 
			if(!parent.equals(r))
				driver.switchTo().window(String.valueOf(windowID));
		
		//manage()
		driver.manage().window().maximize();
		
		//driver.navigate().to()
		driver.navigate().to("http://internal.jalatechnologies.com/");
		
		//driver.navigate().back()
		driver.navigate().back();
		
//		//driver.navigate().forward()
//		driver.navigate().forward();
		
		//driver.navigate().refresh()
		driver.navigate().refresh();
		
		//click()
		driver.findElement(By.id("btnLogin")).click();
		
		//sendKeys()
		driver.findElement(By.id("UserName")).sendKeys("Hello");
		
		//getAttribute()
		System.out.println("\n"+driver.findElement(By.id("Password")).getAttribute("placeholder")+"\n");
		
		//getTagName()
		System.out.println(driver.findElement(By.id("Password")).getTagName()+"\n");
		
		//getText()
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).getText()+"\n");
		
		//isDisplayed()
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).isDisplayed()+"\n");
		
		//isEnabled()
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).isEnabled()+"\n");
		
		//isSelected()
		System.out.println(driver.findElement(By.xpath("//*[@id='RememberMe']")).isSelected() +"\n");
		
		//Thread.sleep()
		Thread.sleep(3000);
		
		//getSize()
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/b")).getSize()+"\n");
		//getLocation()
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/b")).getLocation()+"\n");
		//driver.quit()
		driver.quit();
		
		//driver.close()
		driver.close();
		
	}

	
}

