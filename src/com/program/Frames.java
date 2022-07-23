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

public class Frames {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	//SingleIFrame
	driver.switchTo().frame("singleframe");
	Thread.sleep(2000);
	WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
	text1.sendKeys("Sakthivel");
	Thread.sleep(1000);
	
	//DefaultContent
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	//MultiFrame
	WebElement Iframeicon = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	Iframeicon.click();
	Thread.sleep(1000);
	//OuterFrame
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	Thread.sleep(1000);
	//innerframe
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(innerframe);
	Thread.sleep(1000);
	WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
	text2.sendKeys("SakthivelS12");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\ScreenShot\\Frame.png");
	FileUtils.copyFile(Source, Destination);
	
	driver.quit();
}
}
