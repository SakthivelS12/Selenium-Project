package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Xpath {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	Dimension D = new Dimension(500,500);
	driver.manage().window().setSize(D);
	driver.manage().window().maximize();
	Thread.sleep(500);
		
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("sakthivel_s12");
	Thread.sleep(500);

	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("sakthivel12345");
	Thread.sleep(500);
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(500);
	
	WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
	email1.sendKeys("sakthivel5445spr@gmail.com");
	Thread.sleep(500);
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	pass.sendKeys("sakthivel");
	Thread.sleep(500);
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	Thread.sleep(3000);

	driver.quit();
}
}
