package com.program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot_Program {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.linkedin.com/?trk=msn-top-in");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='session_key']"));
		email.sendKeys("sakthivel5445spr@gmail.com");
		Thread.sleep(500);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='session_password']"));
		password.sendKeys("sakthivel");
		Thread.sleep(500);
		
		WebElement signin = driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']"));
		signin.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\ScreenShot\\Photo.png");
		
		FileUtils.copyFile(Source, Destination);
		
		Thread.sleep(500);
		driver.quit();
		
}
}