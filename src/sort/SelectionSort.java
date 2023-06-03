package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};// 0,1,2,3,4,5,6
        //length = 7

        System.out.println("Unsorted Array");
        Arrays.stream(intArray).forEach(a -> System.out.print(a + ","));

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexOfLargest = 0;
            for ( int i = 1 ; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i;
                }
            }
            swap(intArray, indexOfLargest, lastUnsortedIndex);
        }

        System.out.println("Sorted Array");
        Arrays.stream(intArray).forEach(a -> System.out.print(a + ","));
    }

    public static void swap(int array[], int i, int j ){
        if(i==j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
