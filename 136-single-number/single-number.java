class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            boolean duplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && temp == nums[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                ans = temp;
                break;
            }
        }
        return ans;
    }
}
