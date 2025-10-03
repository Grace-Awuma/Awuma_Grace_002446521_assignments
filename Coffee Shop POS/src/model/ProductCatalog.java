/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author grace
 */
public class ProductCatalog {
    
    private ArrayList<Product> productList;
    private int nextProductId;
    
    public ProductCatalog() {
        this.productList = new ArrayList<>();
        this.nextProductId = 101;
        
    }
    
    public Product addProduct(int productId, String productName, String category, double price, int number, int preparationTime) {
        if (productId == -1) {  
            productId = nextProductId++;  // Auto-generate and increment
        }
        Product product = new Product(productId, productName, category, price, number, preparationTime);
        productList.add(product);
        return product;
    }
    
     // ADD THIS - overloaded method without productId parameter
    public Product addProduct(String productName, String category, double price, int number, int preparationTime) {
        return addProduct(-1, productName, category, price, number, preparationTime);
    }
    
    public Product searchProduct(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    public void removeProduct(Product product) {
        productList.remove(product);
    }
    
}
