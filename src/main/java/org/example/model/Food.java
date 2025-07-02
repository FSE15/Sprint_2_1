package org.example.model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalPrice() {
        return amount * price;
    }
}

