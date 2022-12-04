/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.dto;

/**
 *
 * @author deshp
 */
public class Student {
    private int rollNo;
    private String userName;
    private String password;
    private String name;
    private String gender;
    private String batchId;
    private String address;
    private String contact;

    public Student() {
    }

    public Student(int rollNo, String userName, String password, String name, String gender, String batchId, String address, String contact){
        this.rollNo=rollNo;
        this.userName=userName;
        this.password=password;
        this.name=name;
        this.gender=gender;
        this.batchId=batchId;
        this.address=address;
        this.contact=contact;
    }
    
    /**
     * @return the rollNo
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * @param rollNo the rollNo to set
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
}

