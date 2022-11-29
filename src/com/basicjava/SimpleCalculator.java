package src.com.basicjava;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        System.out.println("=== Simple Calculator Program ===");

        float firstNumber, secondNumber;
        float result;
        char aritmathOperator;
        // input
        // Call class/library Scanner in java and create object from it
        Scanner numberFirst = new Scanner(System.in);
        Scanner numberSecond = new Scanner(System.in);
        Scanner operatorSymbol = new Scanner(System.in);
        // Scanner minusSymbol = new Scanner(System.in);
        // Scanner multiplicationSymbol = new Scanner(System.in);
        // Scanner dividedSymbol = new Scanner(System.in);

        // Get input 
        // Call method from the object that we've made before

        System.out.print("Input your first Number : ");
        firstNumber = numberFirst.nextFloat();
        System.out.print(("Input aritmatic operator : "));
        // next() method to get string input and add charAt method to get character inside () put index of the character
        aritmathOperator = operatorSymbol.next().charAt(0);
        System.out.print("Input your second number : ");
        secondNumber = numberSecond.nextFloat();

        // Process
        if(aritmathOperator == '+') {
            // casting or convert data type    
            result =  firstNumber + secondNumber;
            System.out.printf("You choose operator : %s \n Result : %f ",aritmathOperator,result);

        } else if (aritmathOperator == '-') {
            result = firstNumber - secondNumber;
            System.out.printf("You choose operator : %s \n Result : %f ",aritmathOperator,result);

        } else if (aritmathOperator == '*') {
            result = firstNumber * secondNumber;
            System.out.printf("You choose operator : %s \n Result : %f ",aritmathOperator,result);

        } else if (aritmathOperator == '/') {
            if(secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.printf("You choose operator : %s \n Result : %f ",aritmathOperator,result);

             } else {
                System.out.print("Divided with 0 the result gonna be infinity");
             }

        } else if (aritmathOperator == '%') {
            result = firstNumber % secondNumber;
            System.out.printf("You choose operator : %s \n Result : %f ",aritmathOperator,result);

        } else {
            System.out.println("Input error, we don't know");
        }

        

    }

}