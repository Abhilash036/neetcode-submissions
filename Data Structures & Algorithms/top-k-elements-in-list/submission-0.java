class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int[] arr = new int[k];
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        List<Integer> topK = list.subList(0, k);
        int i=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(i<k && topK.contains(e.getValue())){
                arr[i]=e.getKey();
                i++;
            }
        }
        return arr;
    }
}
