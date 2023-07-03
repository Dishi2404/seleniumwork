package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.amazon.com/");
        
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']")).click();
        Thread.sleep(2000);
 // driver.get("https://www.amazon.com/customer-preferences/edit?ref_=icp_cop_flyout_change&preferencesReturnUrl=%2Fcustomer-preferences%2Fedit%3Fie%3DUTF8%26preferencesReturnUrl%3D%252Fcustomer-preferences%252Fedit%253Fie%253DUTF8%2526preferencesReturnUrl%253D%25252F%2526ref_%253Dtopnav_lang_ais%26ref_%3Dtopnav_lang_ais");
        driver.findElement(By.id("icp-currency-dropdown-selected-item-prompt")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("icp-currency-dropdown_44")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("icp-save-button")).click();
        Thread.sleep(3000);
       
       // Select dropdown = new Select(StaticDropdown);
        	 //  dropdown.selectByIndex(13);
     //   driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
     //   Thread.sleep(2000);

      //  driver.findElement(By.id("ap_email")).sendKeys("ddiksha769@gmail.com");
     //   Thread.sleep(2000);

     //   driver.findElement(By.id("continue")).click();
      //  Thread.sleep(2000);

      //  driver.findElement(By.id("ap_password")).sendKeys("Dishi@2404");
       // Thread.sleep(2000);

       // driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);

     //   driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']")).click();
       // Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(2000);

        WebElement a= driver.findElement(By.id("twotabsearchtextbox"));
		   a.click();
	        Thread.sleep(2000);

		   
 a.sendKeys(Keys.CONTROL+"a");
 Thread.sleep(2000);

a.sendKeys(Keys.BACK_SPACE);
Thread.sleep(2000);

a.sendKeys("Bedsheet");
Thread.sleep(2000);

driver.findElement(By.id("nav-search-submit-button")).click();



driver.get("https://www.amazon.com/Thread-Egyptian-SheetSet-Collection-Bedding/dp/B07CTMNN1X/ref=sr_1_2_sspa?crid=3CCXCME1IOZLE&keywords=bedsheet&qid=1684846030&sprefix=bedsheet%2Caps%2C453&sr=8-2-spons&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExVkozSkdMUUhZNkxaJmVuY3J5cHRlZElkPUEwNDYxMzI3UDJYU0xYUE9RR0VXJmVuY3J5cHRlZEFkSWQ9QTA5NTgxNTYzVlAxTUNWRE0zQkEmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl&th=1");   
driver.findElement(By.id("color_name_13")).click();
Thread.sleep(2000);

driver.findElement(By.id("AddToCartLibrary-AddToCartButton-Personalization")).click();
driver.findElement(By.id("sw-gtc")).click();
Thread.sleep(2000);
driver.close();

driver.findElement(By.xpath("(//span[@class='a-size-small sc-action-delete'])[2]")).click();
driver.findElement(By.id("a-autoid-0")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//li[@aria-labelledby='quantity_2']")).click();
Thread.sleep(2000);

driver.findElement(By.id("sc-buy-box-gift-checkbox")).click();
Thread.sleep(2000);

driver.findElement(By.id("sc-buy-box-ptc-button")).click();
Thread.sleep(2000);

driver.findElement(By.id("shipToThisAddressButton")).click();
Thread.sleep(2000);

driver.findElement(By.id("toggle-gift-item-checkbox-0")).click();
Thread.sleep(2000);
driver.close();

     // driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
  //  driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
        
        

	}

}
