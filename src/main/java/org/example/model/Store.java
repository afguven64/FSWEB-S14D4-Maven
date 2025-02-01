package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale product1 = new Chocolate("milka", 35, "chocolate", "black");
        ProductForSale product2 = new Coke("Pepsi", 20, "drink", "white");
        ProductForSale product3 = new Bread("Fırın", 10, "bread", "white");

        ProductForSale [] products = {product1, product2, product3};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}