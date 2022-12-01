package src.com.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

// standart loop
    // private static float meanCal(float[] value) {
    //     float keepValue = 0;
      
    //     for(int i = 0; i < value.length; i++) {
    //         keepValue += value[i];
    //     }
    //     return keepValue/4;
    // }

    private static float meanCal(float[] value) {
        float keepValue = 0;
    //   Loop using forEach
    // Using forEach we doesn't need index anymore
       for(float numbers : value) {
                keepValue += numbers;
       }
        return keepValue/4;
    }
  
    public static void main(String[] args) {
    //    Array assignment
        // float[] studentValue = {1,2,3,4};

        // Array Declaration
        // Array in java is an object
        float[] studentValue = new float[4];
        float firstNumber, secNumber, thirdNumber, fourthNumber;

        String studentName;
        // Using java class / library Scanner to get input from user and create object with it
        Scanner inputName = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        System.out.print("Please input your name " );
        studentName = inputName.next();
        System.out.print("Please input your value 1 : ");
        firstNumber = input1.nextFloat();
        System.out.print("Please input your value 2 : ");
        secNumber = input2.nextFloat();
        System.out.print("Please input your value 3 : ");
        thirdNumber = input3.nextFloat();
        System.out.print("Please input your value 4 : ");
        fourthNumber = input4.nextFloat();
        

        // Input value into array 
        studentValue[0] = firstNumber;
        studentValue[1] = secNumber;
        studentValue[2] = thirdNumber;
        studentValue[3] = fourthNumber;

        // Changes array values into String and see what's value inside array
      System.out.println("Inside array : "+ Arrays.toString(studentValue));
      float meanResult = meanCal(studentValue);
        System.out.println("Mean : "+meanResult);

    }
}