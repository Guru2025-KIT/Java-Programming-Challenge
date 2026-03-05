package MultiThreding;

public class TestApplication {
    public static void main(String[] args) throws InterruptedException {

    TrafficApplication green=new TrafficApplication(Traffic.GREEN);
    TrafficApplication yellow=new TrafficApplication(Traffic.YELLOW);
    TrafficApplication red=new TrafficApplication(Traffic.RED);

    green.start();
    green.join();
    yellow.start();
    yellow.join();
    red.start();

    }
    
}
