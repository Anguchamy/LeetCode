class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1;i<=n;i++) {
            if(n%i == 0) {
                k--;
                //System.out.println(i+"-"+k);
            }

            if(k==0) {
                return i;
            }
        }

        return -1;
    }
}