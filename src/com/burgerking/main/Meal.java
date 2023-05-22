package com.burgerking.main;
import com.burgerking.burger.*;
public class Meal {
    private Burger burger;
    private double totalPrice;

    public Meal(Burger burger) {
        this.burger = burger;
        this.totalPrice = calcTotalPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return String.format("Your order:\n%s,\nTotal price: %.2f$", burger.getName(), totalPrice);
    }


    private double calcTotalPrice() {
        return burger.getPrice();
    }
}
