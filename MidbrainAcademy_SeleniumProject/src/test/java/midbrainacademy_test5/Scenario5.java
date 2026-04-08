//Button Click Flow

//Click “send Email”
//Verify redirection or form opening

//(EmptyFormValidation, InvalidEmailValidation and valid Form)



package midbrainacademy_test5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*; 


public class Scenario5 {

    WebDriver driver;
    ButtonClick buttonClick;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://midbrainsacademy.in/contact.html");
        driver.manage().window().maximize();

        buttonClick = new  ButtonClick(driver);
    }

    //TEST 1: All fields empty
    @Test(priority = 1)
    public void testEmptyFormValidation() {

    	buttonClick.fillContactForm("", "", "", "");
    	buttonClick.clickSendButton();

        String error = buttonClick.getErrorText();

        Assert.assertTrue(error.length() > 0, "Error not shown for empty form");
    }

    //TEST 2: Invalid Email
    @Test(priority = 2)
    public void testInvalidEmailValidation() {

    	buttonClick.fillContactForm(
                "Harshada",
                "8888160236",
                "wrongEmail",   //Invalid Email
                "I want to join Software Testing course"
        );

    	buttonClick.clickSendButton();

        String error = buttonClick.getErrorText();

        Assert.assertTrue(error.length() > 0, "Error not shown for invalid email");
    }

    //TEST 3: valid Form
    @Test(priority = 3)
    public void testInvalidPhoneValidation() {

    	buttonClick.fillContactForm(
                "Harshada",
                "8888160236",           
                "harshadapadher25@gmail.com",
                "I want to join Software Testing course"   //valid Form
        );

    	buttonClick.clickSendButton();

        String error = buttonClick.getErrorText();

        Assert.assertTrue(error.length() > 0, "Error not shown for invalid phone");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}