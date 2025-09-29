/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author grace
 */
public class Order {
    private int orderId;
    private Date orderDateTime;
    private String orderType; // Dine-in/Takeout/Pickup
    private String paymentMethod; // Cash/Card/Mobile
    private String orderStatus; // Pending/Preparing/Ready/Completed
    private Product product;
    private Customer customer;
    private int quantity;
    
    public Order(int orderId, Date orderDateTime, String orderType, String paymentMethod, 
                 String orderStatus, Product product, Customer customer, int quantity) {
        this.orderId = orderId;
        this.orderDateTime = orderDateTime;
        this.orderType = orderType;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Date orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
