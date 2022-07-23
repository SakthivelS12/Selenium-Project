package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	//Login Credentials
	WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));			
	UserName.sendKeys("sakthivelS1206");
	Thread.sleep(300);
	WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));			
	Password.sendKeys("71933G*");
	Thread.sleep(300);
	WebElement Button1 = driver.findElement(By.xpath("//input[@type='Submit']"));
	Button1.click();
	Thread.sleep(500);
	
	//Booking Details
	WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));  			//Location
	Select S1 = new Select(Location);
	S1.selectByVisibleText("Paris");
	Thread.sleep(200);
	WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));				//Hotels
	Select S2 = new Select(Hotels);
	S2.selectByIndex(2);
	Thread.sleep(300);
	WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));			//RoomType
	Select S3 = new Select(RoomType);
	S3.selectByIndex(3);
	Thread.sleep(300);
	WebElement Rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));	//No.of.Rooms
	Select S4 = new Select(Rooms);
	S4.selectByValue("2");
	Thread.sleep(300);
	WebElement CheckIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));			//CheckIn date
	CheckIn.clear();
	CheckIn.sendKeys("11/06/2022");
	Thread.sleep(300);
	WebElement CheckOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));			//CheckOut date
	CheckOut.clear();
	CheckOut.sendKeys("12/06/2022");
	Thread.sleep(300);
	WebElement Adults = driver.findElement(By.xpath("//select[@name='adult_room']"));			//No.of.Adults
	Select S5 = new Select(Adults);
	S5.selectByValue("4");
	Thread.sleep(300);
	WebElement Children = driver.findElement(By.xpath("//select[@name='child_room']"));			//No.of.Childrens
	Select S6 = new Select(Children);
	S6.selectByIndex(0);
	Thread.sleep(500);
	WebElement Button2 = driver.findElement(By.xpath("//input[@type='submit']"));
	Button2.click();
	Thread.sleep(500);
	
	//Select Hotel
	WebElement Select = driver.findElement(By.xpath("//input[@type='radio']"));
	Select.click();
	Thread.sleep(200);
	WebElement Continue = driver.findElement(By.xpath("//input[@name='continue']"));
	Continue.click();
	Thread.sleep(500);
	
	//one Person detail to Book a Hotel
	WebElement FirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
	FirstName.sendKeys("Sakthivel");
	Thread.sleep(100);
	WebElement LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
	LastName.sendKeys("K");
	Thread.sleep(100);
	WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
	Address.sendKeys("No.6 ,Vivekanandar street,Dubai kuruku sandhu, Dubai main road, Dubai-00002 ");
	Thread.sleep(100);
	WebElement Creditcard = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
	Creditcard.sendKeys("8954273128883110");
	Thread.sleep(100);
	WebElement CCType = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select S7 = new Select(CCType);
	S7.selectByVisibleText("VISA");
	Thread.sleep(100);
	WebElement ExpMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select S8 = new Select(ExpMonth);
	S8.selectByValue("10");
	Thread.sleep(100);
	WebElement ExpYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select S9 = new Select(ExpYear);
	S9.selectByVisibleText("2022");
	Thread.sleep(100);
	WebElement CVV = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
	CVV.sendKeys("1234");
	Thread.sleep(500);	
	WebElement Button3 = driver.findElement(By.xpath("//input[@id='book_now']"));
	Button3.click();
	Thread.sleep(10000);
	
	//Screenshot of Booking confirmation
	TakesScreenshot TS = (TakesScreenshot)driver;
	File Source = TS.getScreenshotAs(OutputType.FILE);
	File deFile = new File("C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\ScreenShot\\Booking.png");
	FileUtils.copyFile(Source, deFile);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Site Logout
	WebElement Logout = driver.findElement(By.xpath("//input[@name='logout']"));
	Logout.click();
	Thread.sleep(500);
	//Close the site
	driver.quit();
}
}
