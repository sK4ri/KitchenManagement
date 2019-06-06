package com.codecool.kitchen;

/**
 * Cooker employees in the kitchen
 */
public class Cooker extends Cookers {

    /**
     * Cookers work in the kitchen
     */
    @Override
    public void cook() {
        System.out.println("This cooker is cooking.");
    }
}
