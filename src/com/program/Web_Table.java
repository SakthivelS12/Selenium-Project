package com.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Web_Table {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://leafground.com/pages/table.html");
	driver.manage().window().maximize();	
	//All Data
	System.out.println();
	System.out.println("***** All Data *****");
	List<WebElement> AllData = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement All : AllData) {
		String text1 = All.getText();
		System.out.println(text1);
	}
	//Row Data
	System.out.println();
	System.out.println("***** Row Data *****");
	List<WebElement> RowData = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
	for (WebElement row : RowData) {
		String text2 = row.getText();
		Dimension size = row.getSize();
		System.out.println(text2);
		System.out.println(size);	
	}
	//Column Data
	System.out.println();
	System.out.println("***** Column Data *****");
	List<WebElement> ColData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	for (WebElement column : ColData) {
		String text3 = column.getText();
		System.out.println(text3);
	}
	//Particular Data
	System.out.println();
	System.out.println("***** Particular Data *****");
	List<WebElement> PrtData = driver.findElements(By.xpath("//table/tbody/tr[3]/td[1]"));
	for (WebElement Particular : PrtData) {
		String text4 = Particular.getText();
		System.out.println(text4);	
	}
	//Header
	System.out.println();
	System.out.println("***** Header *****");
	List<WebElement> header = driver.findElements(By.tagName("th"));
	for (WebElement Header : header) {
		String text5 = Header.getText();
		System.out.println(text5);	
	}
	driver.quit();	
}
}
