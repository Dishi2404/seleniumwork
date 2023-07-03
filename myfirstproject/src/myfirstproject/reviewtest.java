package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class reviewtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kurties for women");
        Thread.sleep(2000);

        driver.findElement(By.id("nav-search-submit-button")).click();
        
        Thread.sleep(2000);

        Thread.sleep(2000);

        driver.get("https://www.amazon.com/dp/B09RSG9Y3R/ref=sspa_dk_detail_3?psc=1&pd_rd_i=B09RSG9Y3R&pd_rd_w=SAaLC&content-id=amzn1.sym.f734d1a2-0bf9-4a26-ad34-2e1b969a5a75&pf_rd_p=f734d1a2-0bf9-4a26-ad34-2e1b969a5a75&pf_rd_r=DBC8BKEG1DJZE0AD33NV&pd_rd_wg=pPWTW&pd_rd_r=87ade783-bc6d-4276-b290-50497cd62931&s=apparel&sp_csd=d2lkZ2V0TmFtZT1zcF9kZXRhaWw");
      //  driver.findElement(By.xpath("//span[@class='a-expander-prompt']")).click();
        Thread.sleep(2000);

      //.findElement(By.id("a-autoid-28-announce")).click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,7100)", "");
        Thread.sleep(5000);

       // js.executeScript("arguments[0].scrollIntoView();", driver);
        //driver.findElement(By.id("//a[@data-hook='see-all-reviews-link-foot']")).click();
        driver.get("https://www.amazon.com/Janasya-Indian-Womens-Maroon-Casual/product-reviews/B09RSG9Y3R/ref=cm_cr_dp_d_show_all_btm?ie=UTF8&reviewerType=all_reviews");
        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,2800)", "");
        Thread.sleep(5000);
        

        driver.get("https://www.amazon.com/Janasya-Indian-Womens-Maroon-Casual/product-reviews/B09RSG9Y3R/ref=cm_cr_arp_d_paging_btm_2?ie=UTF8&pageNumber=2&reviewerType=all_reviews");
        Thread.sleep(5000);

       // js.executeScript("window.scrollBy(0,2800)", "");
        driver.findElement(By.id("a-autoid-0-announce")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ap_email")).sendKeys("ddiksha769@gmail.com");
        Thread.sleep(2000);

       // driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Dishi@2404");
        Thread.sleep(2000);

        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(10000);
        driver.quit();
        

        

	}

}
