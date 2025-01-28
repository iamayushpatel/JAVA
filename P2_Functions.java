public class P2_Functions {
    
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static int nCr(int n,int r) {
        int factN=factorial(n);
        int factR=factorial(r);
        int factnMr=factorial(n-r);

        int nCr=factN/(factnMr * factR);
        return nCr;
    }
    public static void main(String[] args) {
        //swap(10,15);
        //System.out.println("Factorial = " + factorial(5));
        System.out.println("nCr = " + nCr(5,2));     
    }  
}
