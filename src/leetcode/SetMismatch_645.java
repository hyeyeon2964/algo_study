package leetcode;

public class SetMismatch_645 {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length+1];
        int[] result = new int[2];
        for(int i = 0; i<nums.length; i++) {
            if (arr[nums[i]] == 1) {
                result[0] = nums[i];
            }
            else {
                arr[nums[i]]++;
            }
        }
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] == 0) {
                result[1] = i;
                return result;
            }
        }
        return result;
    }
}
