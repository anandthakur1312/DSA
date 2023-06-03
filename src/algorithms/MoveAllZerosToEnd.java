package algorithms;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] a = {1,0,2,3,5,0,4};
//        moveZeros(a);
        moveZerosNew(a);

        Arrays.stream(a).forEach(System.out::println);
    }

    private static void moveZerosNew(int[] numArray) {
        int position = 0;

        for (int i = 0; i< numArray.length; i++){
            if (numArray[i] != 0){
                numArray[position] = numArray[i];
                ++position;
            }
        }
    }

    static void moveZeros(Integer[] array){

        int count = 0; //1

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                array[count++] = array[i];
            }
        }

        for (int i = count; i < array.length; i++) {
                array[i] = 0;
        }
    }

}
