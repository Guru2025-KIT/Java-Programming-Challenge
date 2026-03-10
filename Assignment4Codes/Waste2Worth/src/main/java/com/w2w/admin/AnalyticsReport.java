package com.w2w.admin;

public class AnalyticsReport {
    private int totalDonations;
    private int totalRequests;
    private int totalDeliveries;

    public AnalyticsReport(int totalDonations, int totalRequests, int totalDeliveries) {
        this.totalDonations = totalDonations;
        this.totalRequests = totalRequests;
        this.totalDeliveries = totalDeliveries;
    }

    public void printReport() {
        System.out.println("\n=== Analytics Report ===");
        System.out.println("Total Donations : " + totalDonations);
        System.out.println("Total Requests  : " + totalRequests);
        System.out.println("Total Deliveries: " + totalDeliveries);
    }
}
