package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};// 0,1,2,3,4,5,6
        //length = 7


        System.out.println("Unsorted Array");
        Arrays.stream(intArray).forEach(a -> System.out.print(a + ","));

//        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
//
//            int newElement = intArray[firstUnsortedIndex];
//
//            int i;
//            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
//                    intArray[i] = intArray[i-1];
//            }
//            intArray[i] = newElement;
//
//        }

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];

            int i = firstUnsortedIndex;
            while(i > 0 && (intArray[i-1] > newElement)){
                intArray[i] = intArray[i-1];
                i = i-1;
            }
            intArray[i] = newElement;

        }


        System.out.println("Sorted Array");
        Arrays.stream(intArray).forEach(a -> System.out.print(a + ","));
    }

}
