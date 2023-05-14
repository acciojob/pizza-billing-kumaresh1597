package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int total;
    private int toppings;
    final int vegBasePrice = 300;
    final int nonVegBasePrice = 400;
    final int cheesePrice = 80;
    final int toppingsPriceVeg = 70;
    final int toppingsPriceNonVeg = 120;
    final int bagPrice = 20;

    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean bagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = vegBasePrice;
            toppings = toppingsPriceVeg;
            total += vegBasePrice;
        }
        else{
            price = nonVegBasePrice;
            toppings = toppingsPriceNonVeg;
            total += nonVegBasePrice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            total += cheesePrice;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            total += toppings;
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            total += bagPrice;
            bagAdded = true;
        }
    }

    public String getBill(){
        bill = "Base Price Of The Pizza: "+price+"\n";
        if(cheeseAdded)
        bill = bill + "Extra Cheese Added: "+cheesePrice+"\n";
        if(toppingsAdded)
        bill = bill + "Extra Toppings Added: "+toppings+"\n";
        if(bagAdded)
        bill = bill + "Paperbag Added: "+bagPrice+"\n";

        bill = bill + "Total Price: "+total;

        return this.bill;
    }
}
