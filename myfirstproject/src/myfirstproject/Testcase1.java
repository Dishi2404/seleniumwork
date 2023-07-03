package myfirstproject;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.rahulshettyacademy.com/client");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.id("userEmail")).sendKeys("Dishi@2404");
        driver.findElement(By.id("userPassword")).sendKeys("ddiksha769@gmail.com");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.xpath("//a[@class='btn1']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Dishi");
        driver.findElement(By.id("userEmail")).sendKeys("Dishi@2404");
        driver.findElement(By.id("userMobile")).sendKeys("1234567890");
      
        WebElement StaticDropdown = driver.findElement(By.xpath("//div/select[@formcontrolname='occupation']"));
        Select dropdown = new Select(StaticDropdown);
        	   dropdown.selectByIndex(2);
        	   driver.findElement(By.xpath("//input[@value='Female']")).click();
        	   driver.findElement(By.id("userPassword")).sendKeys("Dishi@2404");
        	   driver.findElement(By.id("confirmPassword")).sendKeys("Dishi@2404");
        	   driver.findElement(By.xpath("//input[@formcontrolname='required']")).click();
        	   driver.findElement(By.id("login")).click();
        	   driver.findElement(By.id("lastName")).sendKeys("Mittal");
        	   driver.findElement(By.id("login")).click();
        	   
        	   WebElement a= driver.findElement(By.id("userEmail"));
    		   a.click();
    		   
     a.sendKeys(Keys.CONTROL+"a");
    
    a.sendKeys(Keys.BACK_SPACE);
    a.sendKeys("Mittaldishi11@gmail.com");
    driver.findElement(By.id("login")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    driver.findElement(By.id("userPassword")).sendKeys("Mittaldishi11@gmail.com");
	   driver.findElement(By.id("confirmPassword")).sendKeys("Dishi@2404");
	   driver.findElement(By.xpath("//input[@formcontrolname='required']")).click();
	   driver.findElement(By.id("login")).click();
    
        	   
        	   
       
        
        
        		
        

	}

}
