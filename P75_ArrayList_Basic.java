import java.util.*;
public class P75_ArrayList_Basic {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1); //O(1)
        list.add(3);
        list.add(4);
        list.add(1,2); //O(n)
        System.out.println(list);
        System.out.println(list.get(1)); //O(1)
        list.remove(2); //O(n)
        System.out.println(list);
        list.set(1, 3); //O(n)
        System.out.println(list);
        System.out.println(list.contains(2)); //O(n)
        System.out.println(list.size());

        // Reverse ArrayList
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
    }
}