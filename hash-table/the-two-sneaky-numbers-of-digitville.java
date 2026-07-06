class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int count =0;

        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           for(int j= i+1;j<nums.length;j++){
             if(nums[i]==nums[j]){
               arr.add(nums[i]);
               break;
             }
           }
        }
        int [] ans = arr.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}