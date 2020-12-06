package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	Ordering Obj3 = new Ordering();
	Scanner sc = new Scanner(System.in);
System.out.println("Welcome to <insert restaurant name> would you like to order your food by phone or online?");
 Obj3.OrderOrigin(sc.next());




/*
 if(orderType.toLowerCase().equals("phone")){
     System.out.println("Our number is xxx-xxx-xxxx");
 }
 else if(orderType.toLowerCase().equals("online")){
     List.printMenu();
     String answer ="No";
     while (!answer.toLowerCase().equals("Yes")) {
         System.out.println("Please type the number of the item you would like");
         int order = sc.nextInt();
         if(order<=Obj2.getListOrRD("list").length) {
             System.out.println("You would like to order number " + order + ": " + Obj2.getListOrRD("list")[order] + " for $" + Obj2.getPrice(order - 1) + "?");
             System.out.println("Yes/No");
             answer = sc.next();
         }
         else{
             System.out.println("You would like to order number " + order + ": " + "The Random Delight" + " for $" + Obj2.getListOrRD(3) + "?");
             System.out.println("Yes/No");
             answer = sc.next();
             if(answer.equals("Yes")){
                 Obj2.printRD();
                 answer = sc.next();
             }
             else{
                 answer = "No";
             }
         }


     }
        System.out.println("processing purchase....");
        System.out.println("Thank you for your purchase!");

 }
 else{
     System.out.println("error, please only type in your preferred ordering method: phone or online");
 }*/
    }
}
