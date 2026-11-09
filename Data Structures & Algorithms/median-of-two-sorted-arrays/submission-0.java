class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m+n];
        int i=0;
        int j =0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[k]=nums1[i];
                i++;
                k++;
            }
            else {
                temp[k]=nums2[j];
                k++;
                j++;
            }
        }

        while(i<m){
            temp[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            temp[k]=nums2[j];
            k++;
            j++;
        }

        if(temp.length %2 ==0) return (temp[((m+n)/2)-1] + temp[(m+n)/2])/2.0;
        else return temp[(m+n)/2];

    }
}
