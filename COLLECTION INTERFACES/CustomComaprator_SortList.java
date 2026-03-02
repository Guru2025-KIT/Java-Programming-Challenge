import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComaprator_SortList {

    public static void main(String[] args) {
        List<String> strs=Arrays.asList("Guru","Prasad","Tukaram","Shinde");
        System.out.println("Before: "+strs);
        SortDesceding(strs);
        System.out.println("After: "+strs);
    }

    public static void SortDesceding(List<String> strs){
        Collections.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String s,String t1){
                if(s.equals(t1)){
                    return 0;
                }else if(s.charAt(0)<t1.charAt(0)){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
    }
    
}
