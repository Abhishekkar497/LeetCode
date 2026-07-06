class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stable_heights = new ArrayList<>();
        int right = height.length;
        for(int i =0;i<height.length;i++){
           for(int j =i+1;j<height.length;j++){
             if(height[i] > threshold){
                stable_heights.add(j);
                break;
             }
           }
        }
        return stable_heights;
    }
}