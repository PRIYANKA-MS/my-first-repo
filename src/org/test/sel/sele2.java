package org.test.sel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan Hari\\eclipse-workspace\\SeleniumFirst\\Drivers\\chromedriver.exe");
	    WebDriver drv =new ChromeDriver();
	    drv.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	    drv.manage().window().maximize();
	    List<WebElement>frameSize=drv.findElements(By.tagName("frame"));
	    int size=frameSize.size();
	    System.out.println(size);
	    drv.switchTo().frame(0);
	    
	    WebElement btn=drv.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	    btn.click();
	
	    Alert alert=drv.switchTo().alert();
	  
	    alert.accept();
		
	}

}
