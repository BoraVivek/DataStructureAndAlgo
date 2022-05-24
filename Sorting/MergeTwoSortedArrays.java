package Sorting;

import utils.ArrayUtils;

public class MergeTwoSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        /* Creating an array of length equals to length of arr1 + length of arr2 **/
        int arr3[] = new int[arr1.length + arr2.length];

        /* Keeping 3 pointers, to traverse 3 different arrays */
        int i=0, j=0, k=0;

        /* Running this array until one of the array length is over, so the array will run till the length of the smallest array */
        while(i<arr1.length && j<arr2.length){
            // If element in arr1 at ith position is smaller than the element in arr2 at jth position
            if(arr1[i] < arr2[j]){
                //Store the ith element of arr1 in kth position of arr3
                arr3[k] = arr1[i];

                //Increment ith position for arr1
                i++;
            }else {
                // Else store the jth element of arr2 in kth position of arr3
                arr3[k] = arr2[j];

                //Increment the jth position of arr2
                j++;
            }

            //Increment the kth position of arr3
            k++;
        }

        //If there are left out elements in arr1 , then we copy those elements in arr3
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        //If there are left out elements in arr2, then we copy those elements in arr3
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        //Returning the element
        return arr3;
    }

    public static void main(String args[]) {
        System.out.println("Enter Values for Array 1:");
        int[] arr1 = ArrayUtils.takeInput();

        System.out.println("Enter Values for Array 2:");
        int[] arr2 = ArrayUtils.takeInput();

        int arr3[] = mergeArrays(arr1, arr2);

        System.out.println("Printing Merged Array:");
        ArrayUtils.printArray(arr3);
    }
}
