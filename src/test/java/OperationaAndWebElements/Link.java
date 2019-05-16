package OperationaAndWebElements;
import java.util.List;
/**1. Clicking a link using partialLinkText
2. Clicking a link using link Text
3. Find out all the links in a web page
4. Clicking on an image link*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link {

	@Test
	public void links() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://qamagnus.jalatechnologies.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		//1. Clicking a link using partialLinkText
		driver.findElement(By.partialLinkText("Admin")).click();
		
		//2. Clicking a link using link Text
		driver.findElement(By.linkText("Back")).click();
		driver.findElement(By.linkText("Subscribe to News Letter")).click();
		
		//3. Find out all the links in a web page
		//All links are stored in the list
	    List<WebElement> links=driver.findElements(By.tagName("a"));	
          for(WebElement element : links)
           System.out.println(element.getText());
		
        //4. Clicking on an image link
		
		
		driver.close();
		
		
	}
}
