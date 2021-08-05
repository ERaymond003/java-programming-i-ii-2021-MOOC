/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric R Smith
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String prodName, double prodPrice, int prodQuantity) {
        this.name = prodName;
        this.price = prodPrice;
        this.quantity = prodQuantity;
    }
    
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
