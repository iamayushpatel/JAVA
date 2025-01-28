public class P1_Pattern {

    public static void Pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern3(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){   //for(int j=1;j<=n-i+1;j++);
                System.out.print(ch);
                 //System.out.print(i);
            }
            ch++;
            System.out.println();
        }
    }

    public static void Pattern4(int n){
        //int num = 1;
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }


    public static void main(String arggs[]){
        //Pattern1(5);
        //Pattern2(5);
        //Pattern3(5);
        Pattern4(5);
    }
    
}
