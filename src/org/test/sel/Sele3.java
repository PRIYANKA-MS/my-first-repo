 package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele3 {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan Hari\\eclipse-workspace\\SeleniumFirst\\Drivers\\chromedriver.exe");
    WebDriver drv =new ChromeDriver();
    drv.get("http://www.greenstechnologys.com");
    
    WebElement txt=drv.findElement(By.xpath("//input[@id='firstName']"));
    txt.sendKeys("priyanka");
    WebElement txt1=drv.findElement(By.xpath("//input[@id='lastName']"));
    txt1.sendKeys("murugesan");
    

}

}