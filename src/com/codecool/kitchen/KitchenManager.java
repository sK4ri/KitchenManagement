package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.List;

/**
 * Program main class
 */
public class KitchenManager {

    private List<Employee> employees = new ArrayList<>();
    private List<Helper> helpers = new ArrayList<>();
    private List<AbleToCook> cookers = new ArrayList<>();

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        int COOKING_CYCLES = 5;

        KitchenManager kitchen = new KitchenManager();
        kitchen.init();

        for (int i = 0; i < COOKING_CYCLES; i++) {
            for (AbleToCook cooker : kitchen.cookers) {
                cooker.cook();
                if (cooker instanceof Chef && ((Chef) cooker).calledIngredient != null) {
                    kitchen.chefYelling(((Chef) cooker).calledIngredient);
                }
            }
        }
    }

    /**
     * Initialize the cooking process
     */
    private void init() {
        int COOKER_STAFF = 2;
        int HELPER_STAFF = 5;

        employees.add(new Chef());

        for (int i = 0; i < COOKER_STAFF; i++) {
            employees.add(new Cooker());
        }

        for (int i = 0; i < HELPER_STAFF; i++) {
            employees.add(new Helper());

            employees.stream()
                    .filter(e -> e instanceof Helper)
                    .forEach(e -> helpers.add((Helper) e));

            employees.stream()
                    .filter(e -> e instanceof AbleToCook)
                    .forEach(e -> cookers.add((AbleToCook) e));

        }
    }

    /**
     * Manages the Chefs cooking method
     * @param ingredient
     */
    private void chefYelling(Ingredients ingredient) {
        for (Helper helper : helpers) {
            if (helper.inventory.checkInventory(ingredient)) {
                helper.inventory.removeIngredient(ingredient);
                System.out.println(ingredient + " removed from inventory.");
                return;
            }
        }
        helpers.forEach(Helper::emptyInventory);
    }

}
