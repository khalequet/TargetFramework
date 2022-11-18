package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.link_pageObj;

public class link_stepDef extends Config {

link_pageObj lPage = new link_pageObj(driver);



    @And("count and verify service section links to ensure it navigates you to particular page")
    public void countAndVerifyServiceSectionLinksToEnsureItNavigatesYouToParticularPage()  {
        lPage.verifyandcountlinks();
    }
}
