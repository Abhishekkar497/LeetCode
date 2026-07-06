class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int length = nums.length;
        int total_sum = (length* (length+1))/2;
        for(int num : nums){
            sum+= num;
        }
        return total_sum -sum;

    }
}