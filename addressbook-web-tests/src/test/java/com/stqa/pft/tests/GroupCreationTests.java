package com.stqa.pft.tests;

import com.stqa.pft.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;



/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() +1);
  }
}

