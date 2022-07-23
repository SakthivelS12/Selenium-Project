package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
	mobiles.getText();
	System.out.println(mobiles.getText());
	
	
	
	
	
	
	
	
}
}
