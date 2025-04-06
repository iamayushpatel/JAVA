public class P71_Sudoku {
    public static boolean isSafe(int sudoku [][],int row,int col,int dig){
        // Column
        for(int i=0;i<9;i++){
            if (sudoku[i][col] == dig) {
                return false;
            }
        }
        // Row
        for(int j=0;j<9;j++){
            if (sudoku[row][j] == dig) {
                return false;
            }
        }
        // Grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[row][col] == dig){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku [][],int row,int col){
        if (row == 9) {
            return true;
        }

        int newRow = row, newCol = col+1;
        if (newCol == 9) {
            newRow = row+1;
            newCol = 0;
        }

        if (sudoku[row][col] != 0) {
           return sudokuSolver(sudoku, newRow, newCol);
        }

        for (int dig=1;dig<=9;dig++){
            if (isSafe(sudoku,row,col,dig)) {
                sudoku[row][col] = dig;
                if (sudokuSolver(sudoku, newRow, newCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku [][] = { {0,0,8,0,0,0,0,0,0},{4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},{0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}  };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution Does Not Exists");
        }
    }
}