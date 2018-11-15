package com.hankzimmer;

public class Main {

    public static void main(String[] args) {

        //Create a basic burger and add additions to it

        Hamburger hamburger = new Hamburger("Basic", "White", 4.45, "Sausage");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.40);
        hamburger.addHamburgerAddition2("Cheese", 0.75);
        hamburger.addHamburgerAddition3("Lettuce", 0.26);
        System.out.println("Total Burger price is $" + hamburger.itemizeHamburger());


        //Create a healthy burger and add additions to it

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.75);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Tofu", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());


        //Create a deluxe burger and attempt to add an addition to it

        DeluxeHamburger deluxeBurger = new DeluxeHamburger();
        deluxeBurger.itemizeHamburger();
        System.out.println("Total deluxe burger price is " + deluxeBurger.itemizeHamburger());
        deluxeBurger.addHamburgerAddition1("Cheese", .75);
    }
}
