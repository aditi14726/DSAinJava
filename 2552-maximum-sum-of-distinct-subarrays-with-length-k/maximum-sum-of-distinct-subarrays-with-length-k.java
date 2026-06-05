class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long sum=0;
        long max_sum=0;
        HashSet<Integer> set=new HashSet<>();
        for (int right=0; right<= nums.length-1;right++){
            while (set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right]; 
            if ((right-left)+1 == k){
                max_sum=Math.max(max_sum,sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return max_sum;
    }
}