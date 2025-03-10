public class P50_Factorial_Sum {

    public static int fact(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }

    public static int sum(int n) {
        if (n==1) {
            return 1;
        }
        int ans = n+sum(n-1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
}
