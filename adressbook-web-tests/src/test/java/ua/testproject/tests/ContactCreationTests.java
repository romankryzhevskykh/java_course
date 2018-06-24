package ua.testproject.tests;

import org.testng.annotations.Test;
import ua.testproject.model.ContactData;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().createContact(new ContactData("test_name","test_surname", "test1"), true);
    }
}
