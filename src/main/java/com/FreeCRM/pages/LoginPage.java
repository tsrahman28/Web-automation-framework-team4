package com.FreeCRM.pages;
import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passField;

    @FindBy(xpath = "//*[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Something went wrong...')]")
    WebElement errorMessage;

    //reusable methods
    public void typeEmailAddress(String emailAddress){
        type(emailField, emailAddress);
        LOG.info("type email address success");
    }

    public void typePassword(String password){
        type(passField, password);
        LOG.info("type email address success");
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
        LOG.info("click login button success");
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
