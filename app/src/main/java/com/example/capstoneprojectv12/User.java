package com.example.capstoneprojectv12;

public class User
{
    private String fullname;
    private String phonenum;
    private String email;
    private String password;
    private String confirmpassword;
    private String address;
    private String zipcode;

    public User(){}
    public User(String fullname, String phonenum, String email, String password, String confirmpassword, String address, String zipcode) {
        this.fullname = fullname;
        this.phonenum = phonenum;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.address = address;
        this.zipcode = zipcode;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
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

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
