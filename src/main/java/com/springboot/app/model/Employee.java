package com.springboot.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table()
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer employeeId;

  @OneToOne
  @JoinColumn(name = "personId")
  private Person personId;

  @Column
  private String employeeNum;

  @Column
  private String employedDate;

  @Column
  private String terminatedDate;


  public Employee(Integer employeeId, Person personId, String employeeNum, String employedDate,
      String terminatedDate) {
    super();
    this.employeeId = employeeId;
    this.personId = personId;
    this.employeeNum = employeeNum;
    this.employedDate = employedDate;
    this.terminatedDate = terminatedDate;
  }

  public Employee() {
    super();
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public Person getPersonId() {
    return personId;
  }

  public void setPersonId(Person personId) {
    this.personId = personId;
  }

  public String getEmployeeNum() {
    return employeeNum;
  }

  public void setEmployeeNum(String employeeNum) {
    this.employeeNum = employeeNum;
  }

  public String getEmployedDate() {
    return employedDate;
  }

  public void setEmployedDate(String employedDate) {
    this.employedDate = employedDate;
  }

  public String getTerminatedDate() {
    return terminatedDate;
  }

  public void setTerminatedDate(String terminatedDate) {
    this.terminatedDate = terminatedDate;
  }
}
