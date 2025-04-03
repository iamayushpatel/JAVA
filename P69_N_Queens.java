public class P69_N_Queens {
    public static boolean isSafe(char board [][],int row,int col){
        // Vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Dig left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // Dig right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static int count = 0; // Count
    // Void To Boolean
    public static void nQueens(char board [][],int row) {
        if(row == board.length){
            print(board);
            count ++; // Count
            return; // Return True;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1); // If (){Return True}
                board[row][j] = '_';
            }
        }
        // Return False
    }

    public static void print(char board [][]) {
        System.out.println("----- Chess Board -----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
            System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board [][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '_';
            }
        }
        nQueens(board, 0); // If()
        // True (Syso (Posible)) -> print(board)
        // Else (Syso (not Possible))
        System.out.println("Count Is : " + count); // Count
    }
}
