class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        int n = nums.length;
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % k == 0) a[i] = nums[i];
            else a[i] = Math.max(a[i - 1], nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0) b[i] = nums[i];
            else b[i] = Math.max(b[i + 1], nums[i]);
        }

        int[] result = new int[n - k + 1];
        for (int i = 0; i + k - 1 < n; i++) {
            result[i] = Math.max(b[i], a[i + k - 1]);
        }
        return result;
    }
}
