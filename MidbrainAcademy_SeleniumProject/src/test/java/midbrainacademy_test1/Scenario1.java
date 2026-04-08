//Homepage validation

package midbrainacademy_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
 {
		// TODO Auto-generated method stub
		
	        // 1. new selenium version doesn't need to path
	        WebDriver driver = new ChromeDriver();
	        
	            // 2. Open the website
	            driver.get("https://midbrainsacademy.in/");
	            Thread.sleep(2000);
	            
	            //Validate Title and Url
	            //3. If you need to Title print
	            System.out.println("Page Title is: " + driver.getTitle());
	            System.out.println("Page URL: " + driver.getCurrentUrl());
	            
	            //4. logo visibility
	            Boolean isSectionVisible = driver.findElement(By.tagName("img")).isDisplayed();
	            if (isSectionVisible)
	            {
	            	System.out.println("Main Section Visibility: PASSED (logo is visible)");
	            }
	            else
	            {
	            	System.out.println("Main Section Visibility: FAILED");
	            }
	            }
	            
	           // 4. wait for the 15 sec
	           Thread.sleep(1500);
	}
}



