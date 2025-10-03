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
public class OrderDirectory {
    private ArrayList<Order> orderList;
    private ArrayList<Customer> customerList;
    private int nextOrderId; 
    
    public OrderDirectory() {
        this.orderList = new ArrayList<>();
        this.customerList = new ArrayList<>();
         this.nextOrderId = 2001;
    }
    
    public Customer addCustomer(int customerId, String firstName, String lastName, String contact) {
    if (customerId == -1) {
        customerId = 1000 + customerList.size() + 1; // Auto-generate
    }
    Customer customer = new Customer(customerId, firstName, lastName, contact);
    customerList.add(customer);
    return customer;
}
    
     public Order addOrder(int orderId, java.util.Date orderDateTime, String orderType, String paymentMethod, 
                         String orderStatus, Product product, Customer customer, int quantity) {
        if (orderId == -1) {  // ADD THIS CHECK
            orderId = nextOrderId++;  // Auto-generate and increment
        }
        Order order = new Order(orderId, orderDateTime, orderType, paymentMethod, orderStatus, product, customer, quantity);
        orderList.add(order);
        return order;
     }
    
    public Customer searchCustomerById(int customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }
    
    public ArrayList<Customer> searchCustomersByName(String name) {
        ArrayList<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getFirstName().equalsIgnoreCase(name) || customer.getLastName().equalsIgnoreCase(name)) {
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }
    
    public ArrayList<Order> getOrdersByCustomer(Customer customer) {
        ArrayList<Order> customerOrders = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getCustomer().getCustomerId() == customer.getCustomerId()) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public void removeCustomer(Customer customer) {
        customerList.remove(customer);
    }
    
    public void removeOrder(Order order) {
        orderList.remove(order);
    }
    public Customer addCustomer(String firstName, String lastName, String contact) {
    int customerId = 1000 + customerList.size() + 1; // Auto-generate starting from 1000
    return addCustomer(customerId, firstName, lastName, contact); // Call the existing method
}
}
