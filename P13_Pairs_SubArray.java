public class P13_Pairs_SubArray {

    public static void printPairs(int numbers[]) {
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }

    public static void printSubarray(int numbers[]) {
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray : " + ts);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
        printSubarray(numbers);
    }
}
