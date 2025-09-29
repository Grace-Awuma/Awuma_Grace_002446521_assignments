/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grace
 */
public class Product {
    private int productId;
    private String productName;
    private String category; 
    private double price;
    private int number;
    private int preparationTime;
            
    public Product(int productId, String productName, String category, double price, int number, int preparationTime) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.number = number;
        this.preparationTime = preparationTime;
        
        
    }         

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
   @Override
    public String toString() {
        return productName + " (" + category + ") - $" + price;
    } 
}
