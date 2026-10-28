class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        boolean dup=false;
        for(int n: nums){
            if(!seen.isEmpty() && seen.contains(n)){
                dup = true;
            }else{
                seen.add(n);
            }
        }
        return dup; 
    }
}