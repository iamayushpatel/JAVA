public class P26_Sub_String {

    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "Hello Ayush";
        System.out.println(str.substring(0,7));
        System.out.println(subString(str, 3, 5));
    }
}
