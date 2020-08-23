package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test
    public void contactModificationTests() {
        app.goTo().goToHomePage();
        app.contact().initContactModification();
        app.contact().fillContactForm(new ContactData("Vlad", "Vlasov", null), false);
        app.contact().submitContactModification();
    }

}
