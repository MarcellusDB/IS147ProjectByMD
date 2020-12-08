//Name: Marcellus De Burgo
//Email: marceld1@umbc.edu
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	Ordering Obj3 = new Ordering();
	Scanner sc = new Scanner(System.in);
System.out.println("Welcome to <insert restaurant name> would you like to order your food by phone or online?");
 Obj3.OrderOrigin(sc.next());

    }
}
