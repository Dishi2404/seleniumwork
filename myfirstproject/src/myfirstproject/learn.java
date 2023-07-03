package myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        
        
        
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile phone");
        driver.findElement(By.id("nav-search-submit-button")).click();
          Thread.sleep(2000);

        
        driver.findElement(By.xpath("//li[@id='p_89/SAMSUNG']/span/a/div")).click();
        Thread.sleep(5000);
        
      //  driver.findElement(By.xpath("//li[@id='p_n_feature_thirty-four_browse-bin/36816651011']/span/a/div")).click();
      //  Thread.sleep(2000);
       // driver.findElement(By.xpath("//li[@id='p_n_feature_twelve_browse-bin/14674911011']/span/div")).click();
      //  driver.findElement(By.xpath("//li[@id='p_n_feature_thirty-four_browse-bin/36816651011']/span/a/div")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='p_n_feature_thirty-four_browse-bin/36816644011']/span/a/div")).click();
        Thread.sleep(5000);
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
      //  Thread.sleep(5000);
        

       // js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);
        

        driver.findElement(By.xpath("//li[@id='p_n_feature_twenty-three_browse-bin/23627290011']/span/a/div")).click();
       // Thread.sleep(5000);
     //   js.executeScript("window.scrollBy(0,2500)", "");
        Thread.sleep(1000);


        driver.findElement(By.xpath("//li[@id='p_n_feature_four_browse-bin/23478592011']/span/a/div")).click();
        Thread.sleep(1000);
       // js.executeScript("window.scrollBy(0,2000)", "");
        //Thread.sleep(5000);


        driver.get("https://www.amazon.com/Samsung-Galaxy-A03-Version-Unlocked/dp/B09VQMWLB1/ref=sr_1_7?crid=1XZOG0KPDX6Z2&keywords=mobile+phone&qid=1684845612&refinements=p_89%3ASAMSUNG%2Cp_n_feature_thirty-four_browse-bin%3A36816644011%2Cp_n_feature_four_browse-bin%3A23478592011%2Cp_n_feature_twenty-three_browse-bin%3A23627290011&rnid=23627287011&s=wireless&sprefix=mobile+phone%2Caps%2C531&sr=1-7");
        //Thread.sleep(5000);
      //  js.executeScript("window.scrollBy(0,1500)", "");
       Thread.sleep(5000);
      //  driver.findElement(By.xpath("//span[@class='a-expander-prompt']")).click();
        driver.quit();

	}

}
