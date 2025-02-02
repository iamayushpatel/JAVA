public class P10_Small_Or_Large {
    
    public static void Check(int numbers[]) {
        int smallest= Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.println("Smallest Number : " + smallest);
        System.out.println("Largest Number : " + largest);
    }
    public static void main(String[] args) {
        int numbers[]={1,5,6,3,2};
        Check(numbers);
    }
}