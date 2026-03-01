import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String fileName="Java-Complete-Course.txt";

        try(FileReader read=new FileReader(fileName)){
            int readChar=0;

            do{
                readChar=read.read();
                System.out.print((char)readChar);
            }while(readChar !=-1);

            System.out.println("\nFile Read Successful.");

        }catch(IOException e){
            System.out.printf("Error Occured: %s",e.getMessage());
        }
    }
    
}
