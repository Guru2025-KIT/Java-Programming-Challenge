package LAMBDA;

import java.util.List;


public class OddNumberFiltering {
    public static void main(String[] args) {
        
        List<Integer> nums= List.of(1,2,3,4,5,6,7,8,9,10);
        //List<INTEGER> result=
        nums.stream()
                .filter(num -> (num%2!=0) )
                    .forEach(num-> System.out.println(num));
                    //. .collect(Collectors.toList());
       // System.out.println(result);
    }
    
}
