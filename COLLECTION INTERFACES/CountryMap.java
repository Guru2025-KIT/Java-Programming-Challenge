import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryRecord=new HashMap<>();

        //Map entries
        countryRecord.put("India","New Delhi");
        countryRecord.put("Pakistan","Islamabad");
        countryRecord.put("USA","Washington");
        countryRecord.put("China","Beijing");
        countryRecord.put("Shrilanka","Colombo");
        countryRecord.put("Iran","Tehran ");

        try(Scanner input=new Scanner(System.in)){
            System.out.print("Enter Country Name: ");
            String Country=input.nextLine();
            if(countryRecord.containsKey(Country)){
                System.out.printf("Country: %s\nCapital:%s\n\n",Country,countryRecord.get(Country));
            }else{
                System.out.printf("Not Present in The Map.\nCountry: %s Not Present in The Map.\nCapital: Unknown\n",Country);
            }
        }
        
    }
    
}
