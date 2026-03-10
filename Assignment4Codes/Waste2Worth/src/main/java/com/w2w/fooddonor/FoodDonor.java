package com.w2w.fooddonor;

import com.w2w.common.User;
import java.util.ArrayList;
import java.util.List;

public class FoodDonor extends User {
    private List<DonatedFood> foodList = new ArrayList<>();

    public FoodDonor(String id, String name, String email) {
        super(id, name, email);
    }

    public void donateFood(DonatedFood food) {
        foodList.add(food);
        System.out.println("[FOOD DONOR] " + name + " donated: " + food.getFoodName() + (food.isUrgent() ? " [URGENT]" : ""));
    }

    public void trackStatus() {
        System.out.println("\n[FOOD DONOR STATUS] " + name + " donated " + foodList.size() + " food item(s).");
    }
}
