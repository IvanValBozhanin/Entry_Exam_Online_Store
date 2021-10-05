package com.company;

public class Product {
    private double price;
    private String name, brand;
    private Gender gender;

    public Product() {
    }

    public Product(double price, String name, String brand, Gender gender) {
        if(price <= 0){
            throw new IllegalArgumentException("Price must be a positive number");
        }
        if(name.length() <= 2){
            throw new IllegalArgumentException("Name must be more than 2 characters long");
        }
        if(brand.length() <= 2){
            throw new IllegalArgumentException("Name must be more than 2 characters long");
        }
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", gender=" + gender +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Price must be a positive number");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() <= 2){
            throw new IllegalArgumentException("Name must be more than 2 characters long");
        }
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.length() <= 2){
            throw new IllegalArgumentException("Name must be more than 2 characters long");
        }
        this.brand = brand;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
