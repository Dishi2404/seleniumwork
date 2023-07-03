package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

     //  driver.findElement(By.id("id=\"nav-link-accountList\"")).click();
      // Thread.sleep(5000);

     //  driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
        driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
        Thread.sleep(5000);

       driver.findElement(By.id("ap_email")).sendKeys("ddiksha769@gmail.com");
       Thread.sleep(5000);

       driver.findElement(By.id("continue")).click();
       Thread.sleep(5000);

       driver.findElement(By.id("ap_password")).sendKeys("Dishi@2404");
       Thread.sleep(5000);

       driver.findElement(By.id("signInSubmit")).click();
       Thread.sleep(5000);

       driver.findElement(By.id("glow-ingress-line2")).click();
       Thread.sleep(5000);

       driver.findElement(By.xpath("(//input[@deliverydestinationtype='CUSTOMER_ADDRESS'])[2]")).click();
       Thread.sleep(5000);

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earings");
       Thread.sleep(5000);

       driver.findElement(By.id("nav-search-submit-button")).click();
       Thread.sleep(5000);

       driver.get("https://www.amazon.in/Perky-Diva-Floral-Acrylic-Earrings/dp/B0C2WY54S7/ref=sr_1_2_sspa?crid=ZGMCWRSB9Q8G&keywords=earrings&qid=1685007001&sprefix=earings%2Caps%2C351&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
       Thread.sleep(5000);

       driver.findElement(By.id("add-to-wishlist-button-submit")).click();
       Thread.sleep(5000);

       driver.findElement(By.xpath("//a[text()='View Your List']")).click();
       Thread.sleep(5000);
driver.close();
       


	}

}
