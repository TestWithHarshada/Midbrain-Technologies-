//Training page 

// Open any training page
// Verify training details (title, description, buttons)

package midbrainacademy_test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrainingPage {
    WebDriver driver;

    // Constructor: driver accepted here from Scenario3 
    public TrainingPage(WebDriver driver) {
        this.driver = driver;
    }

    // open the page link method
    public void openSoftwareTestingPage() {
    	try {
    		//Load the page for 3 Sec
    		Thread.sleep(10000);
    	
        //1. click on Training menu
    		
    				org.openqa.selenium.WebElement trainingMenu = driver.findElement(By.xpath("//a[contains(text(),'Training')]"));
    				((org.openqa.selenium.JavascriptExecutor)driver).executeScript("arguments[0].click();", trainingMenu);		
    				
    	//driver.findElement(By.linkText("Training")).click();
        Thread.sleep(10000);
        
        
        // 2. Click on Software Testing
        driver.findElement(By.linkText("Software Testing")).click();
        Thread.sleep(10000);
        
        WebElement stCard = driver.findElement(By.xpath("//h3[text()='Software Testing']"));
        stCard.click();
        
    } catch (Exception e) {
    	System.out.println("Element is no find:" + e.getMessage());
    }
    }
}

