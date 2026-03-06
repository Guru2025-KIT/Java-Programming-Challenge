package LAMBDA;

import java.util.List;
import java.util.stream.Collectors;

public class StringPrintingStream {
    public static void main(String[] args) {
        //Task 1
        List<String> names= List.of("Guruprasad ","Tukaram ","Shinde");

        names.stream()
            .forEach(s-> System.out.println(s));

        List<String> strs=List.of("Guruprasad Shinde ","Bad","Is Learning Java","Student","From KG Coding");
   
        //Task2
       String result=  strs.stream()
                .filter(s -> s.length()>10)
                .collect(Collectors.joining(" "));

                System.out.print("Result: "+result);
    }
}
