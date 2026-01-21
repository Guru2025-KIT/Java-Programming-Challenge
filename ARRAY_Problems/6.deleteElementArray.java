import java.util.Scanner;

public class deleteElementArray{
    public static void main(String[] args){

        System.out.print("Enter the Array Elements:\n");
        int[] arr=ArrayUtility.inputArray();
        ArrayUtility.display(arr);
        
        System.out.print("\nEnter Element to delete:");
        Scanner input=new Scanner(System.in);
        int target=input.nextInt();

        int occurence=ArrayUtility.frequency(target,arr);
        int[] newArr=newArray(arr,occurence,target);

        System.out.print("Array Elements After Deletion:\n");
        ArrayUtility.display(newArr);

    }

    public static int[] newArray(int[] arr,int occurence,int target){
        int newSize=(arr.length-occurence);

        if(occurence==0){
            return arr;
        }
        int[] newArr=new int[newSize];
        int i=0,j=0;

        while(i<arr.length){
            if(arr[i]!=target){
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }
        return newArr;


    }
}