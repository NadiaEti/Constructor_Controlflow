package controlFlow;

import java.util.Scanner;

public class ControlFlow_Basic {
//  Control Flow using if else
//  If the condition is true than if block of code will execute
//  If the condition is false than if block of code will not execute
//  If the condition is true than else block of code will execute

    public static void main(String[] args) {
        // Syntax: if ( Condition )  {}
        //        1st:
        int number1 = 4;
        if (number1 == 5) {
            System.out.println("Hey this is Nadia");
        } else {
            System.out.println(" Here is Husna");
        }

        //       2nd:
        // In a big company we have to use multiple if a time because in my project maybe
        //  I need to put multiple logic at a time so that time we have to use multiple if one by one

        int id = 27;

        if (id == 25){
            System.out.println("Nadia's student id is 25");
        }
        if (id == 27){
            System.out.println("Eti's student id is 27");
        }
        if (id == 30){
            System.out.println("Emti's student id is 30");
        }

        // 3rd:
        int number = 5;     //int variable value is 5
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (number < 6) { //if i put here (number ==6) it will false
            System.out.println("Hey this is Nadia");
            System.out.println("Hey this is Nadia");
        } else {
            System.out.println("This is not nadia");
        }

        }
    }
