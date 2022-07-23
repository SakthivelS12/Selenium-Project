package com.program;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	WebElement dropdown = driver.findElement(By.xpath("(//select)[6]"));
	
	//1. is multiple
	System.out.println();
	System.out.println("   ***Is multiple***   ");
	Select s=new Select(dropdown);
	boolean multi = s.isMultiple();
	System.out.println(multi);
	//select  method
	s.selectByValue("3");
	Thread.sleep(200);
	s.selectByIndex(4);
	Thread.sleep(200);
	s.selectByVisibleText("Appium");
	Thread.sleep(200);
	s.selectByValue("1");
	Thread.sleep(300);
	//deselect
	s.deselectByIndex(3);
		System.out.println();
		
	//2. getoptions
	System.out.println("   ***Get Options***   ");
	List<WebElement> options = s.getOptions();
	for (WebElement all : options) {
		String text = all.getText();
		System.out.println(text);	
		}
		System.out.println();
		
	//3. getAllSelectedOption
	System.out.println("   ***Get All Selected Options***   ");
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement all2 : allSelectedOptions) {
		String text2 = all2.getText();
		System.out.println(text2);
		}
		System.out.println();
		
	//4. getfirstSelectedOption
	System.out.println("   ***Get First Selected Options***   ");
	WebElement firstSelect = s.getFirstSelectedOption();
		String text3 = firstSelect.getText();
		System.out.println(text3);
	
	//5. DeselectAll
		s.deselectAll();
		
	Thread.sleep(500);
	driver.quit();
}
}
