package com.stqa.pft.tests;

import com.stqa.pft.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper.initContactCreation();
    app.getContactHelper.fillContactForm(new ContactData("test_name", "test_surname", "test1"), true);
    app.getContactHelper.submitContactCreation();
    app.getContactHelper.returnToHomePage();
  }
}
