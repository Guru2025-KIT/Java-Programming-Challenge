import java.util.Scanner;

public class ArrayOccurence{
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=input.nextInt();

        int[] arr=Array(n);

        System.out.print("Enter Target Element: ");
        int target=input.nextInt();

        int count=Occurence(arr,target);
        if(count==0){
            System.out.print(target+" Element Not Present in the Array.");
        }else{
            System.out.print("Element "+target+ " Present "+count+" Times.");
        }

    }

    private static int[] Array(int n){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr[i]=input.nextInt();
        }

        return arr;
    }

    private static int Occurence(int[] arr,int target){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }

}