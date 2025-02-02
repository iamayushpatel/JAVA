public class P11_Binary_Search {

    public static int binSearch(int numbers[],int key) {
        int start=0,end=numbers.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]>key) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
 public static void main(String[] args) {
    int numbers[]={2,4,6,8,10,12,14,16};
    int key=72;
    System.out.println("Index for Key : " + binSearch(numbers, key));
 }   
}
