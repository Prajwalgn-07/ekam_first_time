package ekam.example.web.Pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends WebPage {
    private By subjectHeading = query("//*[@class=\"selector\"]//select");
    private By emailAddress = query("//*[@id=\"email\"]");
    private By message = query("//*[@class=\"form-group\"]//textarea");

    @WebStep(keyword = "When", description = "I choose subject heading")
    public ContactUsPage selectHeading() {
        Select select=new Select(driver.findElement(subjectHeading));
        select.selectByIndex(1);
        return this;
    }

    @WebStep(keyword = "When", description = "I set email id")
    public ContactUsPage setEmailId(String emailId) {
        textbox(emailAddress).setText(emailId);
        return this;
    }

    @WebStep(keyword = "When", description = "I send the description of the message")
    public ContactUsPage setMessage(String messageDescription) {
        textbox(message).setText(messageDescription);
        return this;
    }
}