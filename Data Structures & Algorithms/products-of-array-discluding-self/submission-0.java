class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);


        for(int i = 1; i < nums.length; i++){
            left[i]=left[i-1]* nums[i-1];
            right[n-i-1]=right[n-i]* nums[n-i];
        }
        for(int i = 0; i < n; i++){
            output[i] = left[i] * right[i];
        }
        return output;
    }
}  
