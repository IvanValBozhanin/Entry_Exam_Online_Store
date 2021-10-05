package com.company;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(){
        products.remove(0);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Category{" +
                "name='" + name + "'\n");
        for (Product product :
                products) {
            s.append('\t');
            s.append(product.toString());
            s.append('\n');
        }
        return s.toString() + '}';
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
