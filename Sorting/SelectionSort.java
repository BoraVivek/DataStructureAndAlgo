package Sorting;
import utils.ArrayUtils;

public class SelectionSort extends ArrayUtils {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length - 1; i++) { //0 to length - 1

            //Considering the first element to be the minimum element
            int min = arr[i];
            int minIndex = i;

            //Looking through rest of the elements and finding the lowest element - j = i+1
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }

            // Swapping Elements - Skip if index is same for both
            if(i != minIndex){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = takeInput();
        selectionSort(arr);
        printArray(arr, true, "Sorted array: ");
    }

}
