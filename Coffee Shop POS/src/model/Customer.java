/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grace
 */
public class Customer {
    
    private int customerId;
    private String firstName;
    private String lastName;
    private String contact;
    
    public Customer(int customerId, String firstName, String lastName, String contact) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + customerId + ")";
    }
}
