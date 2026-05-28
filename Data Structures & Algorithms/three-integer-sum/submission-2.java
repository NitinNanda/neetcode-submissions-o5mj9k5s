class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = nums.length-1;
            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0){
                    res.add(List.of(nums[i] , nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                } else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
        // List<List<Integer>> res = new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > 0) break;
        //     if(i>0 && nums[i] == nums[i-1]) continue;

        //     int l = i + 1, r = nums.length - 1;
        //     while(l<r) {
        //         int sum = nums[i] + nums[l] + nums[r];
        //         if(sum > 0){
        //             r--;
        //         } else if(sum < 0){
        //             l++;
        //         } else {
        //             res.add(Arrays.asList(nums[i], nums[l], nums[r]));
        //             l++;
        //             r--;
        //             while(l<r && nums[l] == nums[l-1]){
        //                 l++;
        //             }
        //         }
        //     }
        // }
        // return res;
    }
}
