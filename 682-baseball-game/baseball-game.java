class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack =new Stack<>();
        for (int i=0; i< operations.length;i++){
            String op = operations[i];
            if (op.equals("C")){
                stack.pop();
            }
            else if (op.equals ("D")){
                stack.push(2*stack.peek());
            }
            else if (op.equals("+")){
                int first=stack.pop();
                int sec=stack.peek();
                stack.push(first);
                stack.push(first + sec);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
        sum += stack.pop();
        }
        return sum;
    }
}