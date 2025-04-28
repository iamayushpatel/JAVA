import java.util.*;
public class P76_Min_Max {

    public static void check(ArrayList<Integer> list){
        int smallest= Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(smallest > list.get(i)){
                smallest = list.get(i);
            }
            if(largest < list.get(i)){
                largest = list.get(i);
            }
        }
        System.out.println("Smallest Number : " + smallest);
        System.out.println("Largest Number : " + largest);
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        check(list);
    }
}
