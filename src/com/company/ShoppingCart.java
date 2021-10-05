package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public ShoppingCart() {
    }

    public ShoppingCart(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(){
        products.remove(0);
    }

    public boolean containsProduct(Product product){
        for (Product p:
                products) {
            if(p.getBrand().equals(product.getBrand())){
                if(p.getGender() == product.getGender()){
                    if(p.getName().equals(product.getName())){
                        if(p.getPrice() == product.getPrice()){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public double totalPrice(){
        double s = 0.0;
        for (Product p :
                products) {
            s += p.getPrice();
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
