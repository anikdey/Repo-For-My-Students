package fahmida.encrypted;

public class ActualCode {

    public String encrypt(String letter,int offset){
        char[] c = letter.toCharArray();
        offset = offset % 26;

        for (int i = 0; i < c.length; i++){
            char currentChar = c[i];
            int encodedChar = currentChar + offset;
            if(currentChar >= 'A' && currentChar <= 'Z'){
                if(encodedChar > 90) {
                    encodedChar = encodedChar % 90 + 65 - 1;
                }
            }
            else {
                if(encodedChar > 122){
                    encodedChar = encodedChar % 122 + 97 - 1;
                }
            }
            c[i] = (char) encodedChar;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        ActualCode ac = new ActualCode();
        System.out.println(ac.encrypt("AZer",77));
    }
}
