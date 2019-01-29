package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bidisha\\eclipse-workspace2\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://enquiry.indianrail.gov.in/ntes/index.html");
		WebElement b = driver.findElement(By.xpath("//a[text()='Trains Between Stations ']"));
		b.click();
	WebElement frm = driver.findElement(By.id("station1"));
		frm.sendKeys("CHENNAI CENTRAL [MAS]");
		WebElement to = driver.findElement(By.id("station2"));
		to.sendKeys("BHUBANESWAR [BBS]");
      }
	
	
}
