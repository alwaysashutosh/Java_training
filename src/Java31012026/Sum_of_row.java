package Java31012026;

public class Sum_of_row {
    public static void main(String[] args) {
        int [][] matrix={
                {10,11,12},
                {13,14,15},
                {16,17,18},
        };
        int sum=0;
        for( int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                sum=sum+matrix[i][j];
            }
        }
        System.out.println("Sum of matrix= "+sum);
    }
}