package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] numbers = {0, 4, 3, 5, 6, 6, 7};
    static int expectedNum = 9;

    public static void main(String[] args) {

//        twoSumBruteForce(numbers, expectedNum);
//
//        twoSumLoopMap(numbers, expectedNum);

//        twoSumContainsMap(numbers, expectedNum);


    }

    public static int twoSumBruteForce(int[] numbers, int expectedSum){

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j<numbers.length; j++){
                if (numbers[i] + numbers[j] == expectedSum) {
                    System.out.println("Brute Force Indexes are : " + i + " and " + j);
                    return numbers[i] + numbers[j];
                }
            }
        }

        return 0;
    }

    public static int twoSumLoopMap(int[] numbers, int expectedSum){
        Map<Integer, Integer> postitionAndNumberMap = new HashMap<>();
        postitionAndNumberMap.put(0, numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            for (Map.Entry<Integer, Integer> entry : postitionAndNumberMap.entrySet()){
                if (expectedSum - numbers[i] == entry.getValue()){
                    System.out.println("Using Map Loop- Indexes are : " + i + " and " + entry.getKey());
                    return 0;
                }
            }
            postitionAndNumberMap.put(i, numbers[i]);
        }

        return 0;
    }

    public static int[] twoSumContainsMap(int[] nums, int target){
        Map<Integer, Integer> postitionAndNumberMap = new HashMap<>();
        postitionAndNumberMap.put(nums[0], 0);

        int[] result = new int[2];

        for (int i = 1; i < nums.length; i++) {
                if (postitionAndNumberMap.containsKey(target - nums[i])){
                    System.out.println("Using Map Contains- Indexes are : " + i + " and " + postitionAndNumberMap.get(target - nums[i]));
                    result[0] = i;
                    result[1] = postitionAndNumberMap.get(target - nums[i]);
                    return result;
            }
            postitionAndNumberMap.put(nums[i], i);
        }

        return result;
    }

}

