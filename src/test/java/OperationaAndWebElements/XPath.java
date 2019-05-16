package OperationaAndWebElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 1. Read label text and its color 2. Write an xpath for id, name, className 3.
 * How to find an element that contains a specific text using contains() 4. How
 * to find an element using text() 5. How to find an element that starts-with()
 * 6. XPath to select following-sibling and preceding 7. XPath to select an
 * element using ancestor, child, parent and descendent 8. XPath using OR and
 * AND
 */
public class XPath {
	
	
	@Test(priority=1)
	public void XPath1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://qamagnus.jalatechnologies.com");

		/** 1.Read label text and its color */
		WebElement element = driver.findElement(By.className("login-box-msg"));

		// prints the label text and color of the element
		System.out.println(element.getText() + "\n" + element.getCssValue("color"));

		/** 2. Write an xpath for id, name, className */
		// Sending keys using Xpath By using id
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("9700058792");

		// Sending keys using Xpath By using name
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("7890");

		// Sending keys using Xpath By using classname
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-flat']")).click();

		/** 3.How to find an element that contains a specific text using contains() */
		driver.findElement(By.xpath("//button[contains(@id,'btnLogin')]")).click();

		/** 4. How to find an element using text() */
		// Clicking on button using Xpath Contains text()
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
	}
	
	
/**5.How to find an element that starts-with() */
	
	@Test
	public void FindingAnElementUsingStartsWith() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("9700058792");
		driver.findElement(By.id("Password")).sendKeys("7890");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		//Clicking on button using Xpath Contains text()
        driver.findElement(By.xpath("//i[starts-with(@class,'fa fa-users')]")).click();
	}	
	
	/**6.XPath to select following-sibling and preceding*/
	
	@Test
	public void XpathSelectSiblingAndPreceding() throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("9700058792");
		driver.findElement(By.id("Password")).sendKeys("7890");
		driver.findElement(By.id("btnLogin")).click();
	
		//Clicking on button using Xpath Contains text()
        driver.findElement(By.xpath("//i[starts-with(@class,'fa fa-th-list')]")).click();
        
        Thread.sleep(3000);
		
        // Selecting the following-sibling
        driver.findElement(By.xpath("//a[contains(text(),' Autocomplete')]/parent::*/following-sibling::li[5]/a")).click();
        
        Thread.sleep(5000);
        //Selecting using the preceding sibiling
        driver.findElement(By.xpath("//a[contains(text(),' Autocomplete')]/parent::*/preceding-sibling::li[2]/a")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**7.XPath to select an element using ancestor, child, parent and descendent */
	
	@Test
	public void SelectingAnElementUsing_Ancestor_Child_Parent_Descendent() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("9700058792");
		driver.findElement(By.id("Password")).sendKeys("7890");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
	
		//Clicking on button using Xpath Contains text()
        driver.findElement(By.xpath("//i[starts-with(@class,'fa fa-th-list')]")).click();
        
        Thread.sleep(3000);
		
        // Selecting the ancestor li of element i and selecting all its child elements and  storing them in a list
        List<WebElement> childElement=driver.findElements(By.xpath("//i[starts-with(@class,'fa fa-th-list')]/ancestor::li/child::*"));
       
        //this is a foreach loop to print the tagnames of the ancestors
        for(WebElement i: childElement)
    	System.out.println(i.getText());  //printing the label text
        
        
      //***************************************Parent Element*********************

        //only to differentiate between the above output
        System.out.println("\n*****************\n");
       
        List<WebElement> parentElement=driver.findElements(By.xpath("//i[starts-with(@class,'fa fa-th-list')]/parent::*"));
       
        //this is a foreach loop
        for(WebElement i: parentElement)
    	System.out.println(i.getTagName()); //Printing  the Tag name
        
        //**************************************Descendant Element*****************************
        
        //only to differentiate between the above output
        System.out.println("\n*****************\n");
        
        List<WebElement> Descendant=driver.findElements(By.xpath("//i[starts-with(@class,'fa fa-th-list')]/parent::*/descendant::*"));
        
        //this is a foreach loop to print the tagnames of the ancestors
        for(WebElement i: Descendant)
    	System.out.println(i.getTagName()); //Printing  the Tag name
	}
	
	
	
	
	
	
	/**8.Xpath using OR and AND*/
	
		@Test
		public void XpathUsingOr_And() throws Exception {
			
			// Setting the path of the Firefox Webdriver
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		
			driver.get("http://qamagnus.jalatechnologies.com/");
			
			driver.findElement(By.id("UserName")).sendKeys("9700058792");
			driver.findElement(By.id("Password")).sendKeys("7890");
			driver.findElement(By.id("btnLogin")).click();
		
		    
	        Thread.sleep(3000);
			
	        // Selecting the parent of element i
	        driver.findElement(By.xpath("//li/a/i[@class='fa fa-users']")).click();
	        
	        Thread.sleep(3000);
	       
	        driver.findElement(By.xpath("//a[contains(text(),' Search ')]")).click();
	        
	        Thread.sleep(3000);
	        
	        //Entering username using id or name ** Sends keys if either id or name of the element are similar
	        driver.findElement(By.xpath("//input[@id='Name' or @name='Name']")).sendKeys("shaikh");
	        
	        //Entering mobile using id or name  ** Sends keys if id and name of the element are similar
	        driver.findElement(By.xpath("//input[@id='MobileNo' and @name='Mobile']")).sendKeys("1234567891");
		}

	
	}
