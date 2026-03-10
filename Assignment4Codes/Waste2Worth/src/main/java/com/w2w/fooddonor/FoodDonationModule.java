package com.w2w.fooddonor;

import java.util.ArrayList;
import java.util.List;

public class FoodDonationModule {
    private List<DonatedFood> allFoods = new ArrayList<>();

    public void addFood(DonatedFood food) {
        allFoods.add(food);
    }

    public void listFoods() {
        System.out.println("\n--- Food Donations ---");
        for (DonatedFood f : allFoods) {
            System.out.println(f.getFoodName() + " | Qty: " + f.getQuantity() +
                    " | Expiry: " + f.getExpiryTime() + " | Urgent: " + f.isUrgent());
        }
    }
}
