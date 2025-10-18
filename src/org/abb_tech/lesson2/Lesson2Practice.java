package org.abb_tech.lesson2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lesson2Practice {
    static void main() {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter operator :");
//        String operator = scanner.next();
//        System.out.println("Enter b number: ");
//        double b = scanner.nextDouble();
//
//
//        if (operator.equals("+")) {
//            System.out.println("+ operator");
//            System.out.println("a + b = " + (a + b));
//
//        } else if (operator.equals("*")) {
//            System.out.println("* operator");
//            System.out.println("a * b = " + (a * b));
//
//        } else if (operator.equals("-")) {
//            System.out.println("- operator");
//            System.out.println(a + " - " + b + " = " + (a - b));
//        } else {
//            System.out.println("/ operator");
//            System.out.println(a + " / " + b + " = " + (a / b));
//        }
//
//        switch (operator) {
//            case "+":
//                System.out.println("+ operator");
//                System.out.println("a + b = " + (a + b));
//                break;
//            case "*":
//                System.out.println("* operator");
//                System.out.println("a * b = " + (a * b));
//                break;
//            case "-":
//                System.out.println("- operator");
//                System.out.println(a + " - " + b + " = " + (a - b));
//                break;
//            default:
//                System.out.println("/ operator");
//                break;
//        }


//        while (true) {
//            System.out.println("Enter a number: ");
//            int a = scanner.nextInt();
//            System.out.println("Enter operator :");
//            String operator = scanner.next();
//            System.out.println("Enter b number: ");
//            double b = scanner.nextDouble();
//        }
//
//        do {
//            System.out.println("At least one of the numbers is not a number");
//        } while (false);
//

        FIRSTFor:
        for (int i = 0, j = 1; i + j < 10; i++, j++) {
           if (i == 5) {
               continue;
           }



            System.out.println("Skipp");
        }
    }

}
