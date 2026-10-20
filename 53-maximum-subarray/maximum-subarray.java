class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_Sum = nums[0];

        for (int num : nums) {
            sum += num;
            max_Sum = Math.max(sum, max_Sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max_Sum;
    }
}