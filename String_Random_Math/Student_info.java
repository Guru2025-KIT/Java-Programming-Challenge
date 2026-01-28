
public class Student_info{

     String name;
     int age;
     long  prn;
     String clg;

    public Student_info(String name,int age, long prn,String clg) {
        this.name = name;
        this.prn = prn;
        this.age=age;
        this.clg=clg;
    }

    @Override
    public String toString() {
        return "Student_info [name=" + name + ", age=" + age + ", prn=" + prn + ", clg=" + clg + "]";
    }

    public static void main(String[] args) {
        Student_info student=new Student_info("Guruprasad ",21, 242500236,"KIT");
        System.out.println(student);
    }

    
       

        
  
    
 
}