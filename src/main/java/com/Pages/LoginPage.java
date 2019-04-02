package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {



    @FindBy(how = How.CLASS_NAME,using = "dropdown")
    @CacheLookup
    WebElement my_account;

    @FindBy(how = How.LINK_TEXT,using = "Login")
    @CacheLookup
    WebElement login;

    @FindBy(how = How.NAME,using = "email")
    @CacheLookup
    WebElement email;

    @FindBy(how = How.NAME,using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.XPATH,using = "*//input[@type='submit']")
    @CacheLookup
    WebElement submit;

    @FindBy(how =How.LINK_TEXT,using = "Edit Account")
    WebElement verify;





    public void clickMyAccount(){

        my_account.click();

    }

    public void clickLogin(){
        login.click();

    }

    public void login(String eid, String pwd){
        email.sendKeys(eid);
        password.sendKeys(pwd);
        submit.click();
    }

    public String VerifyLoginSuccess(){

        return verify.getText();
    }


}
