package array;

import utils.ArrayUtils;

import java.util.Scanner;

public class binarysearch extends ArrayUtils {
    public static int binarySearch(int arr[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. to be searched: ");
        int x = s.nextInt();

        int start = 0;
        int end = arr.length;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){

        int arr[] = takeInput();

        int index = binarySearch(arr);

        if(index == -1){
            System.out.println("Value not present in array");
        }else{
            System.out.println("Value present at position :"+ index);
        }
    }
}
