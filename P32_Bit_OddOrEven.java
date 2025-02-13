public class P32_Bit_OddOrEven {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
         oddOrEven(10);
         oddOrEven(13);
    }
}
