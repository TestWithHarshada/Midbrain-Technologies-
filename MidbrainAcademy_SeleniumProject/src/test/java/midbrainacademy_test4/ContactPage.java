// Contact Form Testing

//Enter valid data → send email → success message
//Enter invalid data → validation error



package midbrainacademy_test4;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class ContactPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "name")
    WebElement nameField;

    @FindBy(name = "phone")
    WebElement phoneField;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(name = "message")
    WebElement messageField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement sendBtn;

    @FindBy(id = "success-msg")
    WebElement successMessage;

    @FindBy(id = "error-msg")
    WebElement errorMessage;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Fill Contact form
    public void fillContactForm(String name, String phone, String email, String message) {
        nameField.clear();
        phoneField.clear();
        emailField.clear();
        messageField.clear();

        nameField.sendKeys(name);
        phoneField.sendKeys(phone);
        emailField.sendKeys(email);
        messageField.sendKeys(message);
    }

    // Click button (with wait)
    public void clickSendButton() {

        wait.until(ExpectedConditions.visibilityOf(sendBtn));

        try {
            sendBtn.click();
        } catch (Exception e1) {

            try {
                sendBtn.sendKeys(Keys.ENTER);
            } catch (Exception e2) {

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].click();", sendBtn);
            }
        }
    }
    
    // Success message OR redirect the page
    public String getSuccessText() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(successMessage)).getText();
        } catch (Exception e) {
            return "Redirected / No success message";
        }
    }

    // Error message
    public String getErrorText() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(errorMessage)).getText();
        } catch (Exception e) {
            return "No error message";
        }
    }

    // Check redirect
    public boolean isRedirected() {
        return driver.getCurrentUrl().contains("contact");
    }
}