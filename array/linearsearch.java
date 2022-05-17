package array;

import utils.ArrayUtils;

import java.util.Scanner;

public class linearsearch extends ArrayUtils {

    public static int searchLinear(int arr[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value to be searched: ");
        int num = s.nextInt();

        for(int i=0;i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }

        return -1;
    }


    public static void main(String args[]){

        int arr[] = takeInput();

        int index = searchLinear(arr);

        if(index == -1){
            System.out.println("Value not present in array");
        }else{
            System.out.println("Value present at position :"+ index);
        }
    }
}
