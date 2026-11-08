class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        for(int i=0;i<m;i++){
            int n = matrix[i].length;
            int l=0;
            int r=n-1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(target==matrix[i][mid]){
                    return true;
                }else if(target>matrix[i][mid]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return false;
    }
}
