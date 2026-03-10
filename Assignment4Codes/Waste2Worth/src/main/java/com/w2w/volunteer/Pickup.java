package com.w2w.volunteer;

public class Pickup {
    private String pickupId;
    private String fromLocation;
    private String toLocation;
    private String status;

    public Pickup(String pickupId, String fromLocation, String toLocation) {
        this.pickupId = pickupId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.status = "Assigned";
    }

    public String getFromLocation() { return fromLocation; }
    public String getToLocation() { return toLocation; }
    public String getStatus() { return status; }
}
