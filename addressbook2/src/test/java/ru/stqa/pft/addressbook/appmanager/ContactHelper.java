package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactCreation() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getSurname());
    }

    public void initContactCreation() {
        click(By.cssSelector("form:nth-child(2) > input:nth-child(1)"));
    }


    public void submitContactModification() {
        click(By.name("update"));
    }

    public void initContactModification() {
        click(By.cssSelector(".center:nth-child(8) img"));
    }
}
