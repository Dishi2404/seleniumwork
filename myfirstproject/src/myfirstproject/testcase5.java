package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        
       // driver.findElement(By.xpath("//a[@class='a-size-base a-link-normal']")).click();
      //  driver.findElement(By.xpath("//img[@alt='Amazon fashion & beauty']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
      //  js.executeScript("window.scrollBy(0,-6100)", "");
        driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("ap_email")).sendKeys("ddiksha769@gmail.com");
        Thread.sleep(5000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("ap_password")).sendKeys("Dishi@2404");
        Thread.sleep(5000);

        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("nav-cart-count-container")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span/span/input[@value='Save for later'])[1]")).click();

      //  driver.findElement(By.xpath("//span/span/input[@name='submit.delete.Cdc075d05-f344-4881-9b8f-19b3d4d8e53b']")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//input[@data-action='move-to-cart'])[1]")).click();
        Thread.sleep(5000);
 driver.findElement(By.xpath("//input[@data-action='delete']")).click();
 Thread.sleep(5000);

        
        
       // driver.findElement(By.xpath("//input[@name='submit.save-for-later.af8c3a32-d48b-4ee8-a2df-dc3637ccb6ec']")).click();
      //  Thread.sleep(2000);

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        Thread.sleep(5000);
        driver.close();


    
        
        
        
	}

}
