package com.burgerking.main;
import java.util.*;
import java.util.stream.Collectors;

import com.burgerking.burger.*;
import com.burgerking.constants.*;
public class Meal {
    private Burger burger;
    private List<Extras> extras;
    private double totalPrice;

    public Meal(Burger burger, List<Extras> extras) {
        this.burger = burger;
        this.extras = extras;
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
        return String.format("""
                Your order:
                %s
                %s
                Total: %.2f$
                """, burger, getExtrasString(), totalPrice);
    }


    private double calcTotalPrice() {
        double extrasPrice = extras.stream().mapToDouble(el -> el.getPrice()).sum();
        return burger.getPrice() + extrasPrice;
    }

    private String getExtrasString() {
        return extras.stream().map(el -> String.format("%s: %.2f$", el.getName(), el.getPrice())).collect(Collectors.joining("\n"));
    }
}
