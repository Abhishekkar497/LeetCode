class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int mul = 1;
        int zeroCount = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] !=0){
            mul*= nums[i];
            }else {
                zeroCount++;
            }
        }
        System.out.println(mul);
        for(int i =0;i<nums.length;i++){
            if(zeroCount > 1){
                ans[i] = 0;
            }
            else if(zeroCount ==1){
                if(nums[i] ==0){
                    ans[i] = mul;
                }
                else {
                    ans[i] = 0;
                }
            }
            else
             {
            ans[i] =  (mul/nums[i]);
            }
        }
        return ans;
        
    }
}