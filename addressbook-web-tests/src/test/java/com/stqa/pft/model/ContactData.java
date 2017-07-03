package com.stqa.pft.model;



import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "addressbook")
/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactData {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "secondname")
    private String secondname;

    @Transient
    private String group;

    @Column(name = "home")
    @Type(type = "text")
    private String homePhone;

    @Column(name = "mobile")
    @Type(type = "text")
    private String mobilePhone;

    @Column(name = "work")
    private String workPhone;

    @Transient
    private String allPhones;

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }

    @Column(name = "photo")
    @Type(type = "mediumtext")
    private String photo;


    public int getId() {
        return id;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }



    public File getPhoto() {
        return new File (photo);
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }

    public String getAllPhones() {
        return allPhones;
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }


    public String getHomePhone() {
        return homePhone;
    }

    public ContactData withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }


    public String getMobilePhone() {
        return mobilePhone;
    }

    public ContactData withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public ContactData withWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }


    public ContactData(String firstname, String secondname, String group) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.group = group;
    }

    public ContactData(){

    }


    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withLastname(String secondname) {
        this.secondname = secondname;
        return this;
    }

    public String getGroup() {
        return group;
    }


    public String withFirstname() {
        return firstname;
    }

    public String withLastname() {
        return secondname;
    }
}
