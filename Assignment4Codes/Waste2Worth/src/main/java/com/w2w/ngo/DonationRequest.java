package com.w2w.ngo;

public class DonationRequest {
    private String ngoName;
    private String itemRequested;
    private String status;

    public DonationRequest(String ngoName, String itemRequested) {
        this.ngoName = ngoName;
        this.itemRequested = itemRequested;
        this.status = "Pending";
    }

    public void display() {
        System.out.println("  Request -> " + itemRequested + " | Status: " + status);
    }

    public void setStatus(String status) { this.status = status; }
}
