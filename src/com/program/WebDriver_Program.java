package com.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Program {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	driver.get("https://exceljet.net/training");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(1000);
	
	driver.navigate().forward();
	Thread.sleep(1000);
	
	driver.navigate().refresh();
	Thread.sleep(1000);
		
	String l1 = driver.getTitle();
	System.out.println("Title  : "+l1);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL : "+currentUrl);
	
	driver.navigate().to("https://in.bookmyshow.com/explore/home/chennai");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	String l2 = driver.getTitle();
	System.out.println("Title :  "+l2);
	
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println("Current URL : "+currentUrl2);
	Thread.sleep(1000);
	
	driver.navigate().refresh();
	
//	String pageSource = driver.getPageSource();
//	System.out.println("page source : "+pageSource);
		
//	driver.close();
	driver.quit();
}
}
