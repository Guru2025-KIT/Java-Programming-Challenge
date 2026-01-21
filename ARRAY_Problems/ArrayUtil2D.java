import java.util.Scanner;

public class ArrayUtil2D{
    public static int[][] insertArray(){
        System.out.print("Enter Number of Rows: ");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        System.out.print("Enter Number of Columns: ");
        int col=input.nextInt();

        System.out.println("Enter Array Elements: ");
        int i=0,j=0;
        int[][] arr=new int[row][col];

        while(i<row){
            j=0;
            while(j<col){
            System.out.print("Enter Element ["+(i+1)+"] ["+(j+1)+"]: ");
            arr[i][j]=input.nextInt();
            j++;
            }
            System.out.println("");
            i++;
        }
         return arr;
 
    }

    public static void display(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
                int i=0;    int j=0;
       
        System.out.println("Array Elements Are: ");
        while(i<row){
             j=0;
            while(j<col){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static boolean Search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;

        int i=0,j=0;
        while(i<row){
            j=0;
            while(j<col){
                if(arr[i][j]==target){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

    public static void Sum_Avg(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;

        int i=0,j=0,sum=0;
        float avg=0.0f;
        while(i<row){
            j=0;
            while(j<col){
                
                sum+=arr[i][j];
                j++;
                
            }
            i++;
        }
        avg=(sum/2);

        System.out.print("\nSum of Array Elements: "+sum+"\nAverage of Array Elements:"+avg);

    }


}