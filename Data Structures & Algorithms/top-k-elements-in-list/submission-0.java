class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : numMap.keySet()) {
            int freq = numMap.get(num);

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(num);
        }

        int[] result = new int[k];

        int idx = 0;

        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[idx++] = num;
                }
            }
        }

        return result;
    }
}