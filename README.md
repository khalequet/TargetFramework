# CBDD_ONLINE_ONISTE_22
CucumberBDD FW with Selenium WD, Maven, Jenkins ect

# How to run

mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@test"
# How to run test in default env and browser 
mvn verify -Dcucumber.filter.tags="@smoke"
mvn verify -Dcucumber.filter.tags="@link"

# How to run all test by using default env and browser
mvn verify














Links page code:

WebElement Aboutbody = driver.findElement(By.xpath("//div[@id='footer']/div/div"));

        List<WebElement> alllinks = Aboutbody.findElements(By.cssSelector("a"));

        System.out.println(alllinks.size());

        for(int i =0; i<=alllinks.size(); i++) {


            WebElement Aboutbody1 = driver.findElement(By.xpath("//div[@id='footer']/div/div"));
            List<WebElement> alllinks1 = Aboutbody1.findElements(By.tagName("a"));

            String linkText = alllinks1.get(i).getText();
            System.out.println(linkText);
            Thread.sleep(300);
            alllinks1.get(i).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement clickADD = driver.findElement(By.xpath("//div[@id='footer']/div/div"));
            js.executeScript("arguments[0].scrollIntoView()",clickADD);
           Thread.sleep(3000);
            alllinks1.get(i).click();
            driver.navigate().back();


        }