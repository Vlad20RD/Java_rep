package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE
import org.junit.Test;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupDeletionTests extends TestBase{

  @Test
  public void groupDeletionTests() {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("group1", null, null));
    }
    app.getGroupHelper().selectGroup(before - 1);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before - 1);
  }

}
