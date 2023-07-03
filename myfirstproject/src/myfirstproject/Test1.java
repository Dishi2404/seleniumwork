package myfirstproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='  login-form login-modal']")).click();
       driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("diksha@yopmnail.com");
       driver.findElement(By.xpath("//input[@class='login-btn']")).click();
       driver.findElement(By.xpath("(//span[@class='ic-Radio-Buton-Of default-radio'])[2]")).click();
       driver.findElement(By.xpath("(//input[@class='login-form-inputs'])[1]")).sendKeys("ABCD");
     driver.findElement(By.id("pwdInput")).sendKeys("Dishi@2404");
     driver.findElement(By.xpath("//input[@type='checkbox']")).click();
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     driver.findElement(By.id("pwdInput")).sendKeys("Dishi@2404");
   //  String imageUrl=driver.findElement(By.xpath("//*[@id='post-body-5614451749129773593']/div[1]/div[1]/div/a/img")).getAttribute("src");
    // System.out.println("Image source path : \n"+ imageUrl);
   //  webElement img= driver.
     

    
        
        
        
       
           
           

	}

}
