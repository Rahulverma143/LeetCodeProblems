class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = fan(n);
        while(slow != fast){
            slow = fan(slow);
            fast = fan(fan(fast));
        }
        return slow == 1;
    }

    public int fan(int n){
        int res = 0;
        while(n > 0){
            int yu = n%10;
            res += yu * yu;
            n = n / 10;
        }
        return res;
    }
}