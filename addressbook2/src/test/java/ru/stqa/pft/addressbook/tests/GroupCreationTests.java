package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void groupCreationTests() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("name1", null, null));
  }


}
