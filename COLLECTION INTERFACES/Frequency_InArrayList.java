import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency_InArrayList {

    public static void main(String[] args) {
        List<String> strs=Arrays.asList("Guru","Prasad","Guru","Prasad","Prasad","Shinde");
        System.out.println("Frequency of Guru is: "+Collections.frequency(strs, "Guru"));
        System.out.println("Frequency of Prasad is: "+Collections.frequency(strs, "Prasad"));
        System.out.println("Frequency of Shinde is: "+Collections.frequency(strs, "Shinde"));

        
    }
    
}
