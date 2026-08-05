class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int mul = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] !=0){
            mul*= nums[i];
            }
        }
        System.out.println(mul);
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                ans[i] = mul;
            }
            else if(nums[i] != 0 && mul == 0){
                ans[i] = 0;
            }else {
            ans[i] =  Math.abs(mul/nums[i]);
            }
        }
        return ans;
        
    }
}