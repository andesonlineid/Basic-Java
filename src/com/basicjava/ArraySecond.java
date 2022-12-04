package src.com.basicjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class ArraySecond {

    // empty function without return
    static void greetingsFunct() {
        System.out.println(" ==== Hello welcome to Mean Program ===");
    }

    static void greetingStudent(String name, String id) {
        System.out.printf("Hello Name : %s \n ID : %s ",name, id);
    }
    
    private static float resultValue(float[] value) {
        float hasil =  ;
        for(int i = 0; i < value.length; i++) {
            hasil += value[i];
        }
        return hasil/4;
    }
    

    public static void main(String[] args) {
        
    //   Pre defined process / input variable
        String studentName, studentId;
        float dutyValue, quisValue, midValue, lastValue, result;
        float[] arrValue = new float[4];

    // Call java class / library Scanner to get input from user
    // and create object with that class
    Scanner inputName = new Scanner(System.in);
    Scanner inputId = new Scanner(System.in);
    Scanner inputDuty = new Scanner(System.in);
    Scanner inputQuis = new Scanner(System.in);
    Scanner inputMid = new Scanner(System.in);
    Scanner inputLast = new Scanner(System.in);

    
        greetingsFunct();
    // Get input from user
    System.out.print("Input Name : ");
    studentName = inputName.next();
    System.out.print("Input Id : ");
    studentId = inputId.next();
    System.out.print("Input taskValue : ");
    dutyValue = inputDuty.nextFloat();
    System.out.print("Input quisValue : ");
    quisValue = inputQuis.nextFloat();
    System.out.print("Input midValue : ");
    midValue = inputMid.nextFloat();
    System.out.print("Input lastValue : ");
    lastValue = inputLast.nextFloat();

    arrValue[0] = dutyValue;
    arrValue[1] = quisValue;
    arrValue[2] = midValue;
    arrValue[3] = lastValue;

    
    greetingStudent(studentName, studentId);
    
    result = resultValue(arrValue);
    System.out.println(result);
   

    }


}