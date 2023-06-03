package algorithms;

import java.util.Arrays;
import java.util.Objects;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        int[] sortedArray = {1,1,2,4,5,5,6};
        Arrays.stream(removeDuplicates(sortedArray)).forEach(System.out::println);
    }

    private static int[] removeDuplicates(int[] sortedArray) {

        int currentPosition = 1;
        for (int i = 0; i < sortedArray.length - 1; i++){
            if (!Objects.equals(sortedArray[i], sortedArray[i + 1])){
                sortedArray[currentPosition++] = sortedArray[i+1];
            }
        }
        return sortedArray;
    }
}
