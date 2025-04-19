public class P74_Knigths_Tour {
    static int N = 5;

    public static boolean isSafe(int x, int y, int sol[][]){
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    public static void print(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++){
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveKT() {
        int sol[][] = new int[8][8];
        for (int x = 0; x < N; x++){
            for (int y = 0; y < N; y++){
                sol[x][y] = -1;
            }
        }
        int xm[] = {1,1,-1,-1,2,-2,2,-2};
        int ym[] = {2,-2,2,-2,1,1,-1,-1};
        //As the Knight starts from cell(0,0)
        sol[0][0] = 0;
        if (solveKTUtil(0, 0, 1, sol, xm, ym)) {
            print(sol);
        }else{
            System.out.println("Solution does not exist");
            return false;
        }
        return true;
    }
    
    public static boolean solveKTUtil(int x, int y, int move, int sol[][],int xm[],int ym[]) {
        if (move == N * N){
            return true;
        }
        for (int k = 0; k < 8; k++) {
            int next_x = x + xm[k];
            int next_y = y + ym[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = move;
                if (solveKTUtil(next_x, next_y, move + 1,sol, xm, ym)){
                    return true;
                }else{
                    sol[next_x][next_y] = -1; // backtracking
                }    
            }
        }
        return false;
    }

    public static void main(String args[]){
    solveKT();
    }    
}