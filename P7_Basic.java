import java.util.*;
public class P7_Basic {

    public static void Leap(int n) {
        boolean x=(n%4)==0;
        boolean y=(n%100)!=0;
        boolean z=((n%100)==0 && (n%400)==0);
        
        if (x&&(y||z)) {
            System.out.println("Leap Year");   
        }else{
            System.out.println("Not Leap Year");   
        }
    }

    public static void Table(int n) {
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    public static int Sum(int n) {
        int sum=0;
        while (n>0) {
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Leap(2000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        Table(num);
        //System.out.println(Sum(1001));
        sc.close();
    }
}
