class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int ans = 0;
        while(low < high){
            System.out.print(low + " ");
            System.out.print(high + " ");

           int area = Math.min(height[low],height[high])*(high- low);
           ans= Math.max(area,ans);
           
           if(height[low] < height[high]){
            low++;
           }
           else {
            high--;
           }
        }
        return ans;
    }
}