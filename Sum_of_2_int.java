class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int original = a;
            a = a^b;
            b = (original&b)<<1;
        }
        return a;
    }
}
