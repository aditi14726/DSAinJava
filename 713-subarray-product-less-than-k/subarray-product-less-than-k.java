class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int p=1;
        int count=0;
        if (k<=1){
            return 0;
        }
        for (int right=0; right<nums.length; right++){
            p*=nums[right];
            while (p>= k){
                p=p/nums[left];
                left+=1;
            }
            count+=right-left+1;
        }
        return count;
    }
}