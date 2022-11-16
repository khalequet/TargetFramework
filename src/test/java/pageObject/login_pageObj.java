package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login_pageObj extends Config {

    public login_pageObj (WebDriver driver){
        PageFactory.initElements(driver,this);
        Config.driver = driver;
    }


    // Locators

    @FindBy(how = How.XPATH, using = "//span[@class='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']")
    public WebElement signInLocatorfirst;

//    @FindBy(how = How.TAG_NAME, using = "Sign in")
//    public WebElement signInLocatorforactualsigninpage;

    @FindBy(how = How.XPATH, using = "//a[@data-test='accountNav-signIn']")
    public WebElement signInLocatorforactualsigninpage;

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement emailorphonelocator;

    @FindBy(how = How.XPATH, using = "//input[@autocomplete='current-password']")
    public WebElement passwordforSignInlocator;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement SignINforTargetLocator;


    @FindBy(how = How.XPATH, using = "//span[@class ='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']")
    public WebElement SinginconfirmationLocator;

    // Functions


    public void verifyTargetHomepageforloginpurpose(){
        String act = driver.getTitle();
        String exp = "Target : Expect More. Pay Less.";
        Assert.assertEquals(exp, act);
        System.out.println("I am in Target home page ");
    }

    public void iclickonsigninlinkfirst(){
        signInLocatorfirst.click();
    }

    public void navigatetosgninpage(){
        signInLocatorforactualsigninpage.click();

    }

    public void enteremailorphonenumber(){
        emailorphonelocator.sendKeys("tkhaleque1234@gmail.com");

    }

    public void enterinvalidemailorphonenumber(){
        emailorphonelocator.sendKeys("tkhaleque##@gmail.com");

    }
    public void enterpasswordforSignIn(){
       passwordforSignInlocator.sendKeys("Candy12!");

    }

    public void clickonSignINbutton(){
        SignINforTargetLocator.click();
    }

    public void verifyloginwassuccessfull(){
        String act = driver.getTitle();
        String exp = "Login: Target";
        Assert.assertEquals(exp, act);
        System.out.println("Login was Successful");
    }
    public void verifyloginwasNOTssuccessfull(){
        String act = driver.getTitle();
        String exp = "Login: Target";
        Assert.assertEquals(exp, act);
        System.out.println(" Unsuccessful LogIN ");
    }

}
