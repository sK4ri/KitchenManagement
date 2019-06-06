package com.codecool.kitchen;

/**
 * Cooker employees in the kitchen
 */
abstract class Cookers extends Employee implements AbleToCook {

    /**
     * Cookers constructor
     */
    Cookers() {
        boolean hasKnife = true;
    }
}
