public class ConcatenateStrings {
    
    public static String String_Concatenation(String ... str){
       
            //result=result+string;  ------->Creates Multiple Strings. Better way Use String Builder.
            StringBuilder sb=new StringBuilder();
          for (String str2 : str) {
            sb.append(str2).append(" ");
          }
     
      return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("The Final Concatinated Result is: "+String_Concatenation("Guru","Prasad","Tukaram","Shinde"));
        System.out.println("The Final Concatinated Result is: "+String_Concatenation("Shahu","Anand","Mangalekar"));
        System.out.println("The Final Concatinated Result is: "+String_Concatenation("Shiv","Shinde"));
  
  
    }
    
}
