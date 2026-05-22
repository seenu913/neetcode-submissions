class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] results = new int[len];
       Deque<Integer> stack = new ArrayDeque<>();
       for(int i=0;i<len;i++) {
        while(!stack.isEmpty() && 
            temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                results[index] = i - index;
            }
        stack.push(i);
       }
    return results;
    }
}
