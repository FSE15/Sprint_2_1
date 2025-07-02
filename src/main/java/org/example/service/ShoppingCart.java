package org.example.service;

import org.example.model.Discountable;
import org.example.model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total = total + item.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            double priceWithoutDiscount = item.getTotalPrice();
            double priceWithDiscount = priceWithoutDiscount * (1 - discount / 100.0);
            total = total + priceWithDiscount;
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total = total + item.getTotalPrice();
            }
        }
        return total;
    }
}
