import java.util.*;
public class P81_Sorted_Sum {
    public static boolean pairSum1(ArrayList<Integer> list, int key){   // O(n^2)
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if (list.get(i)+list.get(j) == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int key){   // O(n)
        int lp = 0 , rp = list.size()-1;
        while (lp<rp) { // lp!=rp
            if (list.get(lp)+list.get(rp) == key) {
                return true;
            }
            if (list.get(lp)+list.get(rp) < key) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        list.add(4);list.add(5);
        System.out.println(pairSum2(list, 5));
    }
}
