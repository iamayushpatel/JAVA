public class P22_Search_In_Sorted {
    
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0 , col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println("Found Key At : (" + row +"," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not Found !");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8}};
        int key = 7;
        staircaseSearch(matrix, key);
    }
}
