class Solution {
    public int[] twoSum(int[] numbers, int target) {
       HashMap <Integer,Integer> map = new HashMap<>();
       
        int [] ans = new int[2];
        for(int i = 0;i<numbers.length;i++){
            int difference = target - numbers[i];
            if(map.containsKey(difference)){
                ans[0] = map.get(difference)+1;
               ans[1] = i+1;
               return ans;

            }
        
            map.put(numbers[i],i);
        }

        return new int[]{};
        
    }
}