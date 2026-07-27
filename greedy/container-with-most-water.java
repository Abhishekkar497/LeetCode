class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int ans = 0;
        while(low < high){
         int currentArea = Math.min(height[low],height[high] ) * (high -low);
         ans = Math.max(ans ,currentArea);
         if(height[low] < height[high]){
            low++;
         } else {
            high--;
         }
         
        }
        return ans;

    }
}