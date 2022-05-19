package utils;

import java.util.Scanner;

public class ArrayUtils {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements to store in Array: ");
        int x = s.nextInt();

        int arr[] = new int[x];
        System.out.print("Enter "+x+" values for array :");
        for(int i = 0; i<x; i++){
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr, boolean newline, String message){
        if(message != ""){
            System.out.println(message);
        }

        for(int i=0; i<arr.length; i++){
            if(newline){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printArray(int[] arr){
        System.out.println("Printing Array:");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
