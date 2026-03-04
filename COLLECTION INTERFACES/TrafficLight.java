public enum TrafficLight{
    RED("Stop"),
    GREEN("Go"),
    YELLOW("Alert");

   
    private final String action;

    public String getAction() {
        return action;
    }

    private TrafficLight(String action) {
        this.action = action;
    }

    

}