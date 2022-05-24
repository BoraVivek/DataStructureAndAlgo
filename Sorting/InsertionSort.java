package Sorting;

import utils.ArrayUtils;

public class InsertionSort extends ArrayUtils {
    public static void sortArray(int[] arr){
        /**
         * In Insertion Sort, we imagine, dividing the array in two parts, left part being sorted, and right part being unsorted
         */
        //Here we are considering that the first element is already sorted, so we start from index 1
        for(int i=1; i<arr.length; i++){

            //We store the ith element in temp variable, so we compare it with elements in the sorted section
            int temp = arr[i];

            //We start the nested loop from i-1 index to 0th index, to loop through all the sorted elements, and compare the current ith element, with the sorted elements
            // to check for its position
            int j = i-1;

            //Loop until j is greater than or equals to 0, and element at jth position is greater than element at ith position
            while(j >= 0 && arr[j] > temp){
                //if the element in sorted section is greater than the ith element, then we shift the element by 1
                arr[j+1] = arr[j];

                //decrement value of 0
                j--;
            }

            //Now when there is no element present which is greater than the ith element, then we store the ith element at j+1 index.
            arr[j+1] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = takeInput();
        sortArray(arr);
        printArray(arr);
    }
}
