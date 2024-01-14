class Solution {
    public void sortColors(int[] nums) {
        int one = 0, two = 0, zero = 0;

        int i=0;
        for(;i<nums.length;i++) {
            if(nums[i] == 0) {
                zero++;
            } else if(nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        i = 0;

        while(zero-->0) {
            nums[i++] = 0;
        }

        while(one-->0) {
            nums[i++] = 1;
        }
        
        while(two-->0) {
            nums[i++] = 2;
        }
    
    }
}