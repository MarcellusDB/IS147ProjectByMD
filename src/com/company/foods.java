package com.company;

public class foods {
    private double Pizza = 10.99;


    public foods(double Pizza){
        this.Pizza= Pizza;
    }

    public double getPizza(){
    return Pizza;
    }

    //use switch statement here to make a getter for each food item
    public double getPrice(String food){
        double price= 2;
        switch(food){
            case "Pizza" :
             price = getPizza();
             break;
        }
        return price;
    }


}
