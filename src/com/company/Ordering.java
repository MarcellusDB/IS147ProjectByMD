package com.company;
import java.util.Scanner;
public class Ordering {
    Scanner sc = new Scanner(System.in);
    List Obj2 = new List();
   private String answer;
    public void OrderOrigin(String OrderType) {
        while (!OrderType.toLowerCase().equals("online") && !OrderType.toLowerCase().equals("phone")) {
            System.out.println("error, please only type in your preferred ordering method: phone or online");
            OrderType = sc.next();
        }
        if (OrderType.toLowerCase().equals("phone")) {
            System.out.println("Our number is xxx-xxx-xxxx");
        }
        else {
            List.printMenu();
            do {
                System.out.println("Please type the number of the item you would like");
                int order = sc.nextInt();

                    if(order<=Obj2.getListOrRD("list").length) {
                    OrderingNorm(order);
                 }
                    else{
                    OrderingRand(order);
                 }
            }while (!answer.toLowerCase().equals("yes"));
            System.out.println("processing purchase....");
            System.out.println("Thank you for your purchase!");
        }
    }

    public void OrderingNorm(int order) {
        System.out.println("You would like to order number " + order + ": " + Obj2.getListOrRD("list")[order-1] + " for $" + Obj2.getPrice(order - 1) + "?");
        System.out.println("Yes/No");
        answer = sc.next();
    }

    public void OrderingRand(int order) {
        System.out.println("You would like to order number " + order + ": " + "The Random Delight" + " for $" + Obj2.getListOrRD(3) + "?");
        System.out.println("Yes/No");
         String answer = sc.next();
        if(answer.toLowerCase().equals("yes")){
            Obj2.printRD();
            this.answer = sc.next();
        }
        else {
            this.answer = "No";
        }
    }
}
