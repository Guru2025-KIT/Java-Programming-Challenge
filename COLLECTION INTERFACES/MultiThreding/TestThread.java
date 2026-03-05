package MultiThreding;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        HelloThread t1=new HelloThread(1);
        HelloThread t2=new HelloThread(2);

        System.out.println("Inside the Main: "+t1.getName()+" "+t1.getState());
        t1.start();
        System.out.println("After Start the Thread: "+t1.getName()+" "+t1.getState());
        Thread.sleep(100);
        System.out.println("After Sleep of  the Thread: "+t1.getName()+" "+t1.getState());
        t2.start();
        System.out.println("After Start of  the Thread: "+t2.getName()+" "+t2.getState());
        t2.join();
        System.out.println("After Join of  the Thread: "+t1.getName()+" "+t1.getState());



    }
    
}
