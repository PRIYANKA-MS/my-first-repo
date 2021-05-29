package org.test.sel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan Hari\\eclipse-workspace\\SeleniumFirst\\Drivers\\chromedriver.exe");
	    WebDriver drv =new ChromeDriver();
	    drv.get("https://www.flipkart.com/");
	    
	    WebElement txt=drv.findElement(By.xpath("(//input[@type='text'])[2]"));
	    txt.sendKeys("priyanka@gmail.com ");
	   
	    WebElement txt1=drv.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	    txt1.sendKeys("password");
	    WebElement txt2=drv.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    txt2.click();
	    }
}

