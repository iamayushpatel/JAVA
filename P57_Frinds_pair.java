public class P57_Frinds_pair {

    public static int firndsPair(int n){
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        
        int fnm1 = firndsPair(n-1); // Single

        int fnm2 = firndsPair(n-2); 
        int pair = (n-1)*fnm2; // Pair

        return fnm1 + pair;
    }

    public static void main(String[] args) {
        System.out.println(firndsPair(3));
    }
}