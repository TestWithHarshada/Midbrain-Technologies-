// Navigation testing 
package midbrainacademy_test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
 {
	 // TODO Auto-generated method stub
		
	 WebDriver driver = new ChromeDriver();
     
     //1. Open the website
     driver.get("https://midbrainsacademy.in/");
     Thread.sleep(2000);
	
	
     //1. Click all menu items
     //2. Verify correct page redirection 
  
	String[] menuNames = {"HOME", "ABOUT", "TRAINING", "PLACEMENTS", "INTERNSHIP", "GALLERY", "CAREER", "CONTACT"};

	for (String name : menuNames) {
	      
	        driver.findElement(By.linkText(name)).click();
	        Thread.sleep(2000); 
	        
	        System.out.println(name + " Page Title: " + driver.getTitle());
	    } 
	       
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.quit();
	    }
	
	    }
 }
	



	     


