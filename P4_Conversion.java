public class P4_Conversion {
    
    public static void binToDec(int n) {
        int myNum=n;
        int pow=0;
        int decNum=0;

        while (n>0) {
            int rem=n%10;
            decNum=decNum+(rem*(int)Math.pow(2,pow));
            pow++;
            n/=10;
        }
        System.out.println("Decimal Of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;

        while (n>0) {
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println("Binary Of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        //binToDec(1010);
        decToBin(15);  
    }
}
