package saccha.encrypt;

public class CryptoGraph {

    public static String encrypt(String text,int offset){
        char[] ch = text.toCharArray();
        String output = "";

        offset = offset % 26;
        for(char c : ch){

            if (c >= 'A' && c <= 'Z'){
                int temp = c + offset;
                if (temp > 90){
                    temp -= 26;
                }
                output += (char) temp;
            }else if(c >= 'a' && c <= 'z'){
                int temp = c + offset;
                if (temp > 122){
                    temp -= 26;
                }
                output += (char) temp;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("xyzABC",30));
    }
}
