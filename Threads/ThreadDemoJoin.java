package Threads;
class Counter{
    int count;
    public void iterate(){
        count++;
    }
}

public class ThreadDemoJoin{
    public static void main(String[] args) {

        try{
            System.out.println("Welcome in the World of Threads!");

            Counter c1=new Counter();

            Runnable obj1=()->
            {
                for(int i=1;i<=100;i++){
                    c1.iterate();
                }
            };

            Runnable obj2=()->
            {
                for(int i=1;i<=100;i++){
                    c1.iterate();
                }
            };


            //Create the Threads for two objs
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);

            t1.start();
            t2.start();

            //Joins throws Exception if InterruptedException
            t1.join();
            t2.join();

            //Join Forces the Main to wait for othere Threads to come back

            System.out.println("In the Main Thread\nPrinting the Value of Count: "+c1.count);
        
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }   
            

        // Welcome in the World of Threads!
        // In the Main Thread
        // Printing the Value of Count: 200
    }
}