package sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = {40, 35, -15, 7, 55, 1, -22};// 0,1,2,3,4,5,6
        //length = 7

        System.out.println("Unsorted Array");
        Arrays.stream(intArray).forEach(a -> System.out.print(a + ","));

        int gap;

        for(gap = intArray.length/2; gap > 0; gap = gap/2){

           for(int firstUnsortedIndex = gap; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
               int newElement = intArray[firstUnsortedIndex];

               int i = firstUnsortedIndex;
               while (i > 0 && (newElement < intArray[i-gap])){
                   intArray[i] = intArray[i-gap];
                   i = i - gap;
               }
               intArray[i] = newElement;
           }

        }

        System.out.println("Sorted Array");
        Arrays.stream(intArray).forEach(a -> System.out.print(a + ","));
    }
}
