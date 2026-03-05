package MultiThreding;

public enum Traffic {
    RED(9000),
    YELLOW(5000),
    GREEN(3000);

    private final int activeTime;

    private Traffic(int activeTime) {
        this.activeTime = activeTime;
    }

    public int getActiveTime() {
        return activeTime;
    }

    
    
}
