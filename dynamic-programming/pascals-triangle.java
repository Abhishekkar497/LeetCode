class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            List<Integer> lt = new ArrayList<>();
            if(i==0){
               lt.add(1);
            }
            else if(i==1){
                lt.add(1);
                lt.add(1);
            }
            else {
                lt.add(1);
                List<Integer> prev = ans.get(i-1);
                for(int j=0;j<prev.size()-1;j++){
                    lt.add(prev.get(j)+prev.get(j+1));
                }
                lt.add(1);
            }
             ans.add(lt);
        }
        return ans;
    }
}