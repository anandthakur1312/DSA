package algorithms;

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
