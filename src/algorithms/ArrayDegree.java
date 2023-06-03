package algorithms;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDegree {

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,3,4,5,5,6};
        Arrays.stream(findArrayDegree(arr)).forEach(System.out::println);
    }

    public static int[] findArrayDegree(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< arr.length; i++) {
            if (map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        int firstIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxEntry.getKey()){
                firstIndex = i;
                break;
            }
        }
        int lastIndex = arr.length -1;
        for (int i = arr.length -1; i >=0; i--) {
            if (arr[i] == maxEntry.getKey()){
                lastIndex = i;
                break;
            }
        }

        int[] result = new int[arr.length - maxEntry.getValue()];

        int counter = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            result[counter++] = arr[i];
        }

        return result;

    }
}
