class Solution {
    public int maxArea(int[] heights) {
        int p1=0;
        int p2=heights.length-1;
        int max =0;

        while(p1<p2){
            int width=p2-p1;
            int h = Math.min(heights[p1],heights[p2]);
            max= Math.max(max, width*h);
           
           if(heights[p1]<heights[p2]) p1++;
           else p2--;
        }
        return max;
    }
}
