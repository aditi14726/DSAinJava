class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int max_len=0;
        int zero_count=0; 
        for (int right=0; right< nums.length; right++){
            if(nums[right]==0){
                zero_count+=1;
            }
            while (zero_count > k){
                if (nums[left]==0){
                    zero_count-=1;
                }
                left+=1;
            }
            max_len=Math.max(max_len,(right-left)+1);
        } 
        return max_len;
    }
}