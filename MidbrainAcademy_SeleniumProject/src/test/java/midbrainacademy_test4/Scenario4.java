// Contact Form Testing

//Enter valid data → send email → success message
//Enter invalid data → validation error


package midbrainacademy_test4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Scenario4 {

    WebDriver driver;
    ContactPage contactPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://midbrainsacademy.in/contact.html");
        driver.manage().window().maximize();

        contactPage = new ContactPage(driver);
    }

    // Valid Data
    @Test(priority = 1)
    public void testValidForm() {

        contactPage.fillContactForm("Harshada", "8888160236", "harshadapadher25@gmail.com", "Valid data");
        contactPage.clickSendButton();

        boolean result = contactPage.isRedirected();

        Assert.assertTrue(result, "Valid form failed to submit");
    }

    // Invalid Data
    @Test(priority = 2)
    public void testInvalidForm() {

        contactPage.fillContactForm(" xyz", "88sgd13546", "pqr@gmail.com", "abcdefgh");
        contactPage.clickSendButton();

        String error = contactPage.getErrorText();

        Assert.assertTrue(error.length() > 0, "Error message not displayed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}