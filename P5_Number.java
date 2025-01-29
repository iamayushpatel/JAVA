public class P5_Number {

    public static void reverse(int n) {
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Reverse Num = " + rev);
    }

    public static void palindrome(int n) {
        int oriNum=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(oriNum==rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }

    public static void armstong(int length,int n) {
        int oriNum=n;
        int result=0;
        while(n!=0){
        int rem=n%10;
        result=result+(int)Math.pow(rem,length);
        n/=10;
        }
        if(oriNum==result){
            System.out.println("Armstorng Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        //reverse(125896);
        //palindrome(121);
        armstong(4,1634);
    }
}
