package com.stqa.pft;

import org.testng.annotations.Test;

/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion(){
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();


  }

}
