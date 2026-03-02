import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Swap_UsingIndex {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,4,3,2,5,6,8,9,10,21,24);

        System.out.println("Before Swap List: "+list);
        swap(list,1,5);
        System.out.println("After Swap List: "+list);

        System.out.println();
        System.out.println("List Before Reverse: "+list);
        reversed(list);
        System.out.println("List After Reverse: "+list);

    }

    public static void swap(List<Integer> list,int x,int y){
        int temp=list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }

    public static void reversed(List<Integer> list){
        Collections.reverse(list);
    }
    
}
