class Solution {
    public int getSum(int a, int b) {
        while(b > 0) {
            a++;
            b--;
        }

        if(b != 0){
            while(b != 0) {
                a--;
                b++;
            }
        }

        return a;
    }
}