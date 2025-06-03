public class arrayTwoD {
    //    Q. 1

    //     public static void main(String[] args) {
    //         int [][] array = {{4,7,8},
    //                 { 8, 8, 7 } };

    //         int countOf7 = 0;
    //         for (int i = 0; i < array.length; i++) {
    //             for (int j = 0; j < array[0].length; j++) {
    //                 if (array[i][j] == 7) {
    //                     countOf7++;
    //                 }
    //             }
    //         }
    //         System.out.println("count of 7 is : " + countOf7);
    //     }
    // }

    // Q. 2

    // public static void main (String args[]){
    //     int [][] nums = {{1,4,9},{11,4,3},{2,2,3}};
    //     int sum = 0;

    //     for(int j= 0; j<nums[0].length; j++){
    //         sum += nums[1][j];
    //     }
    //     System.out.println("sum is : " +sum);    
    // }


    
    // Q.3

    public static void main(String args[]) {
        int row = 2, column = 3;
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
        printMatrix(matrix);

        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("the matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]  + "   ");
            }
        }
        }
}






