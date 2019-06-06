package com.codecool.kitchen;

import java.util.List;
import java.util.Random;

/**
 * Enum of the ingredients
 */
public enum Ingredients {

    CARROT,
    POTATO,
    MEAT;

    private static final List<Ingredients> ingredients = List.of(Ingredients.values());
    private static final int QUANTITY = ingredients.size();
    private static final Random random = new Random();

    /**
     * Gives random ingredients to the caller
     * @return random number of ingredient
     */
    public static Ingredients getRandomIngredient() {
        return ingredients.get(random.nextInt(QUANTITY));
    }
}
