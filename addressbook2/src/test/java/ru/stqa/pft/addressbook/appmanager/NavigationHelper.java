package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
       click(By.xpath("//a[contains(@href, \'group.php\')]"));
    }

    public void goToContactCreation() {
        click(By.xpath("//a[contains(@href, \'edit.php\')]"));
    }


    public void goToHomePage() {
        click(By.xpath("//a[contains(@href, \'./\')]"));
    }
}
