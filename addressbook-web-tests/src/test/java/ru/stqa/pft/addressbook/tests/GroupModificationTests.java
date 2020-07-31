package ru.stqa.pft.addressbook.tests;
import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{
    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("1111", "2222", "3333"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
