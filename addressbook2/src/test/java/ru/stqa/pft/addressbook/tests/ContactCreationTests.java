package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTests() {
        app.goTo().goToContactCreation();
        app.contact().initContactCreation();
        app.contact().fillContactForm(
                new ContactData().withFirstname("test_name").withLastname("test_surname"), true);
        app.contact().submitContactCreation();


    }

}
