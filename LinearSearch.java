package exercise;

public class LinearSearch {

    public static void main(String[] args) {


        int[] array = {2,23,46,54,98,34,12,11,23};
        int n = 98;
        int m = -1;

//        int m = -1;
//
//        for(int i = 0; i < array.length; i++){
//
//            if (array[i] == n){
//                m = i;
//            }
//        }
//        System.out.println(m);

        int left = 0;
        int right = array.length - 1;

        while (left <= right){

            if (array[left] == n){
                m = left;
            }
            if(array[right] == n){
                m = right;
            }
            left++;
            right--;
        }
        System.out.println(m);
    }
}
