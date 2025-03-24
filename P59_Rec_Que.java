public class P59_Rec_Que {

    public static void occur(int arr[],int key,int i){
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        occur(arr, key, i+1);
    }

    static String digits[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void print(int n){
        if (n == 0) {
            return;
        }
        int ld = n % 10;
        print(n/10);
        System.out.print(digits[ld] + " ");
    }

    public static int length(String str){
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1))+1;
    }

    public static int count(String str,int i,int j,int n){
        if (n == 1) {
            return 1;
        }
        if (n <= 0){
            return 0;
        }
        int res = count(str, i+1, j, n-1) + count(str, i, j-1, n-1) - count(str, i+1, j-1, n-2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        //int arr[] = {3,2,4,5,6,2,7,2,2};
        //occur(arr, 2, 0);

        //print(1977);

        //System.out.println(length("ayush"));
        
        // String str = "abcab"; 
        // int n = str.length();
        // System.out.println(count(str,0,n-1,n));
    }
}
