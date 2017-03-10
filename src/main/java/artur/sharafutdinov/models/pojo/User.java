package artur.sharafutdinov.models.pojo;


import org.springframework.stereotype.Component;

import java.sql.Date;

public class User {

  private long id;
  private String login;
  private String password;
  private String lastName;
  private String firstName;
  private long roleId;
  private String email;
  private String phone;
  private String isActive;
  private Date updatedDate;


  public User(long id, String login,
              String password, String lastName,
              String firstName, long roleId,
              String email, String phone,
              String isActive, Date updatedDate) {
    this.id = id;
    this.login = login;
    this.password = password;
    this.lastName = lastName;
    this.firstName = firstName;
    this.roleId = roleId;
    this.email = email;
    this.phone = phone;
    this.isActive = isActive;
    this.updatedDate = updatedDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }




  public java.sql.Date getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(java.sql.Date updatedDate) {
    this.updatedDate = updatedDate;
  }





  public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

}
