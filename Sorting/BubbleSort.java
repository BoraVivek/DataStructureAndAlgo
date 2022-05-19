package Sorting;

import utils.ArrayUtils;

public class BubbleSort extends ArrayUtils {

    public static void sortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int[] arr = takeInput();
        sortArray(arr);
        printArray(arr);
    }
}
