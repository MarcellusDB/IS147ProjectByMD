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
System.out.println("-----------------Menu-----------------");
        for(int x = 0;x<Obj1.getListOrRD("list").length; x = Math.addExact(x, 1)){
            int foodNum = x+1;
            System.out.println(foodNum+". "+Obj1.getListOrRD("list")[x]+" $"+Obj1.getPrice(x));
        }
         //display RD as last item on menu (number = List.length++)
        System.out.println((Obj1.getListOrRD("list").length+1)+". Random Delight $7.99");
    }
    public void printRD(){
        // if user selects RD run this
        // randomly chose a number within index length whichever it lands on is the one the customer gets
        // then run number in getPrice
        Random rand = new Random();
        int RandomDelight = rand.nextInt((getListOrRD("list").length) + 0);
       System.out.println("You got the "+getListOrRD("list")[RandomDelight]+" for $"+ getListOrRD(3));
       System.out.println("Please confirm your order (Yes/No)");
    }
}
