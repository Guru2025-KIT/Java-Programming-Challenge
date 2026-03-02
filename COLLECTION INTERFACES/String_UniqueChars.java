import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class String_UniqueChars {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String: ");
        String name=input.nextLine();

        uniqueChar(name);
        input.close();
    }

    public static void uniqueChar(String name){
        int i=0;
        Set<Character> chars=new HashSet<>();
        while(i<name.length()){
            chars.add(name.charAt(i));
            i++;
        }
        
        System.out.printf("Total Unique Characters in Name %s are %d.",name,chars.size());    
    }
    
}
