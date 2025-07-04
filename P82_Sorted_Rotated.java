import java.util.*;
public class P82_Sorted_Rotated {

    public static boolean pairSum2(ArrayList<Integer> list, int key){   // O(n)
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if (list.get(i)>list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp+1 , rp = bp;
        while (lp!=rp) {
            if (list.get(lp)+list.get(rp) == key) {
                return true;
            }
            if (list.get(lp)+list.get(rp) < key) {
                lp = (lp+1)%n;
            }else{
                rp = (rp+n-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);list.add(15);list.add(6);
        list.add(8);list.add(9);list.add(10);
        System.out.println(pairSum2(list, 16));
    }
}
