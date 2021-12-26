package binarySearch;

public class CountNegNumber {
    public static void main(String[] args) {

        //int [] array = {4,3,2,-1};
        //int [] array = {3,2,1,-1};
        //int [] array = {1,1,-1,-2};
        int [] array = {-1,-1,-2,-3};

        int firstNumber = 0;
        int currentNum = 0;

        int i = 0;
        int j = array.length - 1;

        while (i <= j){

            int mid = i + ((j - i) / 2);
            currentNum = array[mid];

            if(currentNum >= 0){

                i = mid + 1;

            }
            else if(currentNum < 0){

                firstNumber = mid;

                j = mid - 1;

            }
        }
        if (firstNumber != 0) {
            System.out.println("array in negative number: " + (array.length - firstNumber));
        }
        else if(currentNum < 0 && firstNumber == 0){

            System.out.println("array in negative number: " + (array.length - firstNumber));
        }
        else if(firstNumber == 0){

            System.out.println("array in negative number: " + 0);
        }
    }
}
