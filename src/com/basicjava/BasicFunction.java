package src.com.basicjava;

import java.util.Scanner;

public class BasicFunction {

    private static void greetings(String name, String id, Float meanValue) {
            System.out.printf("Hello %s \n Identifier %s \n Your Value: %f ",name,id,meanValue);
    }

    private static float meanCalculation(float firstNumber, float secNumber, float thirdNumber, float fourthNumber) {

        float result = (firstNumber + secNumber +thirdNumber +fourthNumber) / 4;
        return result;

    }

    public static void main(String[] args) {


        // Create variable

        String studentName, id;
        float firstNumber, secNumber, thirdNumber,fourthNumber;

        // Get in put from user
        // using java library / class scanner
        // and create object with it

        Scanner nameStudent = new Scanner(System.in);
        Scanner idStudent = new Scanner(System.in);
        Scanner numberFirst = new Scanner(System.in);
        Scanner numberSec = new Scanner(System.in);
        Scanner numberThird = new Scanner(System.in);
        Scanner numberFourth = new Scanner(System.in);

        System.out.print("Input your name : ");
        studentName = nameStudent.next();
        System.out.print("Input your ID: ");
        id = idStudent.next();
        System.out.print("Input first value: ");
        firstNumber = numberFirst.nextFloat();
        System.out.print("Input second value: ");
        secNumber = numberSec.nextFloat();
        System.out.print("Input third value: ");
        thirdNumber = numberThird.nextFloat();
        System.out.print("Input fourth value: ");
        fourthNumber = numberFourth.nextFloat();

        // Call function
        // Put argument to that function
    //    result =   meanCalculation(firstNumber,secNumber,thirdNumber,fourthNumber);
        greetings(studentName,id,meanCalculation(firstNumber,secNumber,thirdNumber,fourthNumber));


    }

}