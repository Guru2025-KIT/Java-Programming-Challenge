import java.util.Scanner;

public class MultiplicatinTableANDForEach{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Number to Find it's Table:");
        int num=input.nextInt();

        int[] arr=new int[10];

        for(int i=1;i<=10;i++){
            arr[i-1]=i*num;
        }

        //Display of Table.
        for(int i:arr){
            System.out.println(i);
        }

        //Array maximum element.
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<10;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("Maximum Array Element is: "+max);
        System.out.println("Minimum Array Element is: "+min);

    }
}