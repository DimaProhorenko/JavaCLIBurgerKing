package com.burgerking.burger;

import com.burgerking.constants.BunsTypes;
import com.burgerking.constants.MeatTypes;

public class Burger {
    private String name;
    private double price;
    private MeatTypes meatType;
    private BunsTypes burgerBun;

    public Burger(String name, double price, MeatTypes meatType, BunsTypes burgerBun) {
        this.name = name;
        this.price = price;
        this.meatType = meatType;
        this.burgerBun = burgerBun;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public MeatTypes getMeatType() {
        return meatType;
    }

    public BunsTypes getBurgerBun() {
        return burgerBun;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", meatType=" + meatType +
                ", burgerBun=" + burgerBun +
                '}';
    }
}
