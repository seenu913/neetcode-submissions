class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i=0;i<bucket.length;i++) {
            bucket[i] = new ArrayList<>();
        }
       
        for(int num: numMap.keySet()){
            int freqVal = numMap.get(num);
            bucket[freqVal].add(num);
        }

        int[] freqArray = new int[k];
        int index = 0;

        for(int i=bucket.length-1; i>=0; i--){
            for(int num: bucket[i]){
                freqArray[index] = num;
                index++;

                if(index==k){
                    return freqArray;
                }
            }
        }
        return freqArray;
    }

}