import java.util.Scanner;

public class MonthSwitch{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your Date of Month: ");
        int monthNum=input.nextInt();

        String month=Month(monthNum);
        System.out.println("Month Number:"+monthNum+"\nMonth Name:"+month);

    }

    public static String Month(int monthNum){
                switch(monthNum){

            case 1:
                    return "Jan";
            
            case 2:
                    return "Feb";

            case 3:
                    return "March";
            
            case 4:
                    return "April";

            case 5:
                    return "May";
            
            case 6:
                    return "June";
                
            case 8:
                    return "August";
            
            case 9:
                    return "Septmber";

            case 10:
                    return "October";
            
            case 7:
                    return "July";
                
            case 11:
                    return "November";
            
            case 12:
                    return "December";
            
            default:
                    return "Invalid Month Number!";

        }
    }
}