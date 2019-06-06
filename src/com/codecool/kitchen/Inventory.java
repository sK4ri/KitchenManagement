package com.codecool.kitchen;

import java.util.HashMap;
import java.util.Random;

/**
 * Inventory of the kitchenhelpers
 */
class Inventory {

    private HashMap<Ingredients, Integer> inventory = new HashMap<>();
    private Random random = new Random();

    /**
     * Inventory constructor
     */
    Inventory() {
        fillInventory();
    }

    /**
     * Fills the inventory of kitchen helpers
     */
    private void fillInventory() {
        int INVENTORY_QUANTITY = 3;
        inventory.put(Ingredients.CARROT, random.nextInt(INVENTORY_QUANTITY));
        inventory.put(Ingredients.POTATO, random.nextInt(INVENTORY_QUANTITY));
        inventory.put(Ingredients.MEAT, random.nextInt(INVENTORY_QUANTITY));
    }

    /**
     * Checks the inventory of kitchen helper
     * @param ingredient
     * @return ingredient
     */
    boolean checkInventory(Ingredients ingredient) {
        return inventory.get(ingredient) > 0;
    }

    /**
     * Removes the called ingredient from the inventory of the kitchen helper
     * @param ingredient
     */
    void removeIngredient(Ingredients ingredient) {
        if (checkInventory(ingredient)) {
            inventory.put(ingredient, inventory.get(ingredient) - 1);
        }
    }
}
