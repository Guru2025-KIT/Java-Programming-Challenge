package com.w2w.fooddonor;

public class DonatedFood {
    private String foodName;
    private int quantity;
    private String expiryTime;
    private boolean urgent;

    public DonatedFood(String foodName, int quantity, String expiryTime, boolean urgent) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.expiryTime = expiryTime;
        this.urgent = urgent;
    }

    public String getFoodName() { return foodName; }
    public int getQuantity() { return quantity; }
    public String getExpiryTime() { return expiryTime; }
    public boolean isUrgent() { return urgent; }
}
