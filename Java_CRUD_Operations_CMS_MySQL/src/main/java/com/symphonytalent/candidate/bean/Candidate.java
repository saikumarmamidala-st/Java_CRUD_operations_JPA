package com.symphonytalent.candidate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Candidate {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer candidateId;
	@Column(name = "email")
  private String email;
	@Column(name = "firstName")
  private String firstName;
	@Column(name = "lastName")
  private String lastName;
	@Column(name = "phone")
  private String phone;



  //default constructor
  public Candidate() {

  }

  public Candidate(Integer candidateId, String email, String firstName, String lastName,
      String phone) {
    this.candidateId = candidateId;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  }

  public Integer getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(Integer candidateId) {
    this.candidateId = candidateId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  
  }

