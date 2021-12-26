package binarySearch;

public class FindIndexString {
    public static void main(String[] args) {

        String [] words = {"a","aa","aaa","aaaa","ab"};
        String target = "ab";

        int a = -1;
        int i = 0;
        int j = words.length - 1;

        while(i <= j){

            int mid = (i + j) / 2;
            String t = words[mid];

            if (t.equals(target)) {

                a = mid;
                break;
            }
            else if (target.compareTo(t) < 0){

                j = mid - 1;
            }
            else if(target.compareTo(t) > 0){

                i = mid + 1;
            }
        }
        System.out.println(a);
    }
}
