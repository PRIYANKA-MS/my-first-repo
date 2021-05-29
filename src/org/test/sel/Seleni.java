package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleni {
	public static  void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan Hari\\eclipse-workspace\\SeleniumFirst\\Drivers\\chromedriver.exe");
	    WebDriver drv =new ChromeDriver();
	    drv.get("http://demo.automationtesting.in/Register.html");
	    drv.manage().window().maximize();
	    
	  WebElement txt=drv.findElement(By.xpath("(//input[@type='text'])[1]"));
	  txt.sendKeys("PRIYANKA");
	  
	  WebElement txt2=drv.findElement(By.xpath("(//input[@type='text'])[2]"));
	 txt2.sendKeys("MURUGESAN");
	   //WebElement txt1=drv.findElement(By.id("text"));
	   
	   //txtPassword.sendKeys("hello");
	 
	    
	 //   drv.quit();
	    
	    
	    
	}
}
