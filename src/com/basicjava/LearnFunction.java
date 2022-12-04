package src.com.basicjava;

import java.util.Arrays;

public class LearnFunction {

    // static int multiplication(int x) {
    //     int hasil = x * x;
    //     return hasil;
    // }

        private static void sumArrayFunct(int[] firstData, int[] secData) {
            // ways create new variable
        //    int[] arrayResult = new int[firstData.length];
            // loop
            for(int i = 0; i < firstData.length; i++) {
                 // sum process
            //    arrayResult[i] = firstData[i] + secData[i];
            firstData[i] = firstData[i] + secData[i];
           
            }
            // return new array 
            System.out.println("Sum 2 arrays : "+ Arrays.toString(firstData));
        }

        // mergeArrayFunct
        private static void mergeArrayFunct(int[] firstArray, int[] secArray, int[] mergeArr){
            // New array way
           

            // first loop
            for(int i = 0; i < firstArray.length; i++) {
                mergeArr[i] = firstArray[i];
            }

            System.out.println("First Merge 2 Arrays : "+ Arrays.toString(mergeArr));

            for(int i = 0; i < secArray.length; i++) {
                // we want to take data from array second
                mergeArr[secArray.length + i] = secArray[i];
                System.out.println("Posisi saat ini "+ secArray.length + " Index merge array "+ (secArray.length + i));
            }
            System.out.println("second Merge 2 Arrays : "+ Arrays.toString(mergeArr));

        }

        private static void sortArrayFunct(int[] data) {
           
            Arrays.sort(data);
            System.out.println("After sort ascending :" + Arrays.toString(data));
            
            int temp;
            // Process sort descending
            // Look the length of array, look how much loop for that value 
            for(int i = 0; i < data.length/2; i++) {
                // swap the value
                temp = data[(data.length - 1) - i];
                data[(data.length-1) - i] = data[i];
                // System.out.println("Check index data place : " + ((data.length-1) - i ));
                data[i] = temp;
            
            }
            System.out.println("After soft Descending : " + Arrays.toString(data));
        }

        
        

    public static void main(String[] args) {
        // System.out.print(multiplication(10));

        // sum 2 arrays
        int[] firstArray = {1,12,32,50,11};
        int[] secArray = {9,7,6,11,5};
        int[] mergeArr = new int[firstArray.length + secArray.length];
        sumArrayFunct(firstArray,secArray);
        mergeArrayFunct(firstArray, secArray,mergeArr);
        sortArrayFunct(mergeArr);
       

      

        
    
    }
}