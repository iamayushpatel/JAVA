public class P3_Prime_Or_Not {
    
    public static boolean isPrime(int n) {
        if (n==2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }  
        }
        return true;
    }

    public static void rang(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // int n=13;
        // if(isPrime(n)){
        //     System.out.println("Prime Number");
        // }else{
        //     System.out.println("Not Prime Number");
        // }
        rang(5);
        //System.out.println(isPrime(5));
    }
}
