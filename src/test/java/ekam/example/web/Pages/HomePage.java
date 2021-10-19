package ekam.example.web.Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

public class HomePage extends WebPage {
    private By ContactUs = query("//div[@id='contact-link']//a");

    @WebStep(keyword = "When", description = "I press contactUs it should go to contact us page")
    public HomePage getContactUsPage() {
        element(ContactUs).click();
        return this;
    }

}
