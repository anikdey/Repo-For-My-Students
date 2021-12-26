package binarySearch;

public class FindIndex {
    public static void main(String[] args) {

        int [] nums = {-4,-3,-2,-1,0,3,5,9,12};
        int target = -2;

        int i = 0;
        int j = nums.length - 1;
        int a = -1;

        while (i <= j) {

            int mid = (i + j) / 2;
            int currentNum = nums[mid];

            if (currentNum == target){

                a = mid;
                break;
            }
            else if(currentNum < target){

                i = mid + 1;
            }
            else if (currentNum > target){

                j = mid - 1;

            }
        }
        System.out.println(a);
    }
}
