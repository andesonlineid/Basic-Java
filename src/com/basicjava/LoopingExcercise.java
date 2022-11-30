package src.com.basicjava;

import java.util.Scanner;

public class LoopingExcercise {
//  First gate gonna execute by JVM
public static void main(String[] args) {

    // While(condition / expression) {
        // Action
    // }

    // int x = 1;
    // int y = 5;


    // while(x <= y) {
    //     System.out.print(++x);
    // }

    // do while
    // do {
    //     // Action
    //     System.out.print(x++);
    // } while (x < y);


    // For loop
    // for(inisialisasi; condition; increment/decrement++){
    // Action
    // }
    
    
    // Create Variable
    // int firstNumber, limitedValue, total;

    // // Call java class / library Scanner and create object
    // Scanner numberFirst = new Scanner(System.in);
    // Scanner valueLimited = new Scanner(System.in);
    
    // // Get input from user
    // // using method from scanner library
    // System.out.print("Input first value : ");
    // firstNumber = numberFirst.nextInt();
    // System.out.print("Input limited value: ");
    // limitedValue = valueLimited.nextInt();
    // total = 0;

    // // process
    // while(firstNumber <= limitedValue) {

    //     total += firstNumber;
    //     firstNumber++;
    //     System.out.println("Penjumlahan nilai rentang: "+ total);
    // }
 
    
    // Fibbonacci

    // int f_n,f_n1,f_n2;

    // f_n1 = 1;
    // f_n2 = 0;
    // f_n = 1;
    // for(int i = 1; i<=5; i++) {

    //     f_n = f_n1 + f_n2;
    //     f_n2 = f_n1;
    //     f_n1 = f_n;
    //     System.out.println("Urutan ke : "+ i + " Fibbonacci : "+ f_n);
    // }


//     for(int i = 1; i <= 5; i++) {
//         System.out.print("test : "+i + " ");
//         for(int j = 5; j >= 1 ; j--) {
//             System.out.print("* ");

//         if(i == j) {
//             break;
//         }
//     }
//     System.out.print("\n");
// }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                    System.out.print(" ^ ");


                    if((i+j) == 6) {
                        System.out.println("Keluar i+j == 6");
                        break;
                    }

            }
            System.out.println(" \n ");
        }

} 
}