package org.test.sel;


//import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kannan Hari\\eclipse-workspace\\SeleniumFirst\\Drivers\\chromedriver.exe");
	    WebDriver drv =new ChromeDriver();
	    drv.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	    drv.manage().window().maximize();
	
	    
	    WebElement txt=drv.findElement(By.xpath("(//img[@class='goahead'])[1]"));
	    txt.click();
	    
	    WebElement txt1=drv.findElement(By.xpath("//input[@title='User Id']"));
	    
	   
	    txt1.sendKeys("hijaaavaa");
	    
	    WebElement pass=drv.findElement(By.xpath("//input[@class='login-input-password']"));
	    
	   
	    pass.sendKeys("priyanka");
	    
	    WebElement btn=drv.findElement(By.xpath("//input[@class='cta']"));
	    btn.click();
	    
	}
}