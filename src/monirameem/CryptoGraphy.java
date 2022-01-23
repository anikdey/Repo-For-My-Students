package monirameem;

public class CryptoGraphy {

    public static String encrypted(String sentence, int k) {

        char[] chars = sentence.toCharArray();
        k = k % 26;

        for (char c : chars){
            int charInt = c + k;

            if (c >= 'a' && c <= 'z'){

            }

        }
       return null;
    }

}
