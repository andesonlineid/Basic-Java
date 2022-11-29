package src.com.basicjava;

import java.util.Scanner;

public class SimpleCalculatorSwitchCase {

    // first gate that gonna execution by JVM
    public static void main(String[] args) {

        System.out.println("Simple Calculator Program using Switch Case");

        // Create variabel
        float firstNumber, secondNumber,result;
        String operationSymbol;


        // Call java class/library and create object from it
        Scanner numberfirst = new Scanner(System.in);
        Scanner numberSecond = new Scanner(System.in);
        Scanner symbolOperation = new Scanner(System.in);


        // Get input from user
        System.out.print("Input first number : ");
        firstNumber = numberfirst.nextFloat();

        System.out.print("Input Operation : ");
        operationSymbol = symbolOperation.next();

        System.out.print("Input second number : ");
        secondNumber = numberSecond.nextFloat();

        // Check condition
        switch(operationSymbol) {
                case "+":
                result = firstNumber + secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + result);
                break;

                case "-":
                result = firstNumber - secondNumber;
                System.out.print(firstNumber + " - " + secondNumber + " = " + result);
                break;

                case "*":
                result = firstNumber * secondNumber;
                System.out.print(firstNumber + " * " + secondNumber + " = " + result);
                break;

                case "/":
                result = firstNumber / secondNumber;
                System.out.print(firstNumber + " / " + secondNumber + " = " + result);
                break;

                default:
                System.out.print("Input error, correction what you type..");
                break;
        }
       

    }

}