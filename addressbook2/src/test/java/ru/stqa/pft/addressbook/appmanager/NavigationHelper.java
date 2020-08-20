package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void groupPage() {
       if (isElementPresent(By.tagName("h1"))
               && driver.findElement(By.tagName("h1")).getText().equals("Groups")
               && isElementPresent(By.name("new"))) {
            return;
       }
       click(By.xpath("//a[contains(@href, \'group.php\')]"));
    }

    public void goToContactCreation() {
        click(By.xpath("//a[contains(@href, \'edit.php\')]"));
    }


    public void goToHomePage() {
        if (isElementPresent(By.id("maintabel"))){
            return;
        }
        click(By.xpath("//a[contains(@href, \'./\')]"));
    }
}
