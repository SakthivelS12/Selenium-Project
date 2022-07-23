package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement button2 = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
		button2.click();
		Thread.sleep(500);
		
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));		
		name.sendKeys("Sakthivel.K");
		String attribute1 = name.getAttribute("Sakthivel.K");
		name.clear();
		WebElement name1 = driver.findElement(By.xpath("//input[@type='text']"));		
		name1.sendKeys("K.Sakthivel");
		Thread.sleep(500);
		boolean displayed = name1.isDisplayed();
		System.out.println(displayed);
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8754879789");
		Thread.sleep(1000);
		boolean enabled = phone.isEnabled();
		System.out.println(enabled);
			
		WebElement month = driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_1_LABEL']"));
		Select s1 =new Select(month);
		s1.selectByIndex(6);
		Thread.sleep(500);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_2_LABEL']"));
		Select s2=new Select(day);
		s2.selectByValue("12");
		Thread.sleep(500);
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_3_LABEL']"));
		Select s3=new Select(year);
		s3.selectByValue("1997");
		Thread.sleep(2000);

		driver.quit();
		
}
}
