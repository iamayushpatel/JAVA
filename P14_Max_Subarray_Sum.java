public class P14_Max_Subarray_Sum {
    
    public static void maxSubarraySum1(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }
                System.out.println(" = "+currSum);
                if(maxSum < currSum){
                    maxSum=currSum;
                }
            }
          }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void maxSubarraySum2(int numbers[]) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                cs = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
                if(ms < cs){
                    ms=cs;
                }
            }
        }
        System.out.println("Max Sum : " + ms);
    }

    public static void maxSubarraySum3(int numbers[]) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            //ms=Math.max(cs,ms);
            if(ms<cs){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        System.out.println("Max Sum : " + ms);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-2,-6,-1};
        //int numbers[]={2,4,6};
        maxSubarraySum2(numbers);
    }
}
