package pageObject;

import base.Config;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;
import java.util.List;

public class link_pageObj extends Config {

    public link_pageObj(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    //Locator

//    @FindBy(how = How.XPATH, using = "//div[@id='footer']/div/div")
//    public WebElement aboutlinksectionLocator;


    // Functions
    public void verifyandcountlinks()  {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement Aboutbody = driver.findElement(By.xpath("//div[@id='footer']/div/div"));

        int alllinks = Aboutbody.findElements(By.cssSelector("a")).size();

        System.out.println(alllinks);

        for(int i =0; i<alllinks; i++){

            //Scroll down till the bottom of the page
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            WebElement Aboutbody1 = driver.findElement(By.xpath("//div[@id='footer']/div/div"));
            List<WebElement> alllinks1 = Aboutbody1.findElements(By.tagName("a"));
            String linkText = alllinks1.get(i).getText();
            System.out.println(linkText);
            js.executeScript("arguments[0].click()",alllinks1.get(i));

            if (driver.getTitle().contains("About Target Corporation")){
                Assert.assertTrue(driver.findElement(By.cssSelector("section.full-hero section.hero div.content-hero--container h1"))
                        .getText()
                        .contains("All About Target"));
                driver.findElement(By.linkText("locations")).click();
                driver.switchTo().defaultContent();
                driver.navigate().to("https://www.target.com");
            }else{
                driver.navigate().to("https://www.target.com");
            }


//            alllinks1.get(i).click();


        }


        }

        }



