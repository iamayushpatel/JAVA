public class P73_Keypad_Combi {
    final static char L [][] = { {},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
        {'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'} };

    public static void letterCombi(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        print(0, len, new StringBuilder(), D);
    }

    public static void print(int pos, int len, StringBuilder sb, String D) {
        if (pos == len){
            System.out.print(sb.toString() + " ");
        }else {
            char letters [] = L[Character.getNumericValue(D.charAt(pos))];
                for (int i = 0; i < letters.length; i++){
                    print(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
                }
        }
    }

    public static void main(String args[]){
        letterCombi("23");
    }
}