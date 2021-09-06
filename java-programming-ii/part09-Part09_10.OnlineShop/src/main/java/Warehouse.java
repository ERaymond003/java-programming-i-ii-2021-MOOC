/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author Eric R Smith
 */
public class Warehouse {
    private Map<String, Integer> productPriceList;
    private Map<String, Integer> productStockList;
    
    public Warehouse() {
        this.productPriceList = new HashMap<>();
        this.productStockList = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPriceList.put(product, price);
        this.productStockList.put(product, stock);
    }
    
    public int price(String product) {
        if (this.productPriceList.keySet().contains(product)) {
            return this.productPriceList.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product) {
        if (this.productStockList.keySet().contains(product)) {
            return this.productStockList.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        if (this.productStockList.keySet().contains(product)) {
            if (this.productStockList.get(product) > 0) {
                this.productStockList.put(product, this.productStockList.get(product) - 1);
            return true;
            } 
           
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> allProducts = new HashSet<String>();
        
        for (String product : this.productStockList.keySet()) {
            allProducts.add(product);           
        }
        
        return allProducts;
    }
}
