// Training Page Testing

// Open any training page
// Verify training details (title, description, buttons)


package midbrainacademy_test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Scenario3 {
    WebDriver driver;
    TrainingPage trainingPage; 

    @BeforeMethod
    public void setup() {
        //Browser setup
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open the browser
        driver.get("https://midbrainsacademy.in/");
        
        // Creating the object for TrainingPage
        trainingPage = new TrainingPage(driver);
    }
    
    
    
 // Verify training details (title, description, buttons)

    @Test
    public void verifySoftwareTestingLink() {
        // 1. Open the training page
        trainingPage.openSoftwareTestingPage();

        //2. Check the right page is open or not (Validation)
        String expectedUrlPart = "software-testing";
        String actualUrl = driver.getCurrentUrl();
        
        Assert.assertTrue(actualUrl.contains(expectedUrlPart), "Error: Software Testing page not found!");
    }

    @AfterMethod
    public void tearDown() {
        //Browser is closed after the test is completed
        if (driver != null) {
           // driver.quit();
        }
    }
}