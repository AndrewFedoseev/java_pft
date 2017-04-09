package com.stqa.pft.tests;

import org.testng.annotations.Test;

/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();


  }

}
