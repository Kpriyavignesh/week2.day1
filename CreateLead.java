package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setup driver
				WebDriverManager.chromedriver().setup(); //static
				//WebDriverManager.firefoxdriver().setup(); //static
				
				//Launch the Browser
				ChromeDriver driver = new ChromeDriver(); 
				//FirefoxDriver driver = new FirefoxDriver(); 
				
				//Load the URL (get)
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//mimimize the browser
				//driver.manage().window().minimize();
				
				//identify the user name field and enter user name
				//find element
				//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				
				//identify the user name field and enter the password
				//find element
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click on Login
				driver.findElement(By.className("decorativeSubmit")).click();
						
				//Click on link text
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on Leads tab
				driver.findElement(By.linkText("Leads")).click();
				
				//Click on Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter Mandatory Fields
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kamalapriya");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vigneswaran");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kamalapriya");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Java - Selenium");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Java - Selenium Description");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sayhitopriya2003@gmail.com");
				
				//Step: 1 - Find the drop down element  (select tag)
				WebElement eleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
							
				//Step: 2 - Convert that select Class (drop down)
				Select dd =  new Select(eleState);
			
						
				//select by Visible Text
				dd.selectByVisibleText("Alabama");
						
				//Click on Create Lead button
				driver.findElement(By.name("submitButton")).click();
				
				//Get the Title of the application
				String title = driver.getTitle();
				System.out.println(title);
				
				Thread.sleep(5000);
				
				driver.close();
	}

}
