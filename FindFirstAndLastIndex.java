package binarySearch;

public class FindFirstAndLastIndex {

    public static void main(String[] args) {

        int[] array = {2, 3, 3, 3, 4, 4, 4, 4};
        int target = 3;

        int i = 0;
        int j = array.length - 1;
        int firstIndex = 0;

        while (i <= j) {

            int mid = (i + (j - i) / 2);

            if (target == array[mid]) {

                j = mid - 1;

                firstIndex = mid;

            } else if (target > array[mid]) {

                i = mid + 1;

            } else if (target < array[mid]) {

                j = mid - 1;

            }
        }
        System.out.println( "First index : " + firstIndex);


        int k = 0;
        int l = array.length - 1;
        int lastIndex = 0;

        while (k <= l) {

            int mid = (k + (l - k) / 2);

            if (target == array[mid]) {

                k = mid + 1;

                lastIndex = mid;

            } else if (target > array[mid]) {

                k = mid + 1;

            } else if (target < array[mid]) {

                l = mid - 1;

            }
        }
        int t = lastIndex - firstIndex + 1;
        System.out.println("Last index : " +lastIndex);
        System.out.println("Total repeatation : "+ t);

    }
}
