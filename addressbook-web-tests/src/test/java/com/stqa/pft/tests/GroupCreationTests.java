package com.stqa.pft.tests;

import com.stqa.pft.model.GroupData;
import org.testng.annotations.Test;


/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();


  }

}

