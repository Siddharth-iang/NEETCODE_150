class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
         HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        } 

        //Create a min-heap and sort in A.O
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        //Push all elements in hashmap to min-heap and remove top elements > k
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            minHeap.add(entry);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        //Add all the ele in min-heap to result[]
        int result[] = new int[k];

        int i=0;
        while(!minHeap.isEmpty()){
            result[i++] = minHeap.poll().getKey();
        }

        return result;
    }
}
