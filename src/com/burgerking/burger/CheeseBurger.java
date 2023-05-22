package com.burgerking.burger;

import com.burgerking.constants.BunsTypes;
import com.burgerking.constants.MeatTypes;

public class CheeseBurger extends Burger {
    public CheeseBurger() {
        super("CheeseBurger", 4.99, MeatTypes.CHICKEN, BunsTypes.PLAIN);
    }
}
