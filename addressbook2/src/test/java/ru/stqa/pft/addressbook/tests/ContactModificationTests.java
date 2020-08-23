package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.goTo().goToHomePage();
        app.contact().initContactModification();
        app.contact().fillContactForm(
                new ContactData().withFirstname("test_name").withFirstname("test_surname"), false);
        app.contact().submitContactModification();
    }

}
