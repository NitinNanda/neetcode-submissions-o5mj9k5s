class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for(int i : nums) {
            if(uniqueNums.contains(i)){
                return true;
            }
            uniqueNums.add(i);
        }
        return false;





















        // Set<Integer> set = new HashSet<>();
        // for(int num:nums) {
        //     if(set.contains(num)) return true;
        //     set.add(num);
        // }
        // return false;
    }
}