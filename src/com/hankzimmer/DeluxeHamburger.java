package com.hankzimmer;

public class DeluxeHamburger extends Hamburger {
    private boolean includesDrink = true;
    private boolean includesChips = true;

    //Constructor which automatically adds chips and a drink

    public DeluxeHamburger() {
        super("Deluxe", "Sausage & Bacon", 12.30, "White");
        super.addHamburgerAddition1("Chips", 2.30);
        super.addHamburgerAddition2("Drink", 1.95);
    }

    //Prevent additions from being added to a deluxe burger

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
