package com.stqa.pft.tests;

import com.stqa.pft.model.ContactData;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactCreationTests extends TestBase {

    @Test()
    public void testContactCreation() {
        app.goTo().gotoHomePage();
        app.contact().initContactCreation();
        File photo = new File("src/test/resources/download.png");
        app.contact().fillContactForm(
                new ContactData().withFirstname("test_name").withLastname("test_surname").withPhoto(photo), true);
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
