package ru.stqa.pft.addressbook.tests;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class ContactTest extends TestBase{

  @Test
  public void contactTest(){
    goToContactCreation();
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("quickadd")).click();
    driver.findElement(By.name("address")).sendKeys("info_1");
    driver.findElement(By.cssSelector("input:nth-child(8)")).click();
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("surname");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys("adr");
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys("comp");
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    driver.findElement(By.xpath("//a[contains(@href, \'./\')]")).click();
  }

  private void goToContactCreation() {
    driver.findElement(By.xpath("//a[contains(@href, \'edit.php\')]")).click();
  }
}
