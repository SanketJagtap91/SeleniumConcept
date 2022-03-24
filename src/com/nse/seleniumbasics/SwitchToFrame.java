package com.nse.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Sanket\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.openemr.io/b/openemr");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select lang = new Select(driver.findElement(By.xpath("//select[@name='languageChoice']")));
		lang.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.id("login-button")).click();
		
		
		driver.findElement(By.xpath("//span[@class='tabTitle pr-2 tabHidden']")).click();
		
		driver.switchTo().frame("msg");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-add']")).click();
		
		Select type = new Select(driver.findElement(By.id("form_note_type")));
		type.selectByVisibleText("Pharmacy");
		
		Select status = new Select(driver.findElement(By.id("form_message_status")));
		status.selectByVisibleText("New");
		
		Select user = new Select(driver.findElement(By.id("users")));
		user.selectByIndex(1);
		
		driver.findElement(By.id("note")).sendKeys("Hello");
		//driver.findElement(By.id("cancel")).click();
		
		
		
		
		
		
	}

}
