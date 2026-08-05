class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int mul = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] !=0){
            mul*= nums[i];
            }
        }
        System.out.println(mul);
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                ans[i] = mul;
            }else {
            ans[i] =  mul/nums[i];
            }
        }
        return ans;
        
    }
}