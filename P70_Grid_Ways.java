public class P70_Grid_Ways {
    public static int gridWays(int i,int j,int n,int m){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }    

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }

    public static int fact(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }
    public static int mgridWays(int n,int m){
        int sum = fact((n-1)+(m-1));
        int nm1 = fact(n-1);
        int mm1 = fact(m-1);
        int ans = sum / (nm1*mm1);

        return ans;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        //System.out.println(gridWays(0, 0, n, m));
        System.out.println(mgridWays(n, m));
    }
}
