package com.stqa.pft;

import org.testng.annotations.Test;


/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();


  }

}

