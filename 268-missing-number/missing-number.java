class Solution {
    public int missingNumber(int[] nums) {
        int arr_len=nums.length;
        int actual_sum=0; 
        int sum_expected= (arr_len*(arr_len+1))/2;
        for (int i=0; i< arr_len;i++){
            actual_sum+=nums[i];
        }
        return sum_expected-actual_sum;
    }
}