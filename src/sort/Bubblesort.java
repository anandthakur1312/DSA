package sort;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {


        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        Arrays.stream(intArray).forEach(e -> System.out.println("Unsorted : " + e));

        int temp = -1;
        int length = intArray.length - 1;
        int i = 0;
        for(i = 0; i < length; i++) {
            for (i = 0; i<length; i++) {
//                if (i != length - 1) {
                    if (intArray[i] > intArray[i + 1]) {
                        temp = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = temp;
                    }
                }
//            }
            length = length - 1;
            i = 0;
        }

//        int temp;
//        for (int unsortedLastIndex = intArray.length-1; unsortedLastIndex > 0; unsortedLastIndex --){
//            for (int i = 0; i < unsortedLastIndex; i++){
//                if (intArray[i] > intArray[i + 1]) {
//                        temp = intArray[i];
//                        intArray[i] = intArray[i + 1];
//                        intArray[i + 1] = temp;
//                    }
//            }
//        }

        Arrays.stream(intArray).forEach(e -> System.out.println("Sorted : " + e));

    }
}
