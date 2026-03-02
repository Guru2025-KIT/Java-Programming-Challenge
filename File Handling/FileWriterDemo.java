import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String FileName="Java-Complete-Course.txt";
        String[] words={"Do Watch the Entire Video!\n","Subscribe to Channel!\n","Comment Which Course you Want Next"};

        try(FileWriter writer=new FileWriter(FileName)){
            writer.write("Hello All. Welcome in the Complete Java Certification Course!\n");
            writer.write("*************************************************************\n");
            for(String one:words){
                writer.write(one);
            }

            System.out.println("File Written Successfully!");
        }catch(IOException e){
            System.out.printf("Error Occured: %s",e.getMessage());
        }finally{
            System.out.println("Existing....");
            
        }
        
    }  
    
}
