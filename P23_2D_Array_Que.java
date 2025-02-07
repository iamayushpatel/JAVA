public class P23_2D_Array_Que {
    
    public static void Check(int array[][]){
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Count Is : " + count);
    }

    // array.length = Row Size;
    // array[0].length = Column Size;

    public static void Sum2(int array[][]){
        int sum = 0;
            for(int j=0;j<array[0].length;j++){
                sum += array[1][j];
            }
            System.out.println("Sum Is : " + sum);
    }

    public static void Transpose(int matrix[][]){
        int row = 2, col = 3;
        int transpose[][] = new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        Print(transpose);
    }

    public static void Print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //int array[][] = {{4,7,8},{8,8,7}};
        //Check(array);
        int matrix[][] = {{2,3,7},{5,6,7}};
        Print(matrix);
        Transpose(matrix);   
    }
}