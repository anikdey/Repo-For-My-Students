package binarySearch;

public class CountNegNumberIn2dArray {
    public static void main(String[] args) {

        int [] [] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-2,-3,-4}};

        for(int i = 0; i < grid.length; i++){

            int [] a = grid[i];

            int firstNumber = 0;
            int currentNum = 0;

            int k = 0;
            int l = a.length - 1;

            while (k <= l){

                int mid = k + ((l - k) / 2);
                currentNum = a[mid];

                if(currentNum >= 0){

                    k = mid + 1;

                }
                else if(currentNum < 0){

                    firstNumber = mid;

                    l = mid - 1;

                }
            }
            if (firstNumber != 0) {
                System.out.println("array in negative number: " + (a.length - firstNumber));
            }
            else if(currentNum < 0 && firstNumber == 0){

                System.out.println("array in negative number: " + (a.length - firstNumber));
            }
            else if(firstNumber == 0){

                System.out.println("array in negative number: " + 0);
            }
        }
    }
}
