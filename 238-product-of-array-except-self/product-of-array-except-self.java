class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        
        int rightProduct = 1;
        for (int i = 0; i < n; i++) {
            array[i] = rightProduct;
            rightProduct *= nums[i];
        }
        
        int leftProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            array[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        return array;
    }
}

