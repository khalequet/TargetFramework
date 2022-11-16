package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class link_pageObj extends Config {

    public link_pageObj(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    //Locator
//
//    @FindBy(how = How.XPATH, using = "//div[@id='footer']/div/div")
//    public WebElement aboutlinksectionLocator;


    // Functions
    public void verifyandcountlinks() throws InterruptedException {

//        WebElement Aboutbody = driver.findElement(By.xpath("//div[@id='footer']/div/div"));
//
//        // need assistance with scroll bar
//
//        int alllinks = Aboutbody.findElements(By.cssSelector("a")).size();
//
//        System.out.println(alllinks);
//
//        for(int i =0; i<=alllinks; i++){
//            WebElement Aboutbody1 = driver.findElement(By.xpath("//div[@id='footer']/div/div"));
//            List<WebElement> alllinks1 = Aboutbody1.findElements(By.tagName("a"));
//
//            String linkText = alllinks1.get(i).getText();
//            System.out.println(linkText);
//
//            alllinks1.get(i).click();
//            driver.navigate().back();



        WebElement Aboutbody = driver.findElement(By.xpath("//div[@id='footer']/div/div"));

        List<WebElement> alllinks = Aboutbody.findElements(By.cssSelector("a"));

        System.out.println(alllinks.size());

        for(int i =0; i<=alllinks.size(); i++) {


            WebElement Aboutbody1 = driver.findElement(By.xpath("//div[@id='footer']/div/div"));
            List<WebElement> alllinks1 = Aboutbody1.findElements(By.tagName("a"));

            String linkText = alllinks1.get(i).getText();
            System.out.println(linkText);

            alllinks1.get(i).click();
            driver.navigate().back();


        }


        }

        }



