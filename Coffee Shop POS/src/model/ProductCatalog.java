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
    
    public ProductCatalog() {
        this.productList = new ArrayList<>();
    }
    
    public Product addProduct(int productId, String productName, String category, double price, int number, int preparationTime) {
        Product product = new Product(productId, productName, category, price, number, preparationTime);
        productList.add(product);
        return product;
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
