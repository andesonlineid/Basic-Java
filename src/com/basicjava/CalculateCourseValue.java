package src.com.basicjava;

import java.util.Scanner;

public class CalculateCourseValue {

    // this is first gate that JVM execute 
    public static void main(String[] args) {

        System.out.println("=== Calculate Course Value ===");
        // Create variable that we need
        String studentName, studentIdentificationNumber,dreamValue;
        float taskValue, quisValue, midValue, lastValue, resultValue;
        

        // Get input
        // call java class/library Scanner and create object / instance
        Scanner nameStudent = new Scanner(System.in);
        Scanner idStudent = new Scanner(System.in);
        Scanner valueTask = new Scanner(System.in);
        Scanner valueQuis = new Scanner(System.in);
        Scanner valueMid = new Scanner(System.in);
        Scanner valueLast = new Scanner(System.in);
        Scanner valueDream = new Scanner(System.in);


        System.out.print("Input your name : ");
        studentName = nameStudent.next();
        System.out.print("Input your id : ");
        studentIdentificationNumber = idStudent.next();
        System.out.print("Input your dream value: ");
        dreamValue = valueDream.next();
        System.out.print("Input your task value: ");
        taskValue = valueTask.nextFloat();
        System.out.print("Input your quis value: ");
        quisValue = valueQuis.nextFloat();
        System.out.print("Input your mid value: ");
        midValue = valueMid.nextFloat();
        System.out.print("Input your last value: ");
        lastValue = valueLast.nextFloat();

        // Process
        resultValue = (
            (taskValue + taskValue * 0.1f) + (quisValue + quisValue * 0.1f) 
            + (midValue + midValue * 0.2f) + (lastValue + lastValue * 0.35f)
        ) / 4;

        // Check condition 
        if(!studentName.isEmpty() && !studentIdentificationNumber.isEmpty()) {
            if(studentName.toLowerCase().matches("andesta") && studentIdentificationNumber.matches("161200004")) {

                switch(dreamValue) {
                    case "A":
                    System.out.println("A: Your value must be > 8");
                    break;
                    case "B":
                    System.out.println("B : Your value must be > 7 && <= 8");
                    break;
                    case "C":
                    System.out.println("C: Your value must be > 6 && <= 7");
                    break;
                    case "D":
                    System.out.println("D: Yout value must be > 5 && < 6");
                    break;
                    default:
                    System.out.println("Wrong input");
                }

                if(resultValue > 8f) {
                    System.out.printf("Congratulation %s your value %f",studentName, resultValue);
                } else if(resultValue > 7f && resultValue <= 8f) {
                    System.out.printf("Congratulation %s your value %f",studentName, resultValue);
                } else if(resultValue > 6f && resultValue <= 7f) {
                    System.out.printf("Congratulation %s your value %f",studentName, resultValue);
                } else if(resultValue > 5f && resultValue <= 6f) {
                    System.out.printf("Congratulation %s your value %f",studentName, resultValue);
                } else {
                    System.out.printf("You have to study hard bro %s your value %f",studentName, resultValue);
                }


            } else {
                System.out.println("Please check again your name and identification");
            }
            
        } else {
            System.out.println("Field cannot be empty");
        }


    }

}