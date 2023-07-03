package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
        driver.findElement(By.id("ap_email")).sendKeys("ddiksha769@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Dishi@2404");
        driver.findElement(By.id("signInSubmit")).click();
       driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        WebElement a= driver.findElement(By.id("twotabsearchtextbox"));
		   a.click();
		   
		   
 a.sendKeys(Keys.CONTROL+"a");
a.sendKeys(Keys.BACK_SPACE);
a.sendKeys("Macbook");
      //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook");
   driver.findElement(By.id("nav-search-submit-button")).click();
   driver.get("https://www.amazon.in/Renewed-Lenovo-IdeaPad-Platinum-81VT009UIN/dp/B09XBJTJQX/ref=dp_prsubs_sccl_1/261-8469025-9880439?pd_rd_w=KRBro&content-id=amzn1.sym.2f3ff0c8-8f5f-437e-834e-57e94146d05c&pf_rd_p=2f3ff0c8-8f5f-437e-834e-57e94146d05c&pf_rd_r=C7989NFDNYSJ4PSEB0V6&pd_rd_wg=NkETx&pd_rd_r=89af8a0e-7ece-4ff5-b58c-a4dda2398703&pd_rd_i=B09XBJTJQX&psc=1");   
driver.findElement(By.id("mbb-offeringID-1")).click();

  driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
        
       

	}

}
