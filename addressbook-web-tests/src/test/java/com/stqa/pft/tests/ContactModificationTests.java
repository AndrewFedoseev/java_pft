package com.stqa.pft.tests;

import com.stqa.pft.model.ContactData;
import com.stqa.pft.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().goToGroupPage();
    if(app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
