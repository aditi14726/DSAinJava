class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean alive = true;

            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {

                if (Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                }
                else if (Math.abs(asteroid) == stack.peek()) {
                    stack.pop();
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }
            if (alive) {
                stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}