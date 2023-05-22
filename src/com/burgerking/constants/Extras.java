package com.burgerking.constants;

public enum Extras {
    COKE_LARGE("coke large", 2.99),
    COKE_MEDIUM("coke medium", 1.99),
    COKE_SMALL("coke small", 1.0),
    FRENCH_FRIES("french fries", 3.99);

    private final String name;
    private final double price;
    private Extras(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
