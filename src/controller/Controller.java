package controller;


import model.CalculatorModel;

import java.util.Scanner;

public class Controller {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         double a=0, b=0;
         String choice="";
        while (true) {
            System.out.println("Enter the values of a & b");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. quit");
            choice = sc.next();


            //printing result and continuing the loop
            CalculatorModel model = new CalculatorModel(a,b);
            switch (choice) {
                case "1":
                    System.out.println(model.addition());
                    break;
                case "2":
                    System.out.println(model.subtraction());
                    break;
                case "3":
                    System.out.println(model.multiplication());
                    break;
                case "4":
                    System.out.println(model.division());
                    break;
                default:
                System.exit(0);
            }
        }
    }


}
