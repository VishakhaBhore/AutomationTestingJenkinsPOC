package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;	
	    

		@BeforeTest
		public void beforeTest() {	
		    //driver = new FirefoxDriver();  
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
			
				
		}
		@Test				
		public void testEasy() {	
			
			
			try {
				
				 driver = new ChromeDriver();
				driver.get("http://demo.guru99.com/test/guru99home/");  
				String title = driver.getTitle();				 
				Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
				} catch (Exception e) {
	            e.printStackTrace();
	        }
	        finally{
	            driver.close();
	            driver.quit();
	        }  
			 
			
		
		
		}	
		
		
			
		/*@AfterTest
		public void afterTest() {
			driver.quit();			
		}*/		
}