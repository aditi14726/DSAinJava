class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans= new int[nums.length];
        int k=nums.length-1;
        int left=0;
        int right=nums.length-1;
        while(left <= right){
            if (Math.abs(nums[left]) < Math.abs(nums[right])){
                ans[k]= nums[right] * nums[right];
                k--;
                right --;
            }
            else{
                ans[k]= nums[left] * nums[left];
                k--;
                left ++;
            }
        }
        return ans;
    }
}