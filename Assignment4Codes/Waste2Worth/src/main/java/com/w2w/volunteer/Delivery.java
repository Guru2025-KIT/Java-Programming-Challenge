package com.w2w.volunteer;

public class Delivery {
    private String deliveryId;
    private String item;
    private String status;

    public Delivery(String deliveryId, String item) {
        this.deliveryId = deliveryId;
        this.item = item;
        this.status = "In Transit";
    }

    public void complete() {
        this.status = "Delivered";
        System.out.println("[DELIVERY] " + item + " has been delivered!");
    }

    public String getStatus() { return status; }
}
