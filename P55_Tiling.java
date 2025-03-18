public class P55_Tiling {
    
    public static int tilingProb(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        
        int fnm1 = tilingProb(n-1); // Vertical
        int fnm2 = tilingProb(n-2); // Horizontal

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tilingProb(4));
    }
}