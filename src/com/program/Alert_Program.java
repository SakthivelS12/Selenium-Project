package com.program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Program {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	
	WebElement Simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
	Simple.click();
	Thread.sleep(2000);
	Alert Simplealert = driver.switchTo().alert();
	Simplealert.accept();
	Thread.sleep(500);
	
	WebElement Confirm = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	Confirm.click();
	Thread.sleep(2000);
	Alert Confirmalert = driver.switchTo().alert();
	Confirmalert.dismiss();
	Thread.sleep(500);
	
	WebElement Prompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	Prompt.click();
	Thread.sleep(2000);
	Alert Promptalert = driver.switchTo().alert();
	Promptalert.sendKeys("Green Technology");
	Promptalert.accept();
	Thread.sleep(500);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\ScreenShot\\Alert.png");
	FileUtils.copyFile(Source, Destination);
	Thread.sleep(500);
	driver.quit();
}
}
