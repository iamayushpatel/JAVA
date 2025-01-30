public class P8_Array {

    public static void change(int marks[],int num) {
        num = 13;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int num = 7;
        change(marks,num);
        
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println(num);
    }
}
