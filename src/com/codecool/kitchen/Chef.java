package com.codecool.kitchen;

import java.util.Random;

/**
 * Chef employee in the kitchen
 */
public class Chef extends Cookers {

    private Random randomEvent = new Random();
    Ingredients calledIngredient;

    /**
     * Chefs work in the kitchen
     */
    @Override
    public void cook() {
        calledIngredient = null;
        System.out.println("Chef yelling!!");
        if (randomEvent.nextBoolean()) {
            calledIngredient = Ingredients.getRandomIngredient();
            System.out.println("Chef called for " + calledIngredient);
        }
    }
}
