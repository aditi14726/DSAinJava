class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prev1=0;
        int prev2=1;
        int next=0;
        for (int i=0; i<n-1; i++){ 
            next=prev1+prev2;
            prev1= prev2;
            prev2=next;
        }
        return next;
    }
}