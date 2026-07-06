class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int difference =0;
        int x_differences[] = new int[points.length];
        for(int i =0; i<points.length;i++){
            x_differences[i] = points[i][0];
        }
        Arrays.sort(x_differences);
        for(int i =1;i<x_differences.length;i++){
            int x_difference = x_differences[i] -x_differences[i-1];
            difference = Math.max(x_difference,difference);
        }
        return difference;
    }
}