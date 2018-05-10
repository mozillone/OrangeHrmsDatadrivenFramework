package orangehrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Users {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Creating a driver object referencing WebDriver interface
		WebDriver driver;
		
		//Setting webdriver.gecko.driver property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		
		//Instantiating driver object and launching browser
		driver = new ChromeDriver();
		
		//Using get() method to open a webpage
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		//maximizing the browser window
		driver.manage().window().maximize();
		
		//Waiting for 3 seconds just for user to efficiently check automation
		//Its not mandatory though
		//Thread.sleep(3000);
		
		//Finding textbox using name locator and then using send keys to write in it
		WebElement UserName = driver.findElement(By.id("txtUsername"));
		UserName.sendKeys("Admin");
		
		//Finding textbox using name locator and then using send keys to write in it
		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin");
		
		//Finding textbox using name locator and then using send keys to write in it
				WebElement LoginButton = driver.findElement(By.id("btnLogin"));
				LoginButton.click();
				
				
			//verifying whether user is loged in sucessfully by capturing the text present upon login
				if(driver.getPageSource().contains("Welcome John"))
					  {
					    System.out.println("User Login Sucessfull");
					  }
					else
					  {
					    System.out.println("User Login Failed");
					  }
		
		
		
		
		
		
					driver.close();
				
		
	}

}
