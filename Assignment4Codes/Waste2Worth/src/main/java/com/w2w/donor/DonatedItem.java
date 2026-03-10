package com.w2w.donor;

public class DonatedItem {
    private String category;
    private int quantity;
    private String status;

    public DonatedItem(String category, int quantity) {
        this.category = category;
        this.quantity = quantity;
        this.status = "Pending";
    }

    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}