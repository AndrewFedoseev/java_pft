package com.stqa.pft.tests;

import com.stqa.pft.model.ContactData;
import com.stqa.pft.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactModificationTests extends TestBase {

  @Test(enabled = false)
  public void testContactModification(){
    app.goTo().groupPage();
    if(app.group().isThereAGroup()){
      app.group().create(new GroupData().withName("test1"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
