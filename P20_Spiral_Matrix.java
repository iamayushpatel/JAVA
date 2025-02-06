public class P20_Spiral_Matrix {
    public static void printSpiral(int matrix[][]){
        
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {     
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}

// public static int[][] genSpiral(int m,int n){

//     int matrix[][] = new int[m][n];
//     int startRow = 0;
//     int startCol = 0;
//     int endRow = m-1;
//     int endCol = n-1;
//     int counter = 1;

//     while (startRow <= endRow && startCol <= endCol) {     
//         for(int j=startCol;j<=endCol;j++){
//             matrix[startRow][j] = counter++;
//         }
//         for(int i=startRow+1;i<=endRow;i++){
//             matrix[i][endCol] = counter++;
//         }
//         for(int j=endCol-1;j>=startCol;j--){
//             if(startRow == endRow){
//                 break;
//             }
//             matrix[endRow][j] = counter++;
//         }
//         for(int i=endRow-1;i>=startRow+1;i--){
//             if(startCol == endCol){
//                 break;
//             }
//             matrix[i][startCol] = counter++;
//         }
//         startCol++;
//         startRow++;
//         endCol--;
//         endRow--;
//     }
//     return matrix;
// }

// public static void printx(int matrix[][]){
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[i].length;j++){
//             System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
// }

// public static void main(String[] args) {
//     int matrix [][] = genSpiral(3,4);
//     printx(matrix);
// }