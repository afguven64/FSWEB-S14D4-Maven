package org.example.model;

public class Coke extends ProductForSale{
    private String bottleColor;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type,int price, String description,
                String bottleColor) {
        super( type, price, description);
        this.bottleColor = bottleColor;
    }

    @Override
    public void showDetails() {
        System.out.println("Bottle Color: " + bottleColor + "Price : " + getPrice() + "Type : " + getType() +
                "Description : " + getDescription() );
    }
}
