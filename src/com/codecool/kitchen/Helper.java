package com.codecool.kitchen;

/**
 * Kitchen helper employees in the kitchen
 */
class Helper extends Employee {

    Inventory inventory = new Inventory();

    /**
     * Kitchen helpers work in the kitchen
     */
    void emptyInventory() {
        System.out.println("We’re all out!");
    }
}
