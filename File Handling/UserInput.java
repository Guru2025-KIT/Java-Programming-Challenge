import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Name Of File To Open the File:");
        String fileName=input.nextLine();

        try(FileReader read=new FileReader(fileName)){
            int reader=0;
            while((reader=read.read()) !=-1){
                System.out.print((char)reader);
            }

        }catch(FileNotFoundException e){
            System.out.println("Error Occured: "+e.getMessage());
        }catch(IOException e){
            System.out.println("Error Occured: "+e.getMessage());
        }finally{
            input.close();
        }
    }
    
}
