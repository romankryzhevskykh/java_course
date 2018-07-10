package ua.testproject.tests;

import org.testng.annotations.Test;
import ua.testproject.model.ContactData;

public class ContactModificationTests extends TestBase {
    @Test(enabled = false)
    public void testContactModification() {
        app.goTo().gotoHomePage();
        if (! app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("test1", "test2", "test1"), true);
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test_name","test_surname", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
