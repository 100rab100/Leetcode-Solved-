class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int rp=1;
    for (int i = 0; i < nums.length; i++) { //left pass
        result[i] = rp;
        rp *= nums[i];
    }
     rp=1;
    for (int i = nums.length - 1; i >= 0; i--) {//right pass
        result[i] *= rp;
        rp *= nums[i];
    }
    return result;
    }
}
