public class P58_Binary_String {

    public static void binStr(int n,int lp,String str){
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binStr(n-1,0,str+"0"); // 1 , 1
        if (lp == 0) { // 1
            binStr(n-1,1,str+"1"); // 0 0
        }
    }

    public static void main(String[] args) {
        binStr(3, 0, ""); // 3 , 1 , ""
    }
}
