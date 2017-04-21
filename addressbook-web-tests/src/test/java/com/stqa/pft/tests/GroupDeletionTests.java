package com.stqa.pft.tests;

import com.stqa.pft.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion(){
    app.getNavigationHelper().goToGroupPage();
    if(app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();


  }

}
