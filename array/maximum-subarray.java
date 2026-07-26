class Solution {
    public int maxSubArray(int[] nums) {
        int currsum =0;
        int maxsum =nums[0];
        if(nums.length == 1){
            return maxsum;
        }
        for(int i =0;i<nums.length;i++){
            currsum = Math.max(nums[i],currsum + nums[i]);
            maxsum= Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}