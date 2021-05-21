import java.util.Scanner;
public class Matmul{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows and columns for the first matrix");
        int row1 = s.nextInt();
        int col1 = s.nextInt();
        System.out.println("enter tha values for the first matrix");
        int a[][] = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                int x = s.nextInt();
                a[i][j] = x;
            }
        }
        System.out.println("enter number of rows and columns for the second matrix");
        int row2 = s.nextInt();
        int col2 = s.nextInt();
        System.out.println("enter the values for the second matrix");
        int b[][] = new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                int x = s.nextInt();
                b[i][j] = x;
            }
        }
        int sum = 0;
        int result[][]  = new int[row1][col2];
        if(row1 != col2){
            System.out.println("the matrices cannot be multiplied");
        }
        else{
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        sum = sum+a[i][k]*b[k][j];
                    }
                    result[i][j] = sum;
                    sum =0;
                }
            }
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}