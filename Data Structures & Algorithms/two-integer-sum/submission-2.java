class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};






















        
        // Map<Integer, Integer> seenMap = new HashMap<>();
        // int[] res = new int[2];
        // for(int i = 0; i< nums.length; i++) {
        //     if(seenMap.containsKey(target - nums[i])){
        //         res[0] = seenMap.get(target-nums[i]);
        //         res[1] = i;
        //     } else{
        //         seenMap.put(nums[i],i);
        //     }
        // }
        // return res;
    }
}
