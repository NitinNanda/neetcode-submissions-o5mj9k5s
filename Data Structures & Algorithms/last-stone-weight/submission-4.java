class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : stones) {
            pq.offer(-i);
        }
        while(pq.size() > 1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1 != s2){
                pq.offer(s1-s2);
            }
        }
        return pq.isEmpty() ? 0 : Math.abs(pq.peek());
    }
}
