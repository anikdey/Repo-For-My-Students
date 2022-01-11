package fahmida.encrypted;

public class EncryptedString {

        public static void main (String[]args){

        int offset = 27;
        String s = "xyzaKLABC";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int n = c;


            if (n > 64 && n < 91) {
                n = s.charAt(i) + offset;

                while (n > 90) {
                    n = n % 90 + 64;
                }
            } else {

                n = s.charAt(i) + offset;

                while (n > 122) {
                    n = n % 122 + 96;
                }
            }
            char st = (char) n;
            System.out.print(st);

        }
    }
}
