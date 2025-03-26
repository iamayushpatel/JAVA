public class P60_TOH {

    public static void towerOfHanoi(int n, char from, char to, char helper){
        if (n == 1){
            System.out.println("Take disk 1 from rod " +  from + " to rod " + to);
            return;
        }
        towerOfHanoi(n-1, from, helper, to);
        System.out.println("Take disk " + n + " from rod " +  from + " to rod " + to);
        towerOfHanoi(n-1, helper, to, from);
    }

    public static void main(String args[]){
        towerOfHanoi(3,'A','C', 'B');
    }
}