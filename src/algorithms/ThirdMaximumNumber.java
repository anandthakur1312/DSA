package algorithms;


/**
 * Example 1:
 *
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 *
 * --------------------------------------
 * Example 2:
 *
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist, so the maximum (2) is returned instead.
 */
public class ThirdMaximumNumber {

    public static void main(String[] args) {

        int[] nums = {1, 2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;


        for (int num : nums){
            if (num > max1 || max1 == Integer.MIN_VALUE){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2 || max2 == Integer.MIN_VALUE){
                max3 = max2;
                max2 = num;
            } else if (num > max3 || max3 == Integer.MIN_VALUE) {
                max3 = num;
            }
        }
        return max3 == Integer.MIN_VALUE ? max1 : max3;
    }


}
