package com.stqa.pft.model;

/**
 * Created by Andrew on 4/17/2017.
 */
public class ContactData {
  private final String firstname;
  private final String secondname;
  private String group;


  public ContactData(String firstname, String secondname, String group) {
    this.firstname = firstname;
    this.secondname = secondname;
    this.group = group;
  }

  public String getFirstname(){
    return firstname;
  }
  public String getLastname(){
    return secondname;
  }

  public String getGroup() {
    return group;
  }
}
