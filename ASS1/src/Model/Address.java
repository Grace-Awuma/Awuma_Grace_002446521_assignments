/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author grace
 */
public class Address {
    String personName;
    String country;
    String state;
    String city;
    Address street;
    Address zipCode;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address getStreet() {
        return street;
    }

    public void setStreet(Address street) {
        this.street = street;
    }

    public Address getZipCode() {
        return zipCode;
    }

    public void setZipCode(Address zipCode) {
        this.zipCode = zipCode;
    }  
}
