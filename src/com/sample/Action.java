package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
	 System	.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace Selnium\\Pratices\\driver\\chromedriver.exe");

	WebDriver a = new ChromeDriver();
	
	Actions b = new Actions(a);
		a.get("http://www.greenstechnologys.com/");
		a.manage().window().maximize();
		
		WebElement i = a.findElement(By.xpath("//a[text()='COURSES']"));
		b.moveToElement(i).perform();
		
		WebElement j = a.findElement(By.xpath("//span[text()='Oracle Training']"));
		b.moveToElement(j).perform();
		
		a.findElement(By.xpath("//span[text()='SQL Certification']")).click();
		
		
	}

}
