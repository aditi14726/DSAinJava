class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int curr=0;
        int d=0;
        while (left < right){
            if (height[left]< height[right]){
                curr= height[left]*(right-left);
                d=Math.max(curr,d);
                left++;
            }
            else{
                curr=height[right] *(right-left);
                d=Math.max(curr,d);
                right--;
            }
        }
        return d;
    }
}