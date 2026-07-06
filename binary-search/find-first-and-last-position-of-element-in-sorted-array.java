class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftMost = findLeftMost(nums,target);
        int rightMost = findRightMost(nums,target);
        return new int[]{leftMost,rightMost};
        
    }
    private int findLeftMost(int[] nums,int target){
        int res = -1;
        int l = 0;
        int r = nums.length -1;
        while(l <= r){
            int mid = l+(r-l)  /2;
            if(nums[mid] > target){
                r = mid -1;
            }
            else if(nums[mid] < target){
                l = mid +1;
            }
            else {
                res = mid;
                r = mid-1;
            }
        }
        return res;
    }
    private int findRightMost(int[] nums,int target){
        int res = -1;
        int l = 0;
        int r = nums.length -1;
        while(l <= r){
            int mid =  l +( r -l) /2;
            if(nums[mid] > target){
                r = mid -1;
            }
            else if(nums[mid] < target){
                    l = mid +1;
            }
            else {
                res = mid;
                l = mid +1;
                
            }
        }
        return res;
    }
}