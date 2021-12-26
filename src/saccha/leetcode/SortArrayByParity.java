package leetcode;

public class SortArrayByParity {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        boolean check = true;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                if (check) {
                    if (nums[j] % 2 == 0) {
                        arr[i] = nums[j];
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                } else {
                    if (nums[j] % 2 != 0) {
                        arr[i] = nums[j];
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }

            }
            if (check) {
                check = false;
            } else {
                check = true;
            }
        }
        return arr;
    }
}
