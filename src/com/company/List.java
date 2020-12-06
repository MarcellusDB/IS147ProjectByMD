package com.company;
import java.lang.Math;
import java.util.Random;

public class List extends foods{
    //private static foods Obj1;
    //Have array print number of array+1
    //print array
    // print getPrice(array)

     public static void printMenu(){
         foods Obj1 = new foods();
        String[] List = {"Pizza", "Cheeseburger", "Grilled Cheese", "Fries", "Ice Cream"};
        for(int x = 0;x<List.length; x = Math.addExact(x, 1)){
            int foodNum = x+1;
            System.out.println(foodNum+". "+List[x]+" $"+Obj1.getPrice(x));
        }
         //display RD as last item on menu (number = List.length++)
        String RandomDelight;
    }
    public double PrintRD(){
        // if user selects RD run this
        // randomly chose a number within index length whichever it lands on is the one the customer gets
        // then run number in getPrice
        Random rand = new Random();
        int RandomDelight = rand.nextInt((List.length) + 1);
        double RDPrice = getPrice(RandomDelight);
        return RDPrice;
    }
}
