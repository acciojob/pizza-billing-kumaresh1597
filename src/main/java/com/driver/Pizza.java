package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int toppings;
    private final int vegBasePrice = 300;
    private final int nonVegBasePrice = 400;
    private final int cheesePrice = 80;
    private final int toppingsPriceVeg = 70;
    private final int toppingsPriceNonVeg = 120;
    private final int bagPrice = 20;

    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean bagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg? vegBasePrice : nonVegBasePrice;
        this.toppings = isVeg ? toppingsPriceVeg : toppingsPriceNonVeg;
        this.price = basePrice;
        this.bill = "";
        this.cheeseAdded = false;
        this.toppingsAdded = false;
        this.bagAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            this.price += cheesePrice;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            this.price += toppings;
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            this.price += bagPrice;
            bagAdded = true;
        }
    }

    public String getBill(){
        bill += "Base Price Of The Pizza: "+basePrice+"\n";
        if(cheeseAdded) {
            bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(toppingsAdded) {
            bill = bill + "Extra Toppings Added: " + toppings + "\n";
        }
        if(bagAdded) {
            bill = bill + "Paperbag Added: " + bagPrice + "\n";
        }

        bill = bill + "Total Price: "+price;

        return this.bill;
    }
}
