import java.util.Scanner;

public class MergeSortedArrays{
    public static void main(String[] args){
        System.out.println("Enter Elements of Array: ");
        int[] arr1=ArrayUtility.inputArray();
        System.out.println("");
        int[] arr2=ArrayUtility.inputArray();

        ArrayUtility.display(arr1);
        ArrayUtility.display(arr2);

        System.out.print("\n\nFinal Merged Sorted Array is: ");
        ArrayUtility.display(merged(arr1,arr2));

    

        
    }

    public static int[] merged(int[] arr1,int[] arr2){
        int i=0;
        int j=0;

        //to know which one is bigger array.
        int k=0;
        int maxSize=(arr1.length+arr2.length);
        int[] newArr=new int[maxSize];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                newArr[k]=arr1[i];
                i++;
            }else{
                newArr[k]=arr2[j];
                j++;
            }
            k++;  
        }

        while(i<(arr1.length)){
            newArr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<(arr2.length)){
            newArr[k]=arr2[j];
            k++;
            j++;
        }
        return newArr;

    }
}