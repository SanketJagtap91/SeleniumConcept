package com.nse.seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Sanket\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

	}

}
