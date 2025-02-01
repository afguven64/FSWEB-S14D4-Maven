package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;

    public Bread(String type, int price, String description) {
        super( type, price, description);
    }

    public Bread(String type, int price,  String description,
                     String color) {
        super(type, price, description);
        this.breadType = type;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + breadType + "Price : " + getPrice() + "Type : " + getType() +
                "Description : " + getDescription() );
    }


}
