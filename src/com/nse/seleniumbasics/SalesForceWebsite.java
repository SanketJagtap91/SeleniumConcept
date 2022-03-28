package com.nse.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesForceWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		System.setProperty("webdriver.chrome.driver","E:\\Sanket\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select usertitle = new Select(driver.findElement(By.name("UserTitle")));
		usertitle.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("johncom");
		
		Select employees = new Select(driver.findElement(By.name("CompanyEmployees")));
		employees.selectByVisibleText("101 - 500 employees");

		Select country = new Select(driver.findElement(By.name("CompanyCountry")));
		country.selectByVisibleText("United Kingdom");	
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		driver.findElement(By.name("start my free trial")).click();
		
		String errormessage =driver.findElement(By.xpath("//span[text()='Enter a valid phone number']")).getText();
		System.out.println(errormessage);

		if (errormessage.equals("Enter a valid phone number"))
			System.out.println("Test Completed Successfully!!!");
		
//		driver.quit();
		
	}

}
