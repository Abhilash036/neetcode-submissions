class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n =piles.length;
        Arrays.sort(piles);
        int l=1;
        int r=piles[n-1];
        Stack<Integer> stack = new Stack<>();
        while(l<=r){
            long sum=0;
            int mid = l+(r-l)/2;
            for(int num:piles){
                if(num<=mid) sum+=1;
                else if(num%mid>0) sum+=num/mid+1;
                else if (num%mid==0) sum+=num/mid;

            }
            if(sum<=h){
                r=mid-1;
                if(!stack.isEmpty()){
                    stack.pop();
                    stack.push(mid);
                }else{
                    stack.push(mid);
                }

            }

            else l=mid+1;
        }
        return stack.peek();
    }
}
