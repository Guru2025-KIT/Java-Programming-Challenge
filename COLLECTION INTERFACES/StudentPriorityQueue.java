import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    private static class student{

        private final String name;
        private final char  grade;

        
        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }


        // public String getName() {
        //     return name;
        // }


        public char getGrade() {
            return grade;
        }


        @Override
        public String toString() {
            return name+" "+grade;
        }

        
        
    }

    public static void main(String[] args) {
        
        PriorityQueue<student> queue=new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(student stu,student t1){
                return stu.getGrade()-t1.getGrade();
            }
        });
     
        student student1=new student("Guruprasad",'A');
        student student2=new student("Shahu",'C');
        student student3=new student("Soham",'B');
        student student4=new student("Vivek",'A');
        student student5=new student("Sanket",'D');

        queue.offer(student1);
        queue.offer(student2);
        queue.offer(student3);
        queue.offer(student4);
        queue.offer(student5);

        System.out.println(queue.toString());

        System.out.println();

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());





    }
    
}
