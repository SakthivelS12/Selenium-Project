package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		mobile.sendKeys("+918754873128");
		Thread.sleep(500);
		
		WebElement fullname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));		
		fullname.sendKeys("Sakthivel");
		Thread.sleep(500);
		
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		username.sendKeys("Sakthivel_S1206");
		Thread.sleep(500);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Sakthivel123456**");
		Thread.sleep(500);
		
		WebElement signup = driver.findElement(By.xpath("//button[@type='submit']"));
		signup.click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month:']"));
		Select s1 =new Select(month);
		s1.selectByIndex(5);
		Thread.sleep(500);
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day:']"));
		Select s2=new Select(day);
		s2.selectByValue("12");
		Thread.sleep(500);
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year:']"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1997");
		Thread.sleep(2000);
	
		driver.quit();
		
}
}