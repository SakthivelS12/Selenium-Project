package com.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement Mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		//Actions------>Mouse based actions
		Actions act=new Actions(driver);
//		act.click(Mobile).build().perform(); // left mouse click
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		act.doubleClick(Mobile).build().perform();
//		driver.navigate().back();
		
		act.contextClick(Mobile).build().perform(); // right mouse click 
		// Robot------>Keyboard based actions , because we cannot take Xpath for right click options
		Thread.sleep(3000);
		Robot robo=new Robot();
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);		//Open link in new tab
//		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);		//Open link in new window
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);		//Open link in incognito window
//		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);		
		Thread.sleep(5000);
		driver.quit();
	}
}
