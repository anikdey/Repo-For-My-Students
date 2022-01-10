package monirameem.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] nums) {

        int n = nums.length;

        for (int i = 1; i < n; i++){
            int num = nums[i];
            int j = i-1;

            while (j >= 0 && nums[j] > num){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = num;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {8,5,2,9,7,1,3,4};
        System.out.println(Arrays.toString(insertionSort(nums)));

    }

}
