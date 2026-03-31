class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int[] res = new int[2];
        while(l < r){
            if(nums[l] + nums[r] > target){
                r--;
            } else if(nums[l] + nums[r] < target){
                l++;
            } else {
                res[0] = l+1;
                res[1] = r+1;
                break;
            }
        }
        return res;
    }
}
