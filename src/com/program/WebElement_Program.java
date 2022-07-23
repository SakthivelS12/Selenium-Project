package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Program {
public static void main(String[] args) throws InterruptedException {
							//key driver				// value path
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");	
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));			// SendKeys()
	email.sendKeys("sweethome@gmail.com");
	Thread.sleep(2000);
		
	String attribute = email.getAttribute("sweethome@gmail.com");	// Attribute()
	email.clear();													// Clear()
	
	WebElement email1 = driver.findElement(By.id("email"));			// SendKeys()
	email1.sendKeys("sakthivel_s12@gmail.com");
	
	boolean isSelected=email1.isSelected();							// isSelected()
	System.out.println("Selected : "+isSelected);
	
	boolean displayed = email1.isDisplayed();						// isDisplayed()
	System.out.println("Displayed : "+displayed);
		
	WebElement password = driver.findElement(By.id("pass"));		// SendKeys()
	password.sendKeys("sakthivel*");
	
	boolean enabled = password.isEnabled();							// isEnabled()
	System.out.println("Enabled : "+enabled);
	
	WebElement login = driver.findElement(By.name("login"));		// Click()
	login.click();
	
	Thread.sleep(5000);
	driver.quit();
	
	}
}
	