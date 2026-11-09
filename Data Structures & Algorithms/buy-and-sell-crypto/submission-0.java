class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n:prices){
            min = Math.min(min,n);
            max = Math.max(max,n-min);
        }
        return max;
    }
}
