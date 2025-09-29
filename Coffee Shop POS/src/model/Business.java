/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author grace
 */
public class Business {
private ProductCatalog productCatalog;
    private OrderDirectory orderDirectory;
    private String name;
    
    public Business(String name) {
        this.name = name;
        this.productCatalog = new ProductCatalog();
        this.orderDirectory = new OrderDirectory();
    }

    
    public ProductCatalog getProductCatalog() {
        return productCatalog;
        // TODO code application logic here
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {    
        this.name = name;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
