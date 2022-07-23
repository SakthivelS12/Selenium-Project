package com.program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UpDown {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;	
	//Scroll_Down
	js.executeScript("window.scrollBy(0,3000)");
	Thread.sleep(1000);
	
	//End page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(1000);
	
	//Starting Page
	js.executeScript("window.scroll(0,0)","");
	Thread.sleep(1000);
	
	//Scroll_Up
	js.executeScript("window.scrollBy(0,-3000)");
	Thread.sleep(2000);
	
	//Scroll_Down
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,3000)");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,4000)");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,5000)");
	Thread.sleep(1000);
	
	WebElement Country = driver.findElement(By.xpath("(//a[@class='nav_a'])[38]"));
	js.executeScript("arguments[0].click();",Country);
	//ScreenShot
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\ScreenShot\\amazon.png");
	FileUtils.copyFile(Source, Destination);
	
	Thread.sleep(3000);
	driver.quit();	
}
}
