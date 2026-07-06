class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 2*n -1;
        int mid = right/2;
        int arr[] = new int[2*n];
        for(int i =0;i<n;i++){
            arr[left] = nums[left];
             arr[right] = nums[left];
            left++;

            right--;
        }
        return arr;
        
        
    }
}