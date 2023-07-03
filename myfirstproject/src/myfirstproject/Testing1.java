package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email")).sendKeys("ddiksh769@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        WebElement a= driver.findElement(By.id("ap_email"));
        Thread.sleep(2000);
		   a.click();
		   Thread.sleep(2000);
		   
 a.sendKeys(Keys.CONTROL+"a");
 Thread.sleep(2000);
a.sendKeys(Keys.BACK_SPACE);
Thread.sleep(2000);
a.click();
Thread.sleep(2000);
driver.findElement(By.id("continue")).click();
Thread.sleep(2000);
driver.findElement(By.id("ap_email")).sendKeys("ddiksha769@gmail.com");
Thread.sleep(2000);
      driver.findElement(By.id("continue")).click();
      Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys("Dishi2404");
        Thread.sleep(2000);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        
        WebElement b= driver.findElement(By.id("ap_password"));
        Thread.sleep(2000);
		   b.click();
		   Thread.sleep(2000);
		   
b.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
b.sendKeys(Keys.BACK_SPACE);
Thread.sleep(2000);
b.click();
Thread.sleep(2000);
//b.sendKeys("ddiksha769@gmail.c
driver.findElement(By.id("signInSubmit")).click();
Thread.sleep(2000);
driver.findElement(By.id("ap_password")).sendKeys("Dishi@2404");
Thread.sleep(2000);
driver.findElement(By.id("signInSubmit")).click();
Thread.sleep(2000);
driver.close();


       

	}

}
