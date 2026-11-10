class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_sum=0;
        for (int i=0;i<accounts.length; i++){
            int sum=0;
            for (int j=0; j< accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            max_sum=Math.max(sum, max_sum);
        }
        return max_sum;
    }
}