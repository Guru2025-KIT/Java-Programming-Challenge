import java.util.Scanner;

public class Searchin2D_Array{
    public static void main(String[] args){
        int [][] arr=ArrayUtil2D.insertArray();
        int row=arr.length;
        int col=arr[0].length;
        ArrayUtil2D.display(arr);

        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter Target Element: ");
        int target=input.nextInt();

        boolean isfound=ArrayUtil2D.Search(arr,target);
        if(isfound){
            System.out.print(target+" is Found in Array.");
        }else{
            System.out.print(target+" is Found in Array.");

        }
    }

}