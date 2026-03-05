public class TestDay {
    public static void main(String[] args) {
        System.out.println("Total Days in A week are:");

        for (Day day : Day.values()) {
            System.out.printf("%s - - - >%s\n",day,day.getType());
            
        }

       
    }

    
    
}
