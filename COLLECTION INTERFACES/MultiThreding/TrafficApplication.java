package MultiThreding;

public class TrafficApplication extends Thread{

    private final Traffic color;

    public TrafficApplication(Traffic color) {
        this.color = color;
    }

    @Override
    public void run() {
        
        
        try {
            System.out.printf("%s Active\n",color);
            Thread.sleep(color.getActiveTime());
        } catch (InterruptedException e) {
            System.out.printf("Error: %s",e.getMessage());
        }
        System.out.printf("%s Inactive\n",color);
    }
    
}
