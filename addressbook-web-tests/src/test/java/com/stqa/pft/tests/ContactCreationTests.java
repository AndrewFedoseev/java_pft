package com.stqa.pft.tests;

import com.stqa.pft.model.ContactData;
import com.stqa.pft.model.Groups;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactCreationTests extends TestBase {

    @Test()
    public void testContactCreation() {
        Groups groups = app.db().groups();
        File photo = new File("src/test/resources/download.png");
        ContactData newContact = new ContactData().withFirstname("test_name").withLastname("test_surname").withPhoto(photo)
                .inGroup(groups.iterator().next());
        app.goTo().gotoHomePage();
        app.contact().initContactCreation();
        app.contact().fillContactForm(newContact, true);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();
    }
/*
    @Test
    public void testCurrentDir() {
        File currentDir = new File(".");
        System.out.println(currentDir.getAbsolutePath());
        File photo = new File("src/test/resources/download.png");
        System.out.println(photo.getAbsolutePath());
        System.out.println(photo.exists());

    }*/
}
