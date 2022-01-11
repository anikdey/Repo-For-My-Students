package saccha.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr){


        for(int i = 1; i < arr.length; i++){

            int insert = i-1;
            int temp = arr[i];
            while (insert >= 0 && arr[insert]>temp){
                arr[insert+1] = arr[insert];
                insert--;
            }
            arr[insert+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr ={10,9,8,7,6,5,4,3,2,1};
        insertionSort(arr);

        for (int i : arr){
            System.out.print(i+",");
        }
    }
}
