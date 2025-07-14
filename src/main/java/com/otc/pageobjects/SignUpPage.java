package com.otc.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;

    // Constructor
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    // WebElements
    @FindBy(class = "btn-signup-home")
    WebElement signupbutton;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "signupButton")
    WebElement signupButton;

    // Page actions
    public void enterFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void enterEmail(String mail) {
        email.sendKeys(mail);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void enterConfirmPassword(String cpass) {
        confirmPassword.sendKeys(cpass);
    }

    public void clickSignUp() {
        signupButton.click();
    }

    public void signUp(String fName, String lName, String mail, String pass, String cpass) {
        enterFirstName(fName);
        enterLastName(lName);
        enterEmail(mail);
        enterPassword(pass);
        enterConfirmPassword(cpass);
        clickSignUp();
    }
}
	
	
	