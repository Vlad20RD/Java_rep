package ru.stqa.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;

    @Before
    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "C:/Users/Vlad20/Desktop/chrome_driver/chromedriver.exe");

      driver = new ChromeDriver();
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();

      driver.get("http://addressbook/");
      driver.manage().window().setSize(new Dimension(1055, 824));
      login("user", "admin", "pass", "secret", By.cssSelector("input:nth-child(7)"));
    }

    private void login(String user, String admin, String pass, String secret, By by) {
      driver.findElement(By.name(user)).click();
      driver.findElement(By.name(user)).sendKeys(admin);
      driver.findElement(By.name(pass)).click();
      driver.findElement(By.name(pass)).sendKeys(secret);
      driver.findElement(by).click();
    }

    protected void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
      driver.findElement(By.name("new")).click();
    }

    protected void goToGroupPage() {
      driver.findElement(By.xpath("//a[contains(@href, \'group.php\')]")).click();
    }

    @After
    public void tearDown() {
      driver.quit();
    }

    protected void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    protected void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
