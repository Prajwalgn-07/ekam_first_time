package ekam.example.web;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import com.testvagrant.ekam.testBases.testng.WebTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import ekam.example.web.Pages.ContactUsPage;
import ekam.example.web.Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Properties;

import static org.testng.Assert.*;

public class ContactUsTest extends WebTest {
    @Inject private DataSetsClient dataSetsClient;

    @Test(groups ="ContactUsPageValidation")
    public void selectHeading() {
        System.out.println(dataSetsClient.getValue("test", String.class));
//        Page(HomePage.class).getContactUsPage();
//
//        Page(ContactUsPage.class).selectHeading();
//        Page(ContactUsPage.class).setEmailId(dataSetsClient.getValue("EmailId", String.class));
//        Page(ContactUsPage.class).setMessage(dataSetsClient.getValue("Message", String.class));
    }
}