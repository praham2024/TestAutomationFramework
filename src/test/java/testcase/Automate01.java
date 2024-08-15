package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//PRAVIN import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//PRAVIN import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate01 {

	public static void main(String[] args) throws Throwable {
		
		//setup ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\hambirp\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hambirp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.body.style.zoom = '.5'");
		
		
		
/*PRAVIN
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
PRAVIN */		
		driver.get("https://liliweb20230530130836.azurewebsites.net/Account/Login");
		 
		
		/* PRAVIN
		//System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		PRAVIN */
		
		//driver.get("https://liliuat.moh.gov.on.ca/");
		
/*		
				driver.findElement(By.id("UserName")).sendKeys("pravin.hambir2@ontario.ca");
				driver.findElement(By.id("Password")).sendKeys("TempPass1!");
				driver.findElement(By.id("submitBtn")).click();
*/		
		// id="Email"
		// id="Password" 
		//driver.findElement(By.id("Email")).sendKeys("pravin.hambir2@ontario.ca");
		//driver.findElement(By.id("Password")).sendKeys("TempPass1!");
		//driver.findElement(By.id("login-submit")).click();
		
		
        // Enter username and password
        driver.findElement(By.id("Email")).sendKeys("pravin.hambir2@ontario.ca");
        driver.findElement(By.id("Password")).sendKeys("TempPass1!");

        // Click the login button
        driver.findElement(By.id("login-submit")).click();

        // Perform some action (e.g., click on an element with ID "2")
        //driver.findElement(By.id("2")).click();
        
        
        //=================================================
        
        driver.findElement(By.linkText("Request")).click();
        driver.findElement(By.linkText("New Organization Account")).click();
        driver.findElement(By.id("OrganizationAccountInfoForm_OrganizationAccountName")).click();
        
        // Enter organization account name
        driver.findElement(By.id("OrganizationAccountInfoForm_OrganizationAccountName"))
            .sendKeys("PH TEST ORG AC 2024");

        
               
        // Select organization owner
        System.out.println("R73");
        driver.findElement(By.id("OrganizationAccountOwner_OrganizationID"))
        .findElement(By.xpath("//option[. = 'Alexandra Hospital']")).click();
        System.out.println("R75");

         
        System.out.println("5 sec First");
        Thread.sleep(5000);

        // Enter address details
        driver.findElement(By.id("OrganizationAccountOwner_Address_Address1")).sendKeys("a1");
        driver.findElement(By.id("OrganizationAccountOwner_Address_Address2")).sendKeys("a2");
        driver.findElement(By.id("OrganizationAccountOwner_Address_CityNameTypeId"))
            .findElement(By.xpath("//option[. = 'Agincourt']")).click();
        System.out.println("5 sec SECOND");
        Thread.sleep(5000);

        driver.findElement(By.id("OrganizationAccountOwner_Address_PostalCode")).sendKeys(Keys.SHIFT);
        driver.findElement(By.id("OrganizationAccountOwner_Address_PostalCode")).sendKeys("a1a1a1");
        System.out.println("2 sec SECOND-A");
        Thread.sleep(2000);
        driver.findElement(By.id("OrganizationAccountOwner_Address_PhoneNumber")).sendKeys(Keys.SHIFT);
        driver.findElement(By.id("OrganizationAccountOwner_Address_PhoneNumber")).sendKeys("1111111111");
        
        
       // driver.findElement(By.id("OwnerRepresentativeID")).click();
        //driver.findElement(By.id("OwnerRepresentativeID")).findElement(by.);
        // Select owner representative
        WebElement dropdown1 = driver.findElement(By.id("OwnerRepresentativeID"));
        Select selectObject = new Select(dropdown1);
        selectObject.selectByIndex(1);
        
        ////driver.findElement(By.id("OwnerRepresentativeID"))
        ////.findElement(By.xpath("//option[. = 'Test test']")).click();
        System.out.println("5 sec THIRD 108");
        Thread.sleep(5000);

  
/* PRAVIN          
        //id = OrganizationAccountOwner_Address_PostalCode
        // OrganizationAccountOwner_Address_PhoneNumber
PRAVIN */        
        //driver.findElement(By.partialLinkText("Save")).click();
 //driver.findElement(By.xpath("//*[@id=\"CreateOrganizationAccountForm\"]/div[2]/input")).click();
        //=================================================

		
        //driver.quit();	
	}

}
