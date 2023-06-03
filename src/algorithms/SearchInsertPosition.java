package algorithms;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 0));
    }

    public static int searchInsert(int[] nums, int target) {

        if( target <=nums[0]){
            return 0;
        }
        if(target == nums[nums.length-1]){
            return nums.length-1;
        }
        if(target > nums[nums.length-1]){
            return nums.length;
        }

        for(int i = 0; i<nums.length-1; i++){
            if(target == nums[i]){
                return i;
            }
            if(target >= nums[i] && target <= nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}
