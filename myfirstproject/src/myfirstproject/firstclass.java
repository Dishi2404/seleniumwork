
package myfirstproject;

import java.util.Iterator;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\INFIWAVE SOLUTUONS\\Desktop\\chrome.exe");
        WebDriver driver = new ChromeDriver();
       
        
        driver.get("https://www.etsy.com/");
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchbox.sendKeys("Handmade Earings");
        searchbox.submit();
      
       driver.findElement(By.xpath("//div//img[@alt='Oyster Copper Turquoise Pear Stone Solid 925 Sterling Silver Earrings For Women, Handmade Boho Silver Earrings For Wedding Anniversary Gift']")).click();
      Set<String> windows =driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      String parentid= it.next();
      String childid= it.next();
      driver.switchTo().window(childid);
      
      driver.findElement(By.xpath("//div[@class='wt-width-full']")).click();
     
      driver.findElement(By.xpath("//div[@class='wt-arrow-link wt-arrow-link--forward']")).click();
      
       
     
	}

	
}

