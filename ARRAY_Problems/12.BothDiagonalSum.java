import java.util.Scanner;

public class BothDiagonalSum{
    public static void main(String[] args){
        int[][] arr=ArrayUtil2D.insertArray();
        ArrayUtil2D.display(arr);

        int sum=sumOfDiagonal(arr);

        System.out.print("Sum of Diagonal Elements : "+sum);
    }

    public static int sumOfDiagonal(int[][] arr){
        int row=arr.length;

        int leftSum=leftDiagonalSum(arr);
        int rightSum=rightDiagonalSum(arr);
        int sum=leftSum+rightSum;

        if(arr.length%2 !=0){
            int index=(arr.length)/2;
            sum-=arr[index][index];
        }

        return sum;
    }

    public static int leftDiagonalSum(int[][] arr){
        int row=arr.length;
        int i=0;
        int leftSum=0;

        while(i<row){
            leftSum+=arr[i][i];
            i++;
        }
        return leftSum;
    }

    public static int rightDiagonalSum(int[][] arr){
        int row=arr.length;
        int i=0;
        int rightSum=0;

        while(i<row){
            int j=arr.length-1-i;
            rightSum+=arr[i][j];
            i++;
        }
        return rightSum;
    }

}