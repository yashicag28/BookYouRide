package com.java;

public abstract class Person {

    private String userName;
    private String contactNumber;

public Person(String firstName,String contactNumber){
    this.userName= firstName;
    this.contactNumber= contactNumber;
}

    public String getUserNam(){
     return userName;
    }

    public String getContactNumber(){
        return contactNumber;
    }

}
