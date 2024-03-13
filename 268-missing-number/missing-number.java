public class Solution {
    public static int missingNumber(int[] nums) {
        int n = -999;
        for (int i = 0; i < nums.length; i++) {
            boolean exists = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                n = i;
                break;
            }
        }
        if(n==-999){
            n = nums.length;
        }
        return n;
    }
}
