package com.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
public static void main(String[] args) throws AWTException, InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.manage().window().maximize();
	Thread.sleep(500);
	
	Actions ac = new Actions(driver);			//Action Syntax
	Robot R = new Robot();						//Robot Syntax
	WebElement Mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
	ac.contextClick(Mobiles).build().perform();
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
	WebElement Travel = driver.findElement(By.xpath("//div[text()='Travel']"));
	driver.manage().window().maximize();
	ac.contextClick(Travel).build().perform();
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
	WebElement Appliances = driver.findElement(By.xpath("//div[text()='Appliances']"));
	driver.manage().window().maximize();
	ac.contextClick(Appliances).build().perform();
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String id : windowHandles) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
	}
	System.out.println();
	System.out.println("****************************");
	System.out.println();
	
	String Title1="Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
	String Title2="Mobile Phones Online at Best Prices in India";
	for (String id : windowHandles) {
		driver.switchTo().window(id).equals(Title1);
		System.out.println(Title1);
		System.out.println();
		break;
	}
	for (String id : windowHandles) {
		driver.switchTo().window(id).equals(Title2);
		System.out.println(Title2);
		System.out.println();
		break;
	}
	Thread.sleep(2000);
	driver.quit();
}
}
