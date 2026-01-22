import java.util.Scanner;

class GradeTernary{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter your Marks To Calculate Grade:");
        int marks=input.nextInt();

        String grade= (marks>80) ? "High":((marks>70) ? "Medium":"Low");

        System.out.println("Marks:"+marks+"\nGrade:"+grade);
    }
}