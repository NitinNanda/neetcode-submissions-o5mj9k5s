class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0, count = 1;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int num : nums) {
            if(!set.contains(num-1)){
                int len = 1;
                while(set.contains(num+len)){
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;



        // Set<Integer> set = new HashSet<>();
        // for(int i : nums){
        //     set.add(i);
        // }
        // int longest = 0;
        // for(int num : set){
        //     if(!set.contains(num-1)){
        //         int length = 1;
        //         while(set.contains(num+length)){
        //             length++;
        //         }
        //         longest = Math.max(longest, length);
        //     }
        // }
        // return longest;
    }
}
