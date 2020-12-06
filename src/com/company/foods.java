package com.company;

public class foods {
    private double Pizza = 10.99;
    private double Cheeseburger = 8.99;
    private double GrilledCheese = 5.99;
    private double Fries = 4.99;
    private double IceCream = 4.99;
    private static double RandomDelight = 7.99;
//either make it^ select a random item from menu and offer at this price or turn it to chief's choice
    // and give it whatever price of the food it lands on.
    private String[] List = {"Pizza", "Cheeseburger", "Grilled Cheese", "Fries", "Ice Cream"};

    public foods(){
    }

    //use switch statement here to make a getter for each food item
    public double getPrice(int food){
        double price= 99999;
        switch(food){
            case 0 :
             price = Pizza;
             break;

            case 1 :
                price = Cheeseburger;
                break;

            case 2 :
                price = GrilledCheese;
                break;

            case 3 :
                price = Fries;
                break;

            case 4 :
                price = IceCream;
                break;

            default:
                System.out.println("error");
                break;
        }
        return price;
    }

    public double getListOrRD(int num){
        return RandomDelight;
    }
    public String[] getListOrRD(String list){
        return List;
    }
}
