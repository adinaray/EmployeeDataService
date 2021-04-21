package com.springboot.app.model;

public class PersonRequest {

  private String lastName;

  private String firstname;

  private String birthDate;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public PersonRequest(String lastName, String firstname, String birthDate) {
    super();
    this.lastName = lastName;
    this.firstname = firstname;
    this.birthDate = birthDate;
  }

  public PersonRequest() {
    super();
  }

}
