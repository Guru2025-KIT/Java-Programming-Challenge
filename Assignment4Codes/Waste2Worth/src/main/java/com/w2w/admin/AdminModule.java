package com.w2w.admin;

public class AdminModule {
    public void verifyPickup(String pickupId) {
        System.out.println("[ADMIN MODULE] Pickup " + pickupId + " verified.");
    }

    public void showAnalytics() {
        System.out.println("[ADMIN MODULE] Total Donations: 15 | Total Requests: 8 | Deliveries: 10");
    }
}