class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(0, target, new ArrayList<>(), nums);
        return res;
    }

    public void dfs(int i, int target, List<Integer> cur, int[] nums) {
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int j = i; j < nums.length; j++) {
            if(nums[j] > target) break;
            cur.add(nums[j]);
            dfs(j, target-nums[j],cur, nums);
            cur.remove(cur.size()-1);
        }
    }
}
