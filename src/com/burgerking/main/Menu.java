package com.burgerking.main;

import com.burgerking.burger.*;
import com.burgerking.constants.*;
import com.burgerking.utils.*;

import java.util.*;
import java.util.stream.Collectors;

public class Menu {
    Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }
    public void go() {
       Burger burger = getBurger(getUserBurgerChoise());
       List<Extras> extras = getUserExtrasChoise();

       Meal meal = new Meal(burger, extras);
        System.out.println(meal);
    }

    private int getUserBurgerChoise() {
        int burgerType = -1;
        while(true) {
            System.out.println("1 - Classic burger, 2 - CheeseBurger");
            System.out.println("Enter which burger you want: ");
            burgerType = scanner.nextInt();
            if("12".contains(String.valueOf(burgerType))) {
                break;
            }
            System.out.println("Wrong input:");
        }
        scanner.nextLine();
        return burgerType;
    }

    private List<Extras> getUserExtrasChoise() {
        System.out.println("Enter a list of extras(comma separated)");
        System.out.println(Arrays.stream(Extras.values()).map(el -> el.getName() + " - " + el.getPrice()).collect(Collectors.joining(", ")));
        String[] input = scanner.nextLine().split(",");
        return  Arrays.stream(input).map(el -> Extras.valueOf(el.trim().toUpperCase().replace(" ", "_"))).toList();

    }

    private Burger getBurger(int burgerType) {
        return switch(burgerType) {
            case 1 -> new ClassicBurger();
            case 2 -> new CheeseBurger();
            default -> new ClassicBurger();
        };
    }
}
