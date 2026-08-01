class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double maxSum = 0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        maxSum = sum;
        int left = 0;
        for(int i =k;i<nums.length;i++){
             sum = sum -nums[left];
             left++;
             sum +=nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return (Double)maxSum/k;
    }
}