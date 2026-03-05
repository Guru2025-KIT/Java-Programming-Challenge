public enum Day {
    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private final boolean isWeekday;

    
    private Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }


    public String getType() {
        return isWeekday? "Weekday":"Weekend";
    }

    

    

    
    
}
