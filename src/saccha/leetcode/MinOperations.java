package saccha.leetcode;

public class MinOperations {
//  https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/submissions/
//  it took 466 ms. I have a doubt on this time complexity
    public int minOperations(int[] nums) {
        int count =0;
        for (int i =0;i<nums.length-1;i++){

            while(nums[i]>=nums[i+1]){
                nums[i+1]++;
                count++;
            }

        }
        return count;
    }
}
