package orangehrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateContact {
	
	WebDriver driver;
	
	
	
	@Test(dataProvider = "dp")
	public void branchcreation(String branchname,String Address1,String Address2, String Address3, 
			String Area, String ZipCode, String country, String state, String city) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	
		//Instantiating driver object and launching browser
				driver = new ChromeDriver();
				
				//Using get() method to open a webpage
				driver.get("https://www.freecrm.com/");
				
				//maximizing the browser window
				driver.manage().window().maximize();
				
				//Waiting for 3 seconds just for user to efficiently check automation
				//Its not mandatory though
				//Thread.sleep(3000);
				
				//Finding textbox using name locator and then using send keys to write in it
				WebElement UserName = driver.findElement(By.name("username"));
				UserName.sendKeys("mozillone");
				
				//Finding textbox using name locator and then using send keys to write in it
				WebElement Password = driver.findElement(By.name("password"));
				Password.sendKeys("Dotcom@123");
				
				//Finding Button using xpath locator and then using click method clicking action is performed
				WebElement LoginButton = driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input"));
				LoginButton.click();
				
				

		        WebElement element = driver.findElement(By.linkText("Contacts"));
		 
		        Actions action = new Actions(driver);
		 
		        action.moveToElement(element).build().perform();
		 
		        driver.findElement(By.linkText("New Contact")).click();
	}
		
		/*try {
			webDriver.switchTo().alert().accept();
		} catch (Exception e) {
			//
		}*/
  @Test
  public void f() {
  }
}
