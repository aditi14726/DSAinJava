class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int max_len = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                left = right + 1;
            }

            max_len = Math.max(max_len, (right - left) + 1);
        }

        return max_len;
    }
}