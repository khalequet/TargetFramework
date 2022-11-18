package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class createaccount_pageObj extends Config {

    public createaccount_pageObj(WebDriver driver){
        PageFactory.initElements(driver,this);
        Config.driver = driver;
    }


    // Locators

    @FindBy(how = How.XPATH, using = "//span[@class='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']")
    public WebElement signInLocator;

    @FindBy(how = How.XPATH, using = "//a[@data-test='accountNav-createAccount']")
    public WebElement createAccountLocator;

    @FindBy (how = How.NAME, using = "usernamecreateaccount")
    public WebElement emailAddressLocator;

    @FindBy (how = How.NAME, using = "firstnamecreateaccount")
    public WebElement firstNameLocator;

    @FindBy (how = How.NAME, using = "lastnamecreateaccount")
    public WebElement lastNameLocator;

    @FindBy (how = How.NAME, using = "phonecreateAccount")
    public WebElement phoneNumberLocator;

    @FindBy (how = How.NAME, using = "passwordcreateaccount")
    public WebElement createPasswordLocator;

    @FindBy (how = How.XPATH, using = "//button[@class='BaseButton-sc-j0jbcc-0 ButtonPrimary-sc-1qgspc1-0 styles__ButtonWithMargin-sc-1ltb4ye-4 iISjbi fphwbC lbdwpj']")
    public WebElement createAccounttosignupLocator;

    @FindBy(how =How.XPATH, using = "//div[@data-test='authAlertDisplay']/div")
    public WebElement SignINUnsecussfulmessageLocator;


    // Functions

    public void verifyHomePageTitle(){
        String act = driver.getTitle();
        String exp = "Target : Expect More. Pay Less.";
        Assert.assertEquals(exp, act);
        System.out.println("I am in Target home page ");
    }

    public void clickSignIn(){
        signInLocator.click();
    }

    public void clickcreateaccount(){
        createAccountLocator.click();
    }

    public void enteremailAddress(String email){
        emailAddressLocator.sendKeys(email);
    }

    public void enterfirstname(String firstname){
        firstNameLocator.sendKeys(firstname);
    }

    public void enterlastname(String lastname){
        lastNameLocator.sendKeys(lastname);
    }

    public void enterphonenumber(String phonenumber){
        phoneNumberLocator.sendKeys(phonenumber);
    }
    public void enterpassword(String password){
        createPasswordLocator.sendKeys(password);
    }




    /// Hardcode
//    public void enteremailAddress(){
//        emailAddressLocator.sendKeys("tkhaleque1234@gmail.com");
//    }
//
//    public void enterfirstname(){
//        firstNameLocator.sendKeys("Tuma");
//    }
//
//    public void enterlastname(){
//        lastNameLocator.sendKeys("Ahmed");
//    }
//
//    public void enterphonenumber(){
//        phoneNumberLocator.sendKeys("9293309592");
//    }
//    public void enterpassword(){
//        createPasswordLocator.sendKeys("Candy12!");
//    }
//
//
    public void clickaccountbuttontosignup(){
        createAccounttosignupLocator.click();
    }



    public void verifycreatenewaccountSucessfull() {
        String act = driver.getTitle();
        String exp = "Login: Target";
        Assert.assertEquals(exp, act);
        System.out.println(" Successful SignUp");
    }
    public void UnSucessfull() {
        String act = SignINUnsecussfulmessageLocator.getText();
        String exp = "Sorry, something went wrong. Please try again";
        System.out.println(" UNSuccessful SignUp");
        Assert.assertEquals(exp, act);

    }




}
