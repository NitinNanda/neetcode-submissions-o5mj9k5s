class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int s : stones) {
            minheap.offer(-s);
        }

        while(minheap.size() > 1){
            int first = minheap.poll();
            int second = minheap.poll();
            if(first != second){
                minheap.offer(first-second);
            }
        }
        minheap.offer(0);
        return Math.abs(minheap.peek());
    }
}
