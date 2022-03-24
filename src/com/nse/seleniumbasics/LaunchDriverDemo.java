package com.nse.seleniumbasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Sanket\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.goto.com/meeting/");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.xpath("//a[@href='/meeting/trial']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Sanket");
		driver.findElement(By.id("last-name")).sendKeys("Jagtap");
		driver.findElement(By.id("login__email")).sendKeys("s@gmail.com");
		driver.findElement(By.id("login__password")).sendKeys("admin@123");
		
		Select selectcom = new Select(driver.findElement(By.id("CompanySize")));
		selectcom.selectByVisibleText("10 - 99");
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();

	}

}
