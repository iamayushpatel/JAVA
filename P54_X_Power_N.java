public class P54_X_Power_N {

    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x*power(x, n-1);
    }

    public static int optiPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPow = optiPower(x, n/2);
        int halfPowSqr = halfPow * halfPow;
        if(n%2 != 0){
            halfPowSqr = x * halfPowSqr; 
        }
        return halfPowSqr;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optiPower(2, 10));
    }
}
