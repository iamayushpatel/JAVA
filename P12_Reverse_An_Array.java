public class P12_Reverse_An_Array {
    
    public static void reverse(int numbers[]) {
        int first=0,last=numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
        
        // for(int i = numbers.length-1;i>=0;i--){
        //     System.out.print(numbers[i] + " ");
        // }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,15,10,12};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
