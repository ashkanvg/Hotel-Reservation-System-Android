package com.example.hotel;

import com.orm.SugarRecord;


//دیتابیس کاربری
public class Users extends SugarRecord {
    String firstName;
    String surName;
    String userName;
    String mobilePhone;
    String homePhone;
    String addressHome;
    String bithCertification;
    String email;
    String password;

    public Users() {
    }
    public Users(String firstName, String surName, String userName, String mobilePhone, String homePhone, String addressHome, String bithCertification , String email, String password) {
        this.firstName = firstName;
        this.surName = surName;
        this.userName = userName;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
        this.addressHome = addressHome;
        this.bithCertification = bithCertification;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAddressHome() {
        return addressHome;
    }
    public void setAddressHome(String addressHome) {
        this.addressHome = addressHome;
    }

    public String getBithCertification() {
        return bithCertification;
    }
    public void setBithCertification(String bithCertification) {
        this.bithCertification = bithCertification;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
