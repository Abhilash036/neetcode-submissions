class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] a = new int[26];
        int max =0;
        int count=0;
        int j=0;
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'A']++;
            max=Math.max(a[s.charAt(i)-'A'],max);
            while ((i - j + 1) - max > k) {
                a[s.charAt(j) - 'A']--;
                j++;
            }
            count = Math.max(count, i - j + 1);
        }
        return count;
    }
}
