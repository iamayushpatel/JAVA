public class P37_Bit_Que {

    public static void swap(int a,int b){
        System.out.println("Before swap : A = " + a + " & B : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap : A = " + a + " & B : " + b);
    }

    public static void add(int n){
        System.out.println(n + " + 1" + " = " + -~n);
    }

    public static void lower(){
        for(char ch = 'A'; ch<= 'Z' ; ch++){
            System.out.print((char)(ch | ' '));
            //System.out.print((char)(ch & '_'));
        }
    }

    // public static void check(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print((char)(str.charAt(i) & '_'));
    //     }
    // }

    public static void main(String[] args) {
        //swap(10, 13);
        //add(6);
        lower();
        //check("Ayush");
    }
}
